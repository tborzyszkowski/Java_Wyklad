package wyklad.test_03klasy;

import org.junit.*;
import wyklad._03klasy.Absolute;

import static org.junit.Assert.*;


public class AbsoluteTest {

	@Test
	public void absoluteFloatMinusOneHundred(){
		Absolute sut = new Absolute();
		float arg = -123456789.123456789f;
		float result = sut.abs(arg);
		assertEquals("int: abs(-123456789.123456789f) = 123456789.123456789f",
				123456789.123456789f, result, 0.00001);
	}

	@Test
	public void absoluteIntMinusOneHundred(){
		Absolute sut = new Absolute();
		int arg = -100;
		int result = sut.abs(arg);
		assertEquals("int: abs(-100) = 100", 100, result);
	}
}
