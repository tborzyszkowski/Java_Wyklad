package wyklad._10testy.ex1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
