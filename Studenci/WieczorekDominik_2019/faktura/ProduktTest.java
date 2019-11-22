import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProduktTest {

    @Test
    public void getNazwaProduktu() {
        Produkt produkt = new Produkt("Weed", 3, 50, 1);
        Assert.assertEquals(produkt.getNazwaProduktu(), "Weed");
    }

    @Test
    public void setNazwaProduktu() {
        Produkt produkt = new Produkt("Weed", 3, 50, 1);
        produkt.setNazwaProduktu("Koks");
        Assert.assertEquals(produkt.getNazwaProduktu(), "Koks");
    }

    @Test
    public void getIloscTowaru() {
        Produkt produkt = new Produkt("Weed", 3, 50, 1);
        Assert.assertEquals(produkt.getIloscTowaru(), 3);
    }

    @Test
    public void setIloscTowaru() {
        Produkt produkt = new Produkt("Weed", 3, 50, 1);
        produkt.setIloscTowaru(5);
        Assert.assertEquals(produkt.getIloscTowaru(), 5);
    }
}