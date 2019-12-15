package FVAT;

import org.junit.Assert;
import org.junit.Test;

public class PozycjaTest {
    String nazwa = "Produkt";
    int ilosc = 5;
    double cena = 1.5;
    double wartoscNetto = 7.5;
    double podatek = 0.23;
    double wartoscBrutto = wartoscNetto * (1+ podatek);

    @Test
    public void pozycjaConnstructorNazwaTest() {


        Pozycja poz1 = new Pozycja(nazwa, ilosc, cena, podatek);

        Assert.assertEquals(nazwa, poz1.getNazwa());
    }

    @Test
    public void pozycjaConnstructorIloscTest() {


        Pozycja poz1 = new Pozycja(nazwa, ilosc, cena, podatek);
        Assert.assertEquals(ilosc, poz1.getIlosc(), 0.001);
    }

    @Test
    public void pozycjaConnstructorCenaTest() {


        Pozycja poz1 = new Pozycja(nazwa, ilosc, cena, podatek);
        Assert.assertEquals(cena, poz1.getCena(), 0.001);
    }

    @Test
    public void pozycjaConnstructorWartoscNettoTest() {


        Pozycja poz1 = new Pozycja(nazwa, ilosc, cena, podatek);
        Assert.assertEquals(wartoscNetto, poz1.getNetto(), 0.001);
    }

    @Test
    public void pozycjaConnstructorPodatekTest() {


        Pozycja poz1 = new Pozycja(nazwa, ilosc, cena, podatek);
        Assert.assertEquals(podatek, poz1.getPodatek(), 0.001);
    }

    @Test
    public void pozycjaConnstructorWartoscBruttoTest() {


        Pozycja poz1 = new Pozycja(nazwa, ilosc, cena, podatek);
        Assert.assertEquals(wartoscBrutto, poz1.getBrutto(), 0.001);
    }

    @Test
    public void pozycjaWypiszPozycjeTest() {


        Pozycja poz1 = new Pozycja(nazwa, ilosc, cena, podatek);
        poz1.wypiszPozycje();
    }

}
