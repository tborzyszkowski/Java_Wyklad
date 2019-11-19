package fvat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PozycjaFakturyTest {
	
	@Test
	public void prototypeConstructorCheckNazwaProduktu()
	{
		PozycjaFaktury pozycja = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		String nazwa = "DELL Vostro 5581";
		assertEquals(nazwa, pozycja.getNazwaProduktu());
	}
	
	@Test
	public void prototypeConstructorCheckIloscZamowionegoTowaru()
	{
		PozycjaFaktury pozycja = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		int ilosc = 2;
		assertEquals(ilosc, pozycja.getIloscZamowionegoTowaru(), 1);
	}
	
	@Test
	public void prototypeConstructorCheckCenaJednostkowaNetto()
	{
		PozycjaFaktury pozycja = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		double cenaJednostkowa = 3199.99;
		assertEquals(cenaJednostkowa, pozycja.getCenaJednostkowaNetto(), 0.001);
	}
	
	@Test
	public void prototypeConstructorCheckPodatekVAT()
	{
		PozycjaFaktury pozycja = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		int podatek = 23;
		assertEquals(podatek, pozycja.getPodatekVAT());
	}
	
	@Test
	public void prototypeConstructorCheckCenaNettoPozycji()
	{
		PozycjaFaktury pozycja = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		double cenaNetto = 6399.98;
		assertEquals(cenaNetto, pozycja.getCenaNettoPozycji(), 0.01);
	}
	
	@Test
	public void prototypeConstructorCheckCenaBruttoPozycji()
	{
		PozycjaFaktury pozycja = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		double cenaBrutto = 7871.98;
		assertEquals(cenaBrutto, pozycja.getCenaBruttoPozycji(), 0.01);
	}
	
	@Test
	public void overriddenToStringMethodCheck()
	{
		PozycjaFaktury pozycja = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		String lancuch = "\n\tDELL Vostro 5581: 2 * 3199.99 = 6399.98 || + 23% = 7871.98";
		assertEquals(lancuch, pozycja.toString());
	}
}