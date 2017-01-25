package _0C_Testy.ex2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Ex2KlasaTest {
	@Before
	public void testMethInit() {
		Ex2Klasa.x = 1;
	}
	
	@Test
	public void testZwieksz() {
		Ex2Klasa.zwieksz(1);
		assertEquals("2 ?: ", 2, Ex2Klasa.x);
	}

	@Test
	public void testZmniejsz() {
		Ex2Klasa.zmniejsz(2);
		assertEquals("0 ?: ", -1, Ex2Klasa.x);
	}

	@Test
	public void testPodziel() {
		Ex2Klasa.podziel(1);
		assertEquals("0 ?: ", 1, Ex2Klasa.x);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testPodzielExc() {
		Ex2Klasa.podziel(0);
		//assertEquals("0 ?: ", 0, Ex2Klasa.x);
	}
}
