package com.company;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class KontoBankoweTest {

    @Test
    void dodajWydarzenie() {
        Osoba osoba = new Osoba("Jan", "Kowalski");
        KontoBankowe konto = new KontoBankowe(osoba);
        Historia wydarzenie = new Historia();
        LocalDateTime aktualny_czas = LocalDateTime.now();
        wydarzenie.Dodaj("Wplata wlasna", 150, aktualny_czas);
        konto.lista.add(wydarzenie);
        assertNotNull(konto.lista);
    }

    @Test
    void pokazSrodki() {
        Osoba osoba = new Osoba("Jan", "Kowalski");
        KontoBankowe konto = new KontoBankowe(osoba);
        konto.srodki = 0;
        assertEquals(0, konto.srodki);

    }

    @Test
    void wplacSrodki() {
        Osoba osoba = new Osoba("Jan", "Kowalski");
        KontoBankowe konto = new KontoBankowe(osoba);
        konto.wplacSrodki(150);
        assertEquals(150, konto.srodki);
    }

    @Test
    void testWplacSrodki() {
        Osoba osoba = new Osoba("Jan", "Kowalski");
        KontoBankowe konto = new KontoBankowe(osoba);
        konto.wplacSrodki(150, osoba);
        assertEquals(150, konto.srodki);
    }

    @Test
    void wyplacSrodki() {
        Osoba osoba = new Osoba("Jan", "Kowalski");
        KontoBankowe konto = new KontoBankowe(osoba);
        konto.wplacSrodki(500);
        konto.wyplacSrodki(150);
        assertEquals(350, konto.srodki);
    }

    @Test
    void wplacSrodkiNaInneKonto() {
        Osoba osoba1 = new Osoba("Jan", "Kowalski");
        KontoBankowe konto1 = new KontoBankowe(osoba1);
        Osoba osoba2 = new Osoba("Jan", "Kowalski");
        KontoBankowe konto2 = new KontoBankowe(osoba2);
        konto1.wplacSrodki(1500);
        konto1.wplacSrodkiNaInneKonto(150, konto2);
        assertEquals(150, konto2.srodki);
    }

    @Test
    void wykonajPrzelew() {
        Osoba osoba1 = new Osoba("Jan", "Kowalski");
        KontoBankowe konto1 = new KontoBankowe(osoba1);
        Osoba osoba2 = new Osoba("Jan", "Kowalski");
        KontoBankowe konto2 = new KontoBankowe(osoba2);
        konto1.wplacSrodki(1500);
        konto1.wykonajPrzelew(150, konto2);
        assertEquals(150, konto2.srodki);
    }

    @Test
    void pokazHistorie() {
        Osoba osoba1 = new Osoba("Jan", "Kowalski");
        KontoBankowe konto1 = new KontoBankowe(osoba1);
        konto1.wplacSrodki(1500);
        konto1.wyplacSrodki(150);
        Historia o = (Historia)konto1.lista.get(0);
        LocalDateTime data_operacji = o.data;
        String result = "\nHistoria rachunku bankowego Jan Kowalski: 1. Wplata własna: 1500.0 zł\n\tData: "+data_operacji+" 2. Wyplata: 150.0 zł\n\tData: "+data_operacji;
        assertEquals(result, konto1.pokazHistorie());
    }

    @Test
    void testPokazHistorie() {
        Osoba osoba1 = new Osoba("Jan", "Kowalski");
        KontoBankowe konto1 = new KontoBankowe(osoba1);
        konto1.wplacSrodki(1500);
        konto1.wyplacSrodki(150);
        Historia o = (Historia)konto1.lista.get(0);
        LocalDateTime data_operacji = o.data;
        String result = "\nHistoria rachunku bankowego Jan Kowalski\nZakres dat: 2019-12-03T22:48 - 2019-12-31T23:55: 1. Wplata własna: 1500.0 zł\n\tData: "+data_operacji+" 2. Wyplata: 150.0 zł\n\tData: "+data_operacji;
        assertEquals(result, konto1.pokazHistorie("2019-12-03 22:48:00", "2019-12-31 23:55:00"));
    }
}