package Laboratorium.karty;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    @Test
    public void testAsSerce_porownaj_10Karo_AsWygrywa() {
        Card card1 = new Card(13, 4);
        Card card2 = new Card(8, 3);
        int expected = 1;
        int result = card1.compareTo(card2);
        assertEquals("AsSerce > 10Karo", expected, result);
    }
}
