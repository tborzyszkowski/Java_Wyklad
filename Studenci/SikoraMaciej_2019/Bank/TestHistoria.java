import org.junit.Assert;
import org.junit.Test;

public class TestHistoria {
    @Test
    public void przelewImie(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Konto Alina = new Konto("Alina", "Nowak", "3214567890", 500.00);
        Przelew pierwszy = new Przelew(Jan, Alina, 50);
        Historia his = new Historia(Jan);

        his.KolejnyPrzelew(pierwszy);

        Assert.assertEquals("Jan", his.przelewy.get(0).wlasciciel.imie);
    }

    @Test
    public void przelewNazwisko(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Konto Alina = new Konto("Alina", "Nowak", "3214567890", 500.00);
        Przelew pierwszy = new Przelew(Jan, Alina, 50);
        Historia his = new Historia(Jan);

        his.KolejnyPrzelew(pierwszy);

        Assert.assertEquals("Kowalski", his.przelewy.get(0).wlasciciel.nazwisko);
    }

    @Test
    public void przelewKwota(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Konto Alina = new Konto("Alina", "Nowak", "3214567890", 500.00);
        Przelew pierwszy = new Przelew(Jan, Alina, 50);
        Historia his = new Historia(Jan);

        his.KolejnyPrzelew(pierwszy);

        Assert.assertEquals(50, his.przelewy.get(0).kwota, 0.0001);
    }

}
