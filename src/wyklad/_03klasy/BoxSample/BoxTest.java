package wyklad._03klasy.BoxSample;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {
//	@Test
//	public void testBoxGetValue_forOne_givesTwo() {
//		// Arrange
//		int argument = 1;
//		// Act
//		int result = Box.getValue(argument);
//		// Assert
//		assertEquals("getValue(1) = 2", 2, result);
//	}
	@Test
	public void test_volumeOfInitialBox_isZero(){
		Box sut = new Box();
		double volume = sut.volume();
		assertEquals( 0.0, volume, 0.001);
	}
	@Test
	public void test_volumeOfUnitQube_isOne(){
		Box sut = new Box(1, 1, 1);
		double volume = sut.volume();
		assertEquals( 1.0, volume, 0.001);
	}

	@Test
	public void test_twoBoxes_areEqual(){
		Box sut1 = new Box(1, 1, 1);
		Box sut2 = new Box(1, 1, 1);
		assertTrue( "Boxes are equal", sut1.equals(sut2));
	}
	@Test
	public void test_twoBoxes_areNotTheSame(){
		Box box1 = new Box();
		Box box2 = new Box();
		assertNotSame("Boxes are not the same", box1, box2);
	}
	@Test
	public void test_twoBoxehashes_areNotEqual(){
		Box box1 = new Box();
		Box box2 = new Box();
		assertTrue("Boxes are not the same", box1.hashCode() != box2.hashCode());
	}

}

