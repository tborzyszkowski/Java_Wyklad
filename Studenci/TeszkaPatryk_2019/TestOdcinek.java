package Punkt_odcinek;

import org.junit.*;

public class TestOdcinek {
    @Test
    public void test_shift() {
        Punkt x = new Punkt(1.0, 2.0);
        Punkt y = new Punkt(0.0, 5.0);
        Odcinek odcinekTest = new Odcinek(x,y);
        odcinekTest.new_set(8.0,2.0);
        Assert.assertEquals(9.0, odcinekTest.getX_A() ,0.0001);
        Assert.assertEquals(4.0, odcinekTest.getY_A() ,0.0001);
        Assert.assertEquals(8.0, odcinekTest.getX_B() ,0.0001);
        Assert.assertEquals(7.0, odcinekTest.getY_B() ,0.0001);

    }

    @Test
    public void test_diff() {
        Punkt p = new Punkt(1.0, 1.0);
        Punkt x = new Punkt(1.0, 2.0);
        Punkt y = new Punkt(0.0, 5.0);
        Odcinek odcinekTest = new Odcinek(x,y);
        Assert.assertEquals(0.316, odcinekTest.pointDistance(p), 0.000000001);
    }
}
