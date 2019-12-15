package com.company;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DodatkoweFunkcjeTest {

    @Test
    void stringToData() {
        DodatkoweFunkcje obiekt = new DodatkoweFunkcje();
        assertNotNull(obiekt.StringToData("2019-12-01 22:00:00"));
    }
}