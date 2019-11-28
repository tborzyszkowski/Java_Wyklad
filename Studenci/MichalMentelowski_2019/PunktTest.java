import org.junit.Assert;
import org.junit.Test;

public class PunktTest {

    @Test
    public void shift() {
        Punkt rower = new Punkt();
        Punkt pedal = new Punkt(4,0);
        rower.Shift(4,0);
        Assert.assertEquals(pedal.getX(),rower.getX(),0.0000);
        Assert.assertEquals(pedal.getY(),rower.getY(),0.0000);
    }

    @Test
    public void distance() {
        Punkt xd = new Punkt(0,6);
        Punkt dx = new Punkt(0,10);
        Assert.assertEquals(xd.Distance(dx),4,0.0000);

    }
}