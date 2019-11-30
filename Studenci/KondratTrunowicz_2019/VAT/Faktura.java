import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.time.LocalDateTime;
import org.junit.*;
import java.time.LocalDate;
import java.util.Date;

public class Faktura {
    private ArrayList<Item> itemslist;
    private String generatedtime;
    private String soldtime;
    private String payedtime;
    private double sum;
    private double closingprice;
    private int volume;
    public static int numer = 0;

    public Faktura(Client seller, Client buyer) {
        numer=numer+1;
        this.volume = numer;
        this.itemslist = new ArrayList<>();
        this.closingprice = sumbrutto();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        this.generatedtime = ft.format(currentDate);
        //seller.wypiszClientbezBanku();
        //buyer.wypiszClient();
        //this.soldtime = soldtime;
        //this.payedtime = payedtime;
    }

    public void additem(Item item) {
        this.itemslist.add(item);
    }

    public double sumbrutto() {
        this.sum = 0;
        itemslist = getItems();
        for (int i = 0; i < itemslist.size(); i++)
            this.sum = this.sum + itemslist.get(i).getBrutto();
        return this.sum;
    }

    public void wypiszitems() {
        itemslist = getItems();
        for (int i = 0; i < itemslist.size(); i++) {
            itemslist.get(i).wypiszItem();
        }
    }
    public void wypiszTimes() {
        System.out.printf("Faktura została wygenerowawa:");
        System.out.println(generatedtime);
        System.out.printf("Data Wystawienia Opłaty ");
        System.out.println(soldtime);
        System.out.printf("Data Wpłaty na Konto ");
        System.out.println(payedtime);
    }
    public ArrayList<Item> getItems() {
        return itemslist;
    }

    public String getGeneratedtime()
    {
        return generatedtime;
    }

    public String getSoldtime() {
        return soldtime;
    }

    public void setSoldtime(String soldtime) {
        this.soldtime = soldtime;
    }

    public String getPayedtime() {
        return payedtime;
    }

    public void setPayedtime(String payedtime) {
        this.payedtime = payedtime;
    }

    public double getClosingprice() {
        return closingprice;
    }

    public void setClosingprice(double closingprice) {
        this.closingprice = closingprice;
    }

    public int getVolume() {
        return volume;
    }
}
