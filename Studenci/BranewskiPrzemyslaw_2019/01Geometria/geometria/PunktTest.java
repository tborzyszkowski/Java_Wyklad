package geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PunktTest {

	@Test
	public void prototypeConstructorResult_getX()
	{
       	Punkt punkt = new Punkt(1.0, 1.0);
       	Punkt newPunkt = new Punkt(punkt);
       	assertEquals(1.0, newPunkt.getX(), 0.001);
    }
	
	@Test
	public void prototypeConstructorResult_setX()
	{
		Punkt punkt = new Punkt(1.0, 1.0);
		Punkt newPunkt = new Punkt(punkt);
		newPunkt.setX(5.0);
		assertEquals(5.0, newPunkt.getX(), 0.001);
	}
	
	@Test
	public void prototypeConstructorResult_getY()
	{
       	Punkt punkt = new Punkt(1.0, 1.0);
       	Punkt newPunkt = new Punkt(punkt);
       	assertEquals(1.0, newPunkt.getY(), 0.001);
	}
	
	@Test
	public void prototypeConstructorResult_setY()
	{
		Punkt punkt = new Punkt(1.0, 1.0);
		Punkt newPunkt = new Punkt(punkt);
		newPunkt.setY(5.0);
		assertEquals(5.0, newPunkt.getY(), 0.001);
	}
	
	@Test
	public void prototypeConstructorResult_shiftX()
	{
		Punkt punkt = new Punkt(1.0, 1.0);
		Punkt newPunkt = new Punkt(punkt);
		newPunkt.shift(1.0, 0.0);
		assertEquals(2.0, newPunkt.getX(), 0.001);
	}
	
	@Test
	public void prototypeConstructorResult_shiftY()
	{
		Punkt punkt = new Punkt(1.0, 1.0);
		Punkt newPunkt = new Punkt(punkt);
		newPunkt.shift(0.0, 1.0);
		assertEquals(2.0, newPunkt.getY(), 0.001);
	}
	
	@Test
	public void distanceFromTheSamePoint()
	{
		Punkt punkt = new Punkt(1.0, 1.0);
		double distance = punkt.distance(punkt);
		assertEquals(0.0, distance, 0.001);
	}
	
	@Test
	public void distanceFromAnotherPoint()
	{
		Punkt punkt1 = new Punkt(1.0, 1.0);
		Punkt punkt2 = new Punkt(4.0, 5.0);
		double distance = punkt1.distance(punkt2);
		assertEquals(5.0, distance, 0.001);
	}
}
