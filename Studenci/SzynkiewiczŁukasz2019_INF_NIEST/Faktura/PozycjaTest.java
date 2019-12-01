import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PozycjaTest {

    private Pozycja pozycja;

    @Before
    public void start() {
        Produkt produkt1 = new Produkt("zeszyt 96 kartek", 10.00, 23);
        this.pozycja = new Pozycja(produkt1, 5);
    }

    @Test
    public void testCountCenaPozycjiNetto() {
        Assert.assertEquals(50.00, this.pozycja.countCenaPozycjiNetto(), 0.01);
    }

    @Test
    public void testCountCenaPozycjiBrutto() {
        Assert.assertEquals(61.50, this.pozycja.countCenaPozycjiBrutto(), 0.01);
    }
}