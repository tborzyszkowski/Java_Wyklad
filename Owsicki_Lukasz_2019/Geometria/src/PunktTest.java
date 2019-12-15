import static org.junit.jupiter.api.Assertions.*;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class PunktTest {

	@Test
	void testGetX() {
		Punkt punkt = new Punkt(1.0,1.0);
		Punkt newPunkt = new Punkt(punkt);
		assertEquals(1.0, newPunkt.getX(), 0.001);
	}

	@Test
	void testGetY() {
		Punkt punkt = new Punkt(2.0,2.0);
		Punkt newPunkt = new Punkt(punkt);
		assertEquals(2.0, newPunkt.getY(), 0.001);
	}

	@Test
	void testShiftX() {
		Punkt punkt = new Punkt(1.0, 1.0);
		Punkt newPunkt = new Punkt(punkt);
		newPunkt.shift(1.0, 0.0);
		assertEquals(2.0, newPunkt.getX(), 0.001);
	}

	@Test
	void testShiftY() {
		Punkt punkt = new Punkt(1.0, 1.0);
		Punkt newPunkt = new Punkt(punkt);
		newPunkt.shift(1.0, 10.0);
		assertEquals(11.0, newPunkt.getY(), 0.001);
	}
	@Test
	void testDistance() {
		Punkt punkt = new Punkt(1.0,1.0);
		double distance = punkt.distance(punkt);
		Assert.assertEquals(0.0, distance, 0.001);
	}
	
	@Test
	void testDistance2() {
		Punkt punktOne = new Punkt(1.0,1.0);
		Punkt punktTwo = new Punkt(6.0,1.0);
		double distance = punktOne.distance(punktTwo);
		Assert.assertEquals(5.0, distance, 0.001);
	}
}
