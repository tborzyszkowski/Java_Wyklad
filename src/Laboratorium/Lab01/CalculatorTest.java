package Laboratorium.Lab01;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	@Test
	public void testAddOne(){
		// Arrange
		Calculator calculator = new Calculator();
		// Act
		calculator.add(1);
		// Assert
		assertEquals("0+1 = 1", 1, calculator.getState());
	}

	@Test
	public void testMultOneByTwo(){
		Calculator calculator = new Calculator();
		calculator.setState(1);
		calculator.mult(2);
		assertEquals("1*2 = 2", 2, calculator.getState());
	}
}
