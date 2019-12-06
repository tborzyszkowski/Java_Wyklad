package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class KontoBankowe {
    public Osoba wlasciciel;
    public double srodki = 0;
    public List lista = new ArrayList();


    public KontoBankowe(Osoba czlowiek) {
        this.wlasciciel = czlowiek;
    }

    public void dodajWydarzenie(String rodzaj, double kwota) {
        Historia wydarzenie = new Historia();
        LocalDateTime aktualny_czas = LocalDateTime.now();
        wydarzenie.Dodaj(rodzaj, kwota, aktualny_czas);
        this.lista.add(wydarzenie);
    }

    public double pokazSrodki() {
        System.out.println("Stan konta " + this.wlasciciel.pokazDaneOsobowe() + " wynosi: " + this.srodki);
        return this.srodki;
    }

    public void wplacSrodki(double wplata) {
        this.srodki = this.srodki + wplata;
        this.dodajWydarzenie("Wplata własna", wplata);
//      System.out.println("Na koncie " + this.wlasciciel.pokazDaneOsobowe() + " odnotowano wpłatę: " + wplata);
    }

    // Przeciążenie metody
    public void wplacSrodki(double wplata, Osoba nadawca) {
        this.srodki = this.srodki + wplata;
        this.dodajWydarzenie("Wplata od "+nadawca.pokazDaneOsobowe()+": ", wplata);
//      System.out.println("Na koncie " + this.wlasciciel.pokazDaneOsobowe() + " odnotowano wpłatę: " + wplata);
    }

    public double wyplacSrodki(double kwota_wyplaty) {
        this.srodki = this.srodki - kwota_wyplaty;
        this.dodajWydarzenie("Wyplata", kwota_wyplaty);
        System.out.println("Wypłacono: " + kwota_wyplaty);
        return kwota_wyplaty;
    }

    public void wplacSrodkiNaInneKonto(double kwota, KontoBankowe odbiorca) {
        Osoba nadawca = this.wlasciciel;
        odbiorca.wplacSrodki(kwota, nadawca);
    }

    public void wykonajPrzelew(double kwota_przelewu, KontoBankowe odbiorca) {
        System.out.println("Wykonano przelew: "+ this.wlasciciel.pokazDaneOsobowe() + " --> " + odbiorca.wlasciciel.pokazDaneOsobowe() + " w kwocie " + kwota_przelewu);
        this.dodajWydarzenie("Przelew do "+odbiorca.wlasciciel.pokazDaneOsobowe(), kwota_przelewu);
        this.srodki = this.srodki - kwota_przelewu;
        this.wplacSrodkiNaInneKonto(kwota_przelewu, odbiorca);
    }

    public String pokazHistorie() {
        int rozmiar_listy = this.lista.size();
        String result = "\nHistoria rachunku bankowego "+this.wlasciciel.pokazDaneOsobowe()+":";
        System.out.println(result);
        for (int i=0; i<rozmiar_listy; i++) {
            Historia transakcja = (Historia)this.lista.get(i);
            result += transakcja.Odczytaj(i+1);
        }
        return result;
    }

    public String pokazHistorie(String poczatkowa_data, String koncowa_data) {

        DodatkoweFunkcje data = new DodatkoweFunkcje();
        LocalDateTime poczatek = data.StringToData(poczatkowa_data);
        LocalDateTime koniec = data.StringToData(koncowa_data);

        int rozmiar_listy = this.lista.size();
        String result = "\nHistoria rachunku bankowego "+this.wlasciciel.pokazDaneOsobowe()+"\nZakres dat: "+poczatek+" - "+koniec+":";
        System.out.println(result);
        for (int i=0; i<rozmiar_listy; i++) {
            Historia transakcja = (Historia)this.lista.get(i);
            if ((transakcja.data.isAfter(poczatek) && transakcja.data.isBefore(koniec)) || (transakcja.data.isEqual(poczatek)) || (transakcja.data.isEqual(koniec))) {
                result += transakcja.Odczytaj(i+1);
            }
        }
        return result;
    }




}
