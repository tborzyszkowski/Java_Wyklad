package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("BANK");

        // Utworzenie osoby oraz konta dla tej osoby
        Osoba piotr = new Osoba("Piotr", "Kowalski");
        KontoBankowe konto_piotra = new KontoBankowe(piotr);
        konto_piotra.pokazSrodki();

        // Utworzenie drugiej osoby oraz konta dla tej osoby
        Osoba krzysztof = new Osoba("Krzysztof", "Nowak");
        KontoBankowe konto_krzysztofa = new KontoBankowe(krzysztof);
        konto_krzysztofa.pokazSrodki();

        // Wpłacenie środków
        konto_piotra.wplacSrodki(1500);
        konto_piotra.pokazSrodki();

        // Wykonanie przelewu
        konto_piotra.wykonajPrzelew(400, konto_krzysztofa);

        // Wypłata środków
        konto_krzysztofa.wyplacSrodki(20);

        // Historia rachunków
        konto_piotra.pokazHistorie();
        konto_krzysztofa.pokazHistorie();

        // Historia rachunków z uwzględnieniem zakresu dat
        konto_piotra.pokazHistorie("2019-12-03 22:48:00", "2020-01-31 23:55:00");
    }
}
