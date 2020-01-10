import org.junit.*;


public class TestPozycja {
    @Test
    public void zmianaVatu(){
        Produkt banany = new Produkt("Banan", 7.50);
        Pozycja poz = new Pozycja(banany, 20);
        poz.ustawVat(0.30);

        Assert.assertEquals(0.30, poz.vat, 0.001);
    }

    @Test
    public void zwracaNetto(){
        Produkt banany = new Produkt("Banan", 7.50);
        Pozycja poz = new Pozycja(banany, 20);

        Assert.assertEquals(150.0, poz.podajNetto(), 0.001);
    }

    @Test
    public void zwracaBrutto(){
        Produkt banany = new Produkt("Banan", 7.50);
        Pozycja poz = new Pozycja(banany, 20);

        Assert.assertEquals(184.5, poz.podajBrutto(), 0.001);
    }
}
