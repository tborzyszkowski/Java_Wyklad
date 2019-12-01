import org.testng.annotations.Test;
import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class PunktTest {

    @Test
    public void getXTest() {
        Punkt punkt = new Punkt(1.0,1.0);
        assertEquals(punkt.getX(), 1.0, 0.001);
    }

    @Test
    public void getYTest() {
        Punkt punkt = new Punkt(1.0,1.0);
        assertEquals(punkt.getY(), 1.0, 0.001);
    }

    @Test
    public void shiftTest() {
        Punkt punkt = new Punkt(1.0, 1.0);
        punkt.shift(2.0, 2.0);
        assertEquals(punkt.getX(), 3.0, 0.001);
        assertEquals(punkt.getY(), 3.0, 0.001);
    }

    @Test
    public void distanceIfZeroTest() {
        Punkt punkt = new Punkt(1.0, 1.0);
        Punkt punkt2 = new Punkt(1.0, 1.0);
        assertEquals(punkt.distance(punkt2), 0.0, 0.001);
    }
}