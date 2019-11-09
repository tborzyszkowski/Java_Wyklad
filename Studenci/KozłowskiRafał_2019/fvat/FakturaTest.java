package fvat;
import org.junit.*;

public class FakturaTest {
    @Test
    public void prototypeConstructorGetWartoscFv(){
        Firma dpd = new Firma("DPD", "Gdansk", 55236367);
        Firma fedex = new Firma("FedEx", "Londyn", 5635345);
        PozycjaFaktury lp1 = new PozycjaFaktury("Maszynka", 1, 30.25, 23);
        Faktura fv3 = new Faktura(dpd, fedex, "dzis", "jutro", "pojutrze");
        PozycjaFaktury lp2 = new PozycjaFaktury("Osełka", 3, 25.25, 18);
        fv3.dodajPozycje(lp1);
        fv3.dodajPozycje(lp2);
        Assert.assertEquals(126.59, fv3.getWartoscFv(), 0.009);
    }

    @Test
    public void prototypeConstructorGetNumerFv(){
        Faktura.ostNumerFaktury=0;
        Firma dpd = new Firma("DPD", "Gdansk", 55236367);
        Firma fedex = new Firma("FedEx", "Londyn", 5635345);
        Faktura pierwsza = new Faktura(dpd, fedex, "dzis", "jutro", "pojutrze");
        Faktura druga = new Faktura(fedex, dpd, "dzis", "jutro", "pojutrze");
        Assert.assertEquals(1, pierwsza.getNumerFaktury());
        Assert.assertEquals(2, druga.getNumerFaktury());
    }





}
