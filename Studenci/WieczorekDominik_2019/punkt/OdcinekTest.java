import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OdcinekTest {

    @Test
    public void pointDistanceToLine() {
        Punkt punkt = new Punkt(-1, 0);
        Odcinek odcinek = new Odcinek(2, 2, 2, -2);

        Assert.assertEquals(odcinek.pointDistance(punkt), 3, 0);
    }

    @Test
    public void pointDistanceY() {
        Punkt punkt = new Punkt(6, 5);
        Odcinek odcinek = new Odcinek(0, 0, 4, 4);
        Assert.assertEquals(odcinek.pointDistance(punkt), Math.sqrt(5), 0);
    }

    @Test
    public void pointDistanceX() {
        Punkt punkt = new Punkt(5, -6);
        Odcinek odcinek = new Odcinek(2, 2, 2, -2);
        Assert.assertEquals(odcinek.pointDistance(punkt), 5, 0);
    }


    @Test
    public void shiftA() {
        Odcinek odcinek = new Odcinek(0, 0, 0, 0);
        odcinek.shift(1, 1);
        Assert.assertEquals(odcinek.getXa(), 1, 0);
    }

    @Test
    public void shiftB() {
        Odcinek odcinek = new Odcinek(0, 0, 0, 0);
        odcinek.shift(1, 1);
        Assert.assertEquals(odcinek.getXb(), 1, 0);
    }

    @Test
    public void shiftYA() {
        Odcinek odcinek = new Odcinek(0, 0, 0, 0);
        odcinek.shift(1, 2);
        Assert.assertEquals(odcinek.getYa(), 2, 0);
    }

    @Test
    public void shiftYB() {
        Odcinek odcinek = new Odcinek(0, 0, 0, 0);
        odcinek.shift(1, 2);
        Assert.assertEquals(odcinek.getYb(), 2, 0);
    }

}