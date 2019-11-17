import Osoba.Client;
import Osoba.Seller;
import Zamówienie.Facture;
import Zamówienie.Product;
import Zamówienie.Transaction;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Seller seller = new Seller("Januszex", "Grunwaldzka 9, 82-035 Gdańsk",
                "3788044349", "39823310140698838410509712");

        Client client = new Client("Tadeusz Maruda", "Parzyniechy 2, 015-023",
                "5296392821");

        Product laptop_dell = new Product("Laptop Dell", 1, 2500);
        Product myszka = new Product("Myszka", 1, 100);
        Product słuchawki_ze_średniej_półki = new Product("Słuchawki ze średniej półki", 1, 1600);

        List<Product> zamowienie = new ArrayList<>();
        zamowienie.add(laptop_dell);
        zamowienie.add(myszka);
        zamowienie.add(słuchawki_ze_średniej_półki);

        Facture facture = new Facture(zamowienie);

        Date dataZapłaty = new GregorianCalendar(2019, Calendar.NOVEMBER, 11,
                12, 13).getTime();

        Date dataSprzedaży = new GregorianCalendar(2019, Calendar.NOVEMBER, 12,
                14, 55).getTime();

        Transaction transaction1 = new Transaction(seller, client, facture, dataZapłaty, dataSprzedaży);

        transaction1.wypiszDaneTransakcji();

    }

}
