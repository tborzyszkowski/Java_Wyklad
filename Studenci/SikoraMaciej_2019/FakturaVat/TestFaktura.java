import org.junit.*;

public class TestFaktura {
    @Test
    public void Numerowanie(){
        Osoba drut = new Osoba("Drutex", "Majowa", 123456789, 230980);
        Osoba budow = new Osoba("BraciaBudzińscy", "Kościerzyńska", 987654321, 238197);
        Faktura fakt = new Faktura("12.12", "12.12", "13.12", budow, drut);
        Faktura fakt2 = new Faktura("30.12", "31.12", "31.12", drut, budow);

        Assert.assertEquals(1, fakt2.numer, 0.001);
    }

    @Test
    public void SumaPozycji(){
        Produkt banany = new Produkt("Banan", 7.50);
        Produkt ogorki = new Produkt("Ogórek", 5.0);

        Pozycja poz = new Pozycja(banany, 20);
        Pozycja poz2 = new Pozycja(ogorki, 2);

        Osoba drut = new Osoba("Drutex", "Majowa", 123456789, 230980);
        Osoba budow = new Osoba("BraciaBudzińscy", "Kościerzyńska", 987654321, 238197);


        Faktura fakt = new Faktura("12.12", "12.12", "13.12", budow, drut);

        fakt.KolejnyProdukt(poz);

        Assert.assertEquals(184.5, fakt.suma, 0.001);
    }
}
