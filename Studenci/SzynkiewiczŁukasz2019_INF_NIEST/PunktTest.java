import org.junit.Test;
import static org.junit.Assert.*;

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
}