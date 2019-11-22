package fvat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {
	
	@Test
	public void getLicznikFakturCheck()
	{
		Singleton pierwszy = Singleton.IncrementAndGetInstance();
		int numer = 1;
		assertEquals(numer, pierwszy.getLicznikFaktur());
	}
	
	@Test
	public void setZwiekszLicznikCheck1()
	{
		Singleton drugi = Singleton.IncrementAndGetInstance();
		int numer = 2;
		assertEquals(numer, drugi.getLicznikFaktur());
	}
	
	@Test
	public void setZwiekszLicznikCheck2()
	{
		Singleton trzeci = Singleton.IncrementAndGetInstance();
		int numer = 3;
		assertEquals(numer, trzeci.getLicznikFaktur());
	}
}
