import org.junit.*;


public class OdcinekTest {

    @Test
    public void test_shift_staring_X() {
        // Assert
        Odcinek odcinek = new Odcinek(1.0, 1.0, 2.0, 2.0);
        odcinek.shift(1.0, 1.0);
        Assert.assertEquals(2.0, odcinek.getStartingX(), 0.001);
    }
    @Test
    public void test_shift_ending_X() {

        Odcinek odcinek = new Odcinek(1.0, 1.0, 2.0, 2.0);
        odcinek.shift(1.0, 1.0);

        // Assert
        Assert.assertEquals(3.0, odcinek.getEndingX(), 0.001);
    }
    @Test
    public void test_shift_staring_Y() {
        Odcinek odcinek = new Odcinek(1.0, 1.0, 2.0, 2.0);
        odcinek.shift(1.0, 1.0);

        // Assert
        Assert.assertEquals(2.0, odcinek.getStaringY(), 0.001);
    }
    @Test
    public void test_shift_ending_Y() {
        Odcinek odcinek = new Odcinek(1.0, 1.0, 2.0, 2.0);
        odcinek.shift(1.0, 1.0);

        // Assert
        Assert.assertEquals(3.0, odcinek.getEndingY(), 0.001);
    }
    @Test
    public void test_point_distance() {
        Odcinek odcinek = new Odcinek(2.0, 3.0, 4.0, 5.0);
        Punkt punkt = new Punkt(0, 0);
        double distance = odcinek.pointDinstance(punkt);
        Assert.assertEquals(0.5, distance, 0.001 );
    }

    @Test
    public void get_length() {
        Odcinek odcinek = new Odcinek(0, 0, 1, 1);
        double length = odcinek.length();
        Assert.assertEquals(Math.sqrt(2), length, 0.001);
    }
}
