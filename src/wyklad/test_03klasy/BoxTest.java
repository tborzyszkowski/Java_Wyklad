package wyklad.test_03klasy;

import org.junit.*;
import static org.junit.Assert.*;

import wyklad._03klasy.Box;


public class BoxTest {
	Box box;
	@Before
	public void setUp(){
		box = new Box();
	}
	@Test
	public void emptyBoxZeroVolume(){
		// Arrange
		// Act
		double volume = box.volume();
		// Assert
		assertEquals(0.0, volume, 0.0);
	}
	@Test
	public void oneDimQubeBoxHasVolumeOne(){
		// Arrange
		box.setWidth(1);
		box.setDepth(1);
		box.setHeight(1);
		// Act
		double volume = box.volume();
		// Assert
		assertEquals(1.0, volume, 0.0);
	}
}
