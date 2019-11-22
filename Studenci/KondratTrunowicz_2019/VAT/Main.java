import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main{
    public static void main(String[] args){
    Client client = new Client("Wojtek Kowalski", "ul. Poziomowa 31B", 1234123, 5678123);
    Client client2 = new Client("Tomek Krowa", "ul. jagodwa 18", 5678123, 1234123);
    Item item = new Item("Laptop", 2, 200, 1);
    Item item2 = new Item("Pizza", 5, 30, 1);
    Faktura faktura = new Faktura (client, client2);
    faktura.additem(item);
    faktura.additem(item2);
    faktura.setClosingprice(faktura.sumbrutto());
    faktura.setPayedtime("2019-11-23");
    faktura.setSoldtime("2019-11-23");
    System.out.println("FAKTURA");
    System.out.println("Przedmioty");
    faktura.wypiszitems();
    System.out.println("Cena końcowa: " + faktura.getClosingprice() );
    System.out.println("Kupujacy: ");
    client.wypiszClient();
    System.out.println("Sprzedajacy: ");
    client2.wypiszClient();
    System.out.println("Numer Faktury: " + faktura.getVolume());
    //System.out.println(faktura.wypiszTimes());
    faktura.wypiszTimes();
    }
}