package geometria;

import org.junit.*;

public class OdcinekTest {

    @Test
    public void shiftValue() {
        Odcinek odcinek = new Odcinek(1.0, 1.0, 2.0, 2.0);
        odcinek.shift(1.0, 2.0);
        Assert.assertEquals(new Odcinek(2.0, 3.0, 3.0, 4.0), odcinek);
    }

    @Test
    public void shiftByZero() {
        Odcinek odcinek = new Odcinek(1.0, 1.0, 2.0, 2.0);

        odcinek.shift(0, 0);

        Assert.assertEquals(new Odcinek(1.0, 1.0, 2.0, 2.0), odcinek);
    }

    @Test
    public void shiftFromZero() {
        Odcinek odcinek = new Odcinek(0.0, 0.0, 0.0, 0.0);

        odcinek.shift(1.0, 1.0);

        Assert.assertEquals(new Odcinek(1.0, 1.0, 1.0, 1.0), odcinek);
    }

    @Test
    public void pointDistanceAcuteAngle() {
        Odcinek odcinek = new Odcinek(1.0, 1.0, 2.0, 1.0);
        Punkt p = new Punkt(3.0, 2.0);

        double distance = odcinek.pointDistance(p);

        Assert.assertEquals(Math.sqrt(2), distance, 0.001);
    }
    @Test
    public void pointDistanceRightAngle(){
        Odcinek odcinek = new Odcinek(1.0, 1.0, 3.0, 1.0);
        Punkt p = new Punkt(3.0, 3.0);

        double distance = odcinek.pointDistance(p);

        Assert.assertEquals(2.0, distance, 0.001);
    }
    @Test
    public void pointDistanceObtuseAngle(){
        Odcinek odcinek = new Odcinek(1.0, 1.0, 3.0, 1.0);
        Punkt p = new Punkt(-2.0, 3.0);
        double expectedDistance = p.distance(odcinek.getP1());

        double distance = odcinek.pointDistance(p);

        Assert.assertEquals(expectedDistance, distance, 0.001);
    }
    @Test
    public void pointDistanceNegativeNumbers() {
        Odcinek odcinek = new Odcinek(-3.0, -1.0, -1.0, -1.0);
        Punkt p = new Punkt(-2.0, -4.0);

        double distance = odcinek.pointDistance(p);

        Assert.assertEquals(3.0, distance, 0.001);
    }
    @Test
    public void pointDistanceToPointOnLineSegment() {
        Odcinek odcinek = new Odcinek(1.0, 1.0, 3.0, 1.0);
        Punkt p = new Punkt(2.0, 1.0);

        double distance = odcinek.pointDistance(p);

        Assert.assertEquals(0.0, distance, 0.001);
    }
    @Test
    public void pointDistanceToPointOnLineSegmentEnd(){
        Odcinek odcinek = new Odcinek(1.0, 1.0, 2.0, 1.0);
        Punkt p = new Punkt(1.0, 1.0);

        double distance = odcinek.pointDistance(p);

        Assert.assertEquals(0.0, distance, 0.001);
    }
}
