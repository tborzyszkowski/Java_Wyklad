package Zamówienie;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Facture {

    private int factureNumber;
    private static List<Integer> generatorNumerów = new ArrayList<>();
    private String invoiceDate;
    private Product product;
    private List<Product> zamowienie;

    public Facture(List<Product> zamowienie) {
        // Wygenerowany numer faktury
        this.factureNumber = nadajNumerFaktury();
        this.invoiceDate = utworzDatęWystawieniaFaktury();
        this.zamowienie = zamowienie;
    }

    private int nadajNumerFaktury() {
        generatorNumerów.add(generatorNumerów.size()+1);
        return generatorNumerów.size();
    }

    private String utworzDatęWystawieniaFaktury() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'godz.' HH:mm");
        Date date = new Date(System.currentTimeMillis());
        return invoiceDate = formatter.format(date);
    }

    public int getNumerFaktury() {
        return factureNumber;
    }

    public String getDataWystawieniaFaktury() {
        return invoiceDate;
    }

    public double zsumujCenęBruttoZeWszystkichPozycji() {
        double tmp = 0;
        for (Product pozycja: zamowienie) {
            tmp += pozycja.getBruttoPosition();
        }
        return tmp;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "factureNumber=" + factureNumber +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", total facture value (sum of gross prices from all items)=" +zsumujCenęBruttoZeWszystkichPozycji() + " zł" +
                '}';
    }
}
