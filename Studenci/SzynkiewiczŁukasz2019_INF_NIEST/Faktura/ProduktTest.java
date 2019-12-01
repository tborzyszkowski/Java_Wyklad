import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProduktTest {

    @Test
    public void testCountCenaBrutto() {
        Produkt produkt = new Produkt("test", 12.00, 10);
        Assert.assertEquals(13.20, produkt.countCenaBrutto(), 0.001);
    }
}