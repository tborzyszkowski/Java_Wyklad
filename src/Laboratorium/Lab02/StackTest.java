package Laboratorium.Lab02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StackTest {
	private Stack sut;

	@Before
	public void setup() {
		sut = new Stack(10);
	}

	@Test
	public void testPopAfterPush() {
		sut.push(10);
		int result = sut.pop();

		assertEquals("pop after push", 10, result);
	}
	@Test
	public void checkIfCanCreateSut() {
		assertNotEquals("Stack null", null , sut);
	}

	@Test
	public void push_SingleNumberAddedToStack_WhenPeekNumberIstheSame() {
		// Arrange
		sut.push(5);
		// Act
		int result = sut.peek();
		// Assert
		assertEquals( 5, result);
	}

	@Test
	public void push_TwoNumbersAddedToStack_LastOnePeekd() {
		sut.push(5);
		sut.push(7);
		int result = sut.peek();
		assertEquals( 7, result);
	}

	@Test
	public void pop_TwoNumbersPushedToStack_CorrectNumberReturnedByTheSndPop() {
		sut.push(5);
		sut.push(7);
		sut.pop();
		int result = sut.pop();
		assertEquals( 5, result);
	}

	@Test
	public void push_ThousendElementsPushedAndAllPoped_FirstPushedReturned() {
		for (int i = 0; i < 1000; i++) {
			sut.push(i);
		}
		int result = -1;
		for (int i = 0; i < 1000; i++) {
			result = sut.pop();
		}
		assertEquals( 0, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void pop_TooManyPopsCalled_InvalidOperationException() {
		sut.push(1);
		sut.pop();
		sut.pop();
	}

	@Test(expected = IllegalArgumentException.class)
	public void Peek_StackIsEmpty_InvalidOperationException() {
		sut.peek();
	}

	@Test
	public void isEmpty_StackIsEmpty_ReturnedTrue() {
		assertEquals(true,sut.isEmpty());
	}

	@Test
	public void isEmpty_StackHasElements_ReturnedFalse() {
		sut.push(1);
		assertEquals(false,sut.isEmpty());
	}
}
