package geometria;

import org.junit.*;

public class OdcinekTest {

    @Test
    public void shiftZero() {
        Odcinek lineSegment = new Odcinek(new Punkt(1.0,1.0), new Punkt(1.0, 1.0));

        lineSegment.shift(0.0, 0.0);

        Assert.assertEquals( new Odcinek(1.0,1.0, 1.0, 1.0), lineSegment);

    }

    @Test
    public void shiftValueFromZero() {
        Odcinek lineSegment = new Odcinek();

        lineSegment.shift(2, 2);


        Assert.assertEquals(new Odcinek(2.0, 2.0, 2.0,2.0), lineSegment);

    }

    @Test
    public void shiftValue() {
        Odcinek lineSegment = new Odcinek(5.0, 5.0, new Punkt(6.0, 6.0));

        lineSegment.shift(2, 2);


        Assert.assertEquals(new Odcinek(7.0, 7.0, 8.0, 8.0), lineSegment);

    }

    @Test
    public void pointDistanceToPointWithinLineSegment() {
        Odcinek lineSegment = new Odcinek(1.0, 1.0, 3.0, 1.0);
        Punkt point = new Punkt(2.0, 1.0);

        double d = lineSegment.pointDistance(point);

        Assert.assertEquals(0.0, d, 0.001);
    }

    @Test
    public void pointDistanceToPoint() {
        Odcinek lineSegment = new Odcinek(new Punkt(1.0, 1.0), 2.0, 2.0);
        Punkt point = new Punkt (1.0,2.0);

        double d = lineSegment.pointDistance(point);

        Assert.assertEquals(Math.sqrt(2)/2, d, 0.001);
    }

    @Test
    public void pointDistanceToPointInLine() {
        Odcinek lineSegment = new Odcinek(1.0, 1.0, 2.0, 2.0);
        Punkt point = new Punkt(3.0, 3.0);

        double d = lineSegment.pointDistance(point);

        Assert.assertEquals(Math.sqrt(2), d,0.001);
    }

    @Test
    public void pointDistanceToPointWithShift() {
        Odcinek lineSegment = new Odcinek(new Punkt(1.0, 1.0), 3.0, 3.0);
        Punkt point = new Punkt(2.0,4.0);

        double d = lineSegment.pointDistance(point);

        Assert.assertEquals(Math.sqrt(2), d, 0.001);
    }

    @Test
    public void pointDistanceNegativeNumbers() {
        Odcinek lineSegment = new Odcinek(-1.0, -1.0, -3.0, -3.0);
        Punkt point = new Punkt(-2.0, 1.0);

        double d = lineSegment.pointDistance(point);

        Assert.assertEquals(Math.sqrt(5), d, 0.001);
    }
}
