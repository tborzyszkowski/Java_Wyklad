package com.company;

import static org.junit.jupiter.api.Assertions.*;

class OsobaTest {

    @org.junit.jupiter.api.Test
    void pokazDaneOsobowe() {
        Osoba osoba = new Osoba("Jan", "Kowalski");
        assertEquals("Jan Kowalski", osoba.pokazDaneOsobowe());
    }
}