import static org.junit.Assert.*;
import org.junit.*;

public class PunktTest
{

    @Test
    public void prototypeConstructorResult_getX()
    {
        Punkt punkt = new Punkt(1.0, 1.0);
        Punkt newPunkt = new Punkt(punkt);
        Assert.assertEquals(1.0, newPunkt.getX(), 0.001);
    }

    @Test
    public void prototypeConstructorResult_getY()
    {
        Punkt punkt = new Punkt(1.0, 1.0);
        Punkt newPunkt = new Punkt(punkt);
        Assert.assertEquals(1.0, newPunkt.getY(), 0.001);
    }

	@Test
	public void prototypeConstructorResult_setX()
	{
		Punkt punkt = new Punkt(1.0, 1.0);
		Punkt newPunkt = new Punkt(punkt);
		newPunkt.setX(22.5);
		assertEquals(22.5, newPunkt.getX(), 0.001);
	}

	@Test
	public void prototypeConstructorResult_setY()
	{
		Punkt punkt = new Punkt(1.0, 1.0);
		Punkt newPunkt = new Punkt(punkt);
		newPunkt.setY(22.5);
		assertEquals(22.5, newPunkt.getY(), 0.001);
	}

    @Test
    public void distanceFromTheSamePoint()
    {
        Punkt punkt = new Punkt(1.0, 1.0);
        double distance = punkt.distance(punkt);
        Assert.assertEquals(0.0, distance, 0.001);
    }

    @Test
    public void distanceFromAnotherPoint()
    {
        Punkt punkt1 = new Punkt(1.0, 1.0);
        Punkt punkt2 = new Punkt(1.0, 2.0);
        double distance = punkt1.distance(punkt2);
        Assert.assertEquals(1.0, distance, 0.001);
    }

    @Test
    public void shiftPointX()
    {
        Punkt punkt = new Punkt(1.0, 1.0);
		Punkt newPunkt = new Punkt(punkt);
		newPunkt.shift(6.5, 0.0);
		assertEquals(7.5, newPunkt.getX(), 0.001);
    }

    @Test
    public void shiftPointY()
    {
        Punkt punkt = new Punkt(1.0, 1.0);
		Punkt newPunkt = new Punkt(punkt);
		newPunkt.shift(0.0, 6.5);
		assertEquals(7.5, newPunkt.getY(), 0.001);
    }
}