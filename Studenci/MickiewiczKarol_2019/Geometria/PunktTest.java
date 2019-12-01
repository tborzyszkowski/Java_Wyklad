import org.junit.*;

public class PunktTest {

    @Test
    public void defaultConstructorResult1_getX() {

        Punkt punkt = new Punkt();

        Assert.assertEquals(0, punkt.getX(), 0.001);
    }

    @Test
    public void defaultConstructorResult2_getX() {

        Punkt punkt = new Punkt();

        Assert.assertEquals(0, punkt.getY(), 0.001);
    }

    @Test
    public void prototypeConstructorResult_getX() {
        Punkt punkt = new Punkt(1.0, 1.0);

        Punkt newPunkt = new Punkt(punkt);

        Assert.assertEquals(1.0, newPunkt.getX(), 0.001);
    }

    @Test
    public void shift_X() {
        Punkt punkt = new Punkt();
        double x = punkt.getX();
        double y = punkt.getY();
        punkt.shift(2.0, 5.0);
        Assert.assertEquals(x+2.0, punkt.getX(), 0.001);
    }

    @Test
    public void shift_Y() {
        Punkt punkt = new Punkt();
        double x = punkt.getX();
        double y = punkt.getY();
        punkt.shift(2.0, 5.0);
        Assert.assertEquals(x+5.0, punkt.getY(), 0.001);
    }

    @Test
    public void point_distance() {
        Punkt punkt = new Punkt();
        double result = punkt.distance(new Punkt(2.0, 5.0));
        Assert.assertEquals(5.385164807134504, result, 0.0001);
    }

}
