package Laboratorium.Lab01;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class StackTest {
	@Test
	public void testPopAfterPush() {
		Stack stack = new Stack();
		stack.push(10);
		int result = stack.pop();

		assertEquals("pop after push", 10, result);
	}
}
