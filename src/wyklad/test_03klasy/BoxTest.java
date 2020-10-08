package wyklad.test_03klasy;

import org.junit.*;
import static org.junit.Assert.*;

import wyklad._03klasy.Box;


public class BoxTest {
	@Test
	public void emptyBoxZeroVolume(){
		// Arrange
		Box box = new Box();
		// Act
		double volume = box.getWidth() * box.getHeight() * box.getDepth();
		// Assert
		assertEquals(0.0, volume, 0.0);
	}
}
