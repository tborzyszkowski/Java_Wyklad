import org.junit.Test;
import static org.junit.Assert.*;

public class OdcinekTest {

    @Test
    public void shiftTest() {
        Odcinek odcinek = new Odcinek(0,1.0,5.0,1.0);
        odcinek.shift(1.0, 1.0);
        double nowaWspolrzednaX1 = odcinek.getPunkt1().getX();
        double nowaWspolrzednaX2 = odcinek.getPunkt2().getX();
        assertEquals(nowaWspolrzednaX1, 1.0, 0.001);
        assertEquals(nowaWspolrzednaX2, 6.0, 0.001);
    }

}