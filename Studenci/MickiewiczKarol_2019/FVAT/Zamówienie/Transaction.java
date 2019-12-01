package Zamówienie;

import Osoba.Client;
import Osoba.Seller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Transaction {

    private Seller seller;
    private Client client;
    private List<Product> zamowienie;
    private Facture facture;
    private Date dataZapłaty;
    private Date dataSprzedaży;

    public Transaction(Seller seller, Client client, Facture facture, Date dataZapłaty, Date dataSprzedaży, List<Product> zamowienie) {
        this.seller = seller;
        this.client = client;
        this.zamowienie = zamowienie;
        this.facture = facture;
        this.dataZapłaty = dataZapłaty;
        this.dataSprzedaży = dataSprzedaży;
    }

    public void wypiszDaneTransakcji() {
        System.out.println(seller.toString());
        System.out.println(client.toString());
        for (Product element : zamowienie) {
            System.out.println(element.toString());
        }
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'godz.' HH:mm");
        System.out.printf("Date of payment: ");
        System.out.println(formatter.format(dataZapłaty));
        System.out.printf("Sale date: ");
        System.out.println(formatter.format(dataSprzedaży));
        System.out.println(facture.toString());
    }
}
