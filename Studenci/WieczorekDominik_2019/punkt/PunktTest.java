
import org.junit.Test;
import org.junit.Assert;

public class PunktTest {

    @Test
    public void distance() {
        Punkt punkt = new Punkt(0, 0);
        Punkt punkt2 = new Punkt(3, 4);

        Assert.assertEquals(punkt.distance(punkt2), 5, 0);
    }

    @Test
    public void shiftX() {
        Punkt punkt = new Punkt(2, 0);
        Punkt punkt2 = new Punkt(3, 0);

        punkt.shift(1, 0);

        Assert.assertEquals(punkt.getX(), punkt2.getX(), 0);
    }

    @Test
    public void sameDistance() {
        Punkt punkt = new Punkt(3, 3);
        Punkt punkt2 = new Punkt(3, 3);

        Assert.assertEquals(punkt.distance(punkt2), 0, 0);
    }

    @Test
    public void distanceEqual() {
        Punkt punkt = new Punkt(-4, 3);
        Punkt punkt2 = new Punkt(8, 12);

        Assert.assertEquals(punkt.distance(punkt2), punkt2.distance(punkt), 0);
    }

    @Test
    public void shiftY() {
        Punkt punkt = new Punkt(0, 2);
        Punkt punkt2 = new Punkt(0, 3);

        punkt.shift(0, 1);

        Assert.assertEquals(punkt.getY(), punkt2.getY(), 0);
    }

}
