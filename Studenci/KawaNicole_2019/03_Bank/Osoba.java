package com.company;

public class Osoba {
    public String imie;
    public String nazwisko;

    // Konstruktor pozwala na przekazanie danych już w momencie tworzenia obiektu
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String pokazDaneOsobowe() {
        //System.out.println(this.imie + " " + this.nazwisko);
        return this.imie + " " + this.nazwisko;
    }
}
