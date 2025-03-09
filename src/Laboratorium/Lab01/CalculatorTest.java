package Laboratorium.Lab01;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	@Test
	public void testAddOne(){
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();
		// Act
		sut.add(1);
		// Assert
		assertEquals("0+1 = 1", 1, sut.getState());
	}
	@Test
	public void test_havigMaxIntAddOne(){
		Calculator sut = new Calculator();
		sut.setState(Integer.MAX_VALUE);
		sut.add(1);
		//long expected = (long)Integer.MAX_VALUE + 1L;
		// Assert
		assertEquals("errorState = true", true, sut.isErrorState());
	}
	@Test
	public void test_havigMinIntMinusOne(){
		Calculator sut = new Calculator();
		sut.setState(Integer.MIN_VALUE);
		sut.add(-1);

		assertEquals("errorState = true", true, sut.isErrorState());
	}

	@Test
	public void testMultOneByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(2);
		assertEquals("1*2 = 2", 2, sut.getState());
	}
}
