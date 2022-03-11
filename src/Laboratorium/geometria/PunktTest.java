package Laboratorium.geometria;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class PunktTest {
	@Test
	public void testSetPositiveCoord(){
		// Arrange
		// sut = System Under Test
		Punkt sut = new Punkt(-10, -20);
		// Act
		sut.setX(-20);
		// Assert
		assertEquals("x.setX(-20)", 20.0, sut.getX(), 0.00001);
	}

}
