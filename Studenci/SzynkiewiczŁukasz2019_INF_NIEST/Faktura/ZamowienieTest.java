import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class ZamowienieTest {

    private Zamowienie zamowienie;
    private ArrayList<Pozycja> listaZakupow;
    private LocalDate dataZamowienia;

    @Before
    public void start() {
        this.zamowienie = new Zamowienie();
        Produkt produkt1 = new Produkt("zeszyt 96 kartek", 10.00, 23);
        Produkt produkt2 = new Produkt("kredki", 5.00, 8);
        Produkt produkt3 = new Produkt("ołówek", 1.00, 17);
        this.zamowienie.dodajPozycje(produkt1, 1);
        this.zamowienie.dodajPozycje(produkt2, 2);
        this.zamowienie.dodajPozycje(produkt3, 3);
    }

    @Test
    public void testSumujNetto() {
        Assert.assertEquals(23.00, this.zamowienie.sumujNetto(), 0.001);
    }

    @Test
    public void testSumujBrutto() {
        Assert.assertEquals(26.61, this.zamowienie.sumujBrutto(), 0.01);
    }



}