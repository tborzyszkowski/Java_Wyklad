import org.junit.Assert;
import org.junit.Test;

public class OdcinekTest {

    @Test
    public void shift() {
        Odcinek odcinek = new Odcinek(4,5,6,4);
        odcinek.shift(4,5);
        Assert.assertEquals(odcinek.getStartingX(),8,0);
    }

    @Test
    public void pointDistance() {
        Odcinek odcinek = new Odcinek(0,4,4,4);
        Punkt abc = new Punkt(4,0);
        Assert.assertEquals(odcinek.pointDistance(abc),4,0);
    }

    @Test
    public void length() {
        Odcinek odcinek = new Odcinek(5, 5, 10, 10);
        double dlugosc = odcinek.dlugoscOdcinka();
        Assert.assertEquals(Math.sqrt(5), dlugosc, 0);
    }
}