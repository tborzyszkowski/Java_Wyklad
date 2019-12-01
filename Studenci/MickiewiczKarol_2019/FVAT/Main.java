import Osoba.Client;
import Osoba.Seller;
import Zamówienie.Facture;
import Zamówienie.Product;
import Zamówienie.Transaction;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Seller seller = new Seller("Electronex", "Grunwaldzka 9, 82-035 Gdańsk",
                "3788044349", "39823310140698838410509712");

        Client client = new Client("Jan Kowalski", "Tczew 2, 015-023",
                "5296392821");

        Product laptop_dell = new Product("Laptop Dell", 1, 2500);
        laptop_dell.countNettoPosition(laptop_dell.getCount(), laptop_dell.getNetto());
        laptop_dell.countBruttoPosition(laptop_dell.getNettoPosition(), laptop_dell.getVat());

        Product myszka = new Product("Myszka", 1, 100);
        myszka.countNettoPosition(myszka.getCount(), myszka.getNetto());
        myszka.countBruttoPosition(myszka.getNettoPosition(), myszka.getVat());

        Product słuchawki = new Product("Słuchawki", 1, 1600);
        słuchawki.countNettoPosition(słuchawki.getCount(), słuchawki.getNetto());
        słuchawki.countBruttoPosition(słuchawki.getNettoPosition(), słuchawki.getVat());

        List<Product> zamowienie = new ArrayList<>();
        zamowienie.add(laptop_dell);
        zamowienie.add(myszka);
        zamowienie.add(słuchawki);

        Facture facture = new Facture(zamowienie);

        Date dataZapłaty = new GregorianCalendar(2019, Calendar.NOVEMBER, 11,
                12, 13).getTime();

        Date dataSprzedaży = new GregorianCalendar(2019, Calendar.NOVEMBER, 12,
                14, 55).getTime();

        Transaction transaction1 = new Transaction(seller, client, facture, dataZapłaty, dataSprzedaży, zamowienie);

        transaction1.wypiszDaneTransakcji();

    }

}
