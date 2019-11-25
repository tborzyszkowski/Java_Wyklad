package faktura;

import org.junit.*;


public class PozycjaFakturyTest {

    @Test
    public void cenaBruttoZilosci() {
        PozycjaFaktury pomidor = new PozycjaFaktury("Pomidor", 10, 1, 23);

        Assert.assertEquals(12.3, pomidor.getCena_brutto(), 0.01);
    }

    @Test
    public void setcena_jibrutto() {
        PozycjaFaktury ogorek = new PozycjaFaktury("Ogorek", 10, 1, 23);
        ogorek.setCena_j_netto(2);
        Assert.assertEquals(24.6, ogorek.getCena_brutto(), 0.01);
    }
}
