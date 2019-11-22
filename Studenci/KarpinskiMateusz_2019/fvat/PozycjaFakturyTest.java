package fvat;

import org.junit.*;

public class PozycjaFakturyTest {

    @Test
    public void cenaNettoPoz() {
        PozycjaFaktury pozycjaFaktury = new PozycjaFaktury("",5, 10);

        double cena = pozycjaFaktury.cenaNettoPoz();

        Assert.assertEquals(50, cena, 0.001);
    }

    @Test
    public void podatekVAT() {
        PozycjaFaktury pozycjaFaktury = new PozycjaFaktury("", 5, 10);

        double podatek = pozycjaFaktury.podatek();

        Assert.assertEquals(11.5, podatek, 0.001);
    }

    @Test
    public void cenaBrutto() {
        PozycjaFaktury pozycjaFaktury = new PozycjaFaktury("", 5, 10);

        double cena = pozycjaFaktury.cenaBrutto();

        Assert.assertEquals(61.5,cena,0.001);
    }

    @Test
    public void cenaBruttoZero() {
        PozycjaFaktury pozycjaFaktury = new PozycjaFaktury("", 0, 10);

        double cena = pozycjaFaktury.cenaBrutto();

        Assert.assertEquals(0,cena,0.001);

    }

}