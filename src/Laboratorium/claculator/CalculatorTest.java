package Laboratorium.claculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}
	@Test
	public void testCalculator_addOneToInitial_resultOne() {
		// Arrange
		int argument = 1;
		double expected = 1.0;
		// Act
		calculator.add(argument);
		double result = calculator.getResult();
		// Assert
		assertEquals("init(0).add(1) == 1", expected, result,0.0001);
	}
}
