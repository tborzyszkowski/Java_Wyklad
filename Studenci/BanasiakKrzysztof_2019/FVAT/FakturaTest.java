package faktura;

import org.junit.*;


public class FakturaTest {

    @Test
    public void cenaBruttoZilosci() {
        Kupujacy kup = new Kupujacy("Jan", "Kowalski", "sklep", "Woronicza 4", "2383-23");
        Sprzedajacy sprz = new Sprzedajacy("Tomasz", "Marcinkiewicz",
                "Hurtownia", "Woronicza 6", "2383-23", "98987666778787878");
        PozycjaFaktury pomidor = new PozycjaFaktury("pomidor", 7, 0.5, 23);
        PozycjaFaktury kielbasa = new PozycjaFaktury("kielbasa", 29, 5, 23);
        PozycjaFaktury makaron = new PozycjaFaktury("makaron", 10, 3, 23);
        Faktura f1VAT = new Faktura(sprz, kup, "09.11.2019", "11.11.2019", "17.11.2019");
        f1VAT.dodajArtykul(pomidor);
        f1VAT.dodajArtykul(kielbasa);
        f1VAT.dodajArtykul(makaron);
        Assert.assertEquals(219.555, f1VAT.cena_koncowa(),0.1);
    }
    @Test
    public void numerfaktury() {
        Faktura.l_faktur=0;
        Kupujacy kup = new Kupujacy("Jan", "Kowalski", "sklep", "Woronicza 4", "2383-23");
        Sprzedajacy sprz = new Sprzedajacy("Tomasz", "Marcinkiewicz",
                "Hurtownia", "Woronicza 6", "2383-23", "98987666778787878");
        PozycjaFaktury pomidor = new PozycjaFaktury("pomidor", 7, 0.5, 23);
        Faktura f1VAT = new Faktura(sprz, kup, "09.11.2019", "11.11.2019", "17.11.2019");
        f1VAT.dodajArtykul(pomidor);
        Faktura f2VAT = new Faktura(sprz, kup, "09.11.2019", "11.11.2019", "17.11.2019");
        f1VAT.dodajArtykul(pomidor);
        Assert.assertEquals(2, f2VAT.getNr_Faktury(),0.01);
    }
    @Test
    public void cenaBruttoZilosci2() {
        Kupujacy kup = new Kupujacy("Jan", "Kowalski", "sklep", "Woronicza 4", "2383-23");
        Sprzedajacy sprz = new Sprzedajacy("Tomasz", "Marcinkiewicz",
                "Hurtownia", "Woronicza 6", "2383-23", "98987666778787878");
        PozycjaFaktury pomidor = new PozycjaFaktury("pomidor", 7, 0.5, 23);
        PozycjaFaktury kielbasa = new PozycjaFaktury("kielbasa", 29, 5, 23);

        Faktura f1VAT = new Faktura(sprz, kup, "09.11.2019", "11.11.2019", "17.11.2019");
        f1VAT.dodajArtykul(pomidor);
        f1VAT.dodajArtykul(kielbasa);
        Assert.assertEquals(182.665, f1VAT.cena_koncowa(),0.01);
    }
}
