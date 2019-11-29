import org.junit.*;

import java.time.LocalDate;

public class TestPrzelew {
    @Test
    public void przelew(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Konto Alina = new Konto("Alina", "Nowak", "3214567890", 500.00);
        Przelew pierwszy = new Przelew(Jan, Alina, 50);

        Assert.assertEquals("Przelew", pierwszy.rodzaj);
    }

    @Test
    public void wplata(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Przelew pierwszy = new Przelew(Jan, new Konto(), 50);

        Assert.assertEquals("Wplata", pierwszy.rodzaj);
    }

    @Test
    public void wyplata(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Przelew pierwszy = new Przelew(new Konto(), Jan, 50);

        Assert.assertEquals("Wyplata", pierwszy.rodzaj);
    }

    @Test
    public void przelewPlacacy(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Konto Alina = new Konto("Alina", "Nowak", "3214567890", 500.00);
        Przelew pierwszy = new Przelew(Jan, Alina, 50);

        Assert.assertEquals(200.00, Jan.stan, 0.001);
    }

    @Test
    public void przelewOtrzymujacy(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Konto Alina = new Konto("Alina", "Nowak", "3214567890", 500.00);
        Przelew pierwszy = new Przelew(Jan, Alina, 50);

        Assert.assertEquals(550.00, Alina.stan, 0.001);
    }

    @Test
    public void przelewData(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Konto Alina = new Konto("Alina", "Nowak", "3214567890", 500.00);
        Przelew pierwszy = new Przelew(Jan, Alina, 50);

        Assert.assertEquals(LocalDate.now(), pierwszy.data);
    }
}
