//package Laboratorium.calculator;
//
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class CalculatorTest {
//	private Calculator calculator;
//	@Before
//	public void setUp() throws Exception {
//		calculator = new Calculator();
//	}
//	@Test
//	public void testCalculator_add_1_toInitial_result_1() {
//		// Arrange
//		int argument = 1;
//		double expected = 1.0;
//		// Act
//		calculator.add(argument);
//		double result = calculator.getResult();
//		// Assert
//		assertEquals("init(0).add(1) == 1", expected, result,0.0001);
//	}
//	@Test
//	public void testCalculator_add_7_toInitial_result_7() {
//		int argument = 7;
//		double expected = 7.0;
//		calculator.add(argument);
//		double result = calculator.getResult();
//		assertEquals("init(0).add(7) == 7", expected, result,0.0001);
//	}
//	@Test
//	public void testCalculator_add_2_nextMult_4_toInitial_result_8() {
//		int addArg = 2;
//		int multArg = 4;
//		double expected = 8.0;
//		calculator.add(addArg);
//		calculator.mult(multArg);
//		double result = calculator.getResult();
//		assertEquals("init(0).add(2).mult(4) == 8", expected, result,0.0001);
//	}
//
//}
