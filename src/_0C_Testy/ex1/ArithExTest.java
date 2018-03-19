package _0C_Testy.ex1;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArithExTest {

	@Test
	public void testMultiply() {
		//fail("Not yet implemented"); // TODO

		// check if multiply(10,5) returns 50
		assertEquals("10 x 5 must be 50", 50, ArithEx.multiply(10, 5));
	}
	@Test
	public void testAdd() {
		//fail("Not yet implemented"); // TODO
		
		assertEquals("10 + 5 must be 15", 15, ArithEx.add(10, 5));
	}

}
