import Osoba.Klient;
import Osoba.Sprzedajacy;
import Zamówienie.Faktura;
import Zamówienie.Produkt;
import Zamówienie.Transakcja;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Sprzedajacy sprzedajacy = new Sprzedajacy("Januszex", "Grunwaldzka 9, 82-035 Gdańsk",
                "3788044349", "39823310140698838410509712");

        Klient klient = new Klient("Tadeusz Maruda", "Parzyniechy 2, 015-023",
                "5296392821");

        Produkt laptop_dell = new Produkt("Laptop Dell", 1, 2500);
        Produkt myszka = new Produkt("Myszka", 1, 100);
        Produkt słuchawki_ze_średniej_półki = new Produkt("Słuchawki ze średniej półki", 1, 1600);

        List<Produkt> zamowienie = new ArrayList<>();
        zamowienie.add(laptop_dell);
        zamowienie.add(myszka);
        zamowienie.add(słuchawki_ze_średniej_półki);

        Faktura faktura = new Faktura(zamowienie);

        Date dataZapłaty = new GregorianCalendar(2019, Calendar.NOVEMBER, 11,
                12, 13).getTime();

        Date dataSprzedaży = new GregorianCalendar(2019, Calendar.NOVEMBER, 12,
                14, 55).getTime();

        Transakcja transakcja1 = new Transakcja(sprzedajacy, klient, faktura, dataZapłaty, dataSprzedaży);

        transakcja1.wypiszDaneTransakcji();

    }

}
