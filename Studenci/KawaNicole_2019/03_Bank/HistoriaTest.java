package com.company;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HistoriaTest {

    @Test
    void dodaj() {
        Historia obiekt = new Historia();
        LocalDateTime aktualny_czas = LocalDateTime.now();

        obiekt.Dodaj("Wplata wlasna", 150, aktualny_czas);
        assertEquals("Wplata wlasna", obiekt.rodzaj);
        assertEquals(150, obiekt.kwota);
        assertEquals(aktualny_czas, obiekt.data);
    }

    @Test
    void odczytaj() {
        Historia obiekt = new Historia();
        LocalDateTime aktualny_czas = LocalDateTime.now();
        obiekt.Dodaj("Wplata wlasna", 150, aktualny_czas);

        String result = " 1. Wplata wlasna: 150.0 zł\n\tData: "+aktualny_czas;

        assertEquals(result, obiekt.Odczytaj(1));
    }
}