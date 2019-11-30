package Punkt_odcinek;
import org.junit.*;

public class TestPunkt {

    @Test
    public void test_getX() {
        Punkt punkt = new Punkt(3.58, 1.0);
        Punkt punktTest = new Punkt(punkt);
        Assert.assertEquals(3.58, punktTest.getX(), 0.001);//delta to epsilon; wyznacza precyzje z jaka ma sie odbyc test na double'ach
    }

    @Test
    public void test_getY() {
        Punkt punkt = new Punkt(3.58, -1.2);
        Punkt punktTest = new Punkt(punkt);
        Assert.assertEquals(-1.2, punktTest.getY(), 0.001);//delta to epsilon; wyznacza precyzje z jaka ma sie odbyc test na double'ach
    }

    @Test
    public void test_shift() {
        Punkt punkt = new Punkt(1.0, 1.0);
        Punkt punktTest = new Punkt(punkt);
        double a = 0.0;
        double b = 2.0;
        punktTest.shift(a,b);
        Assert.assertEquals(1.0 ,punktTest.getX() ,0.00001);
        Assert.assertEquals(3.0 ,punktTest.getY() ,0.00001);// problem nie moge porownac void
    }

    @Test
    public void test_diff() {
        Punkt punkt1 = new Punkt(1.0, 0.0);
        Punkt punkt2 = new Punkt(0.0, 0.0);
        double d = punkt1.distance(punkt2);
        Assert.assertEquals(1.0, d, 0.001);

    }
}
