package fvat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DaneFakturyTest {
	
	@Test
	public void CheckSellersBankAccount()
	{
		DaneFaktury sprzedawca = new DaneFaktury();
		String kontoBankowe = "37 1240 1169 0000 2117 6900 1001";
		assertEquals(kontoBankowe, sprzedawca.getKONTO());
	}
	
	@Test
	public void prototypeConstructorCheckSellerName()
	{
		DaneFaktury sprzedawca = new DaneFaktury();
		String nazwaSprzedawcy = "Elektroniker S.A.";
		assertEquals(nazwaSprzedawcy, sprzedawca.getNazwaFirmy());
	}
	
	@Test
	public void prototypeConstructorCheckSellerAddress()
	{
		DaneFaktury sprzedawca = new DaneFaktury();
		String adresSprzedawcy = "ul. Sikorskiego 73, 61-001 Poznan";
		assertEquals(adresSprzedawcy, sprzedawca.getAdresFirmy());
	}
	
	@Test
	public void prototypeConstructorCheckSellerNIPNumber()
	{
		DaneFaktury sprzedawca = new DaneFaktury();
		String numerNIPSprzedawcy = "692-06-03-926";
		assertEquals(numerNIPSprzedawcy, sprzedawca.getNumerNIP());
	}
	
	@Test
	public void prototypeStringConstructorCheckBuyerName()
	{
		DaneFaktury kupujacy = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		String nazwaKupujacego = "Y-Kom";
		assertEquals(nazwaKupujacego, kupujacy.getNazwaFirmy());
	}
	
	@Test
	public void prototypeStringConstructorCheckBuyerAddress()
	{
		DaneFaktury kupujacy = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		String adresKupujacego = "ul. Reja 3, 42-202 Czestochowa";
		assertEquals(adresKupujacego, kupujacy.getAdresFirmy());
	}
	
	@Test
	public void prototypeStringConstructorCheckBuyerNIPNumber()
	{
		DaneFaktury kupujacy = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		String numerNIPKupujacego = "646-71-02-079";
		assertEquals(numerNIPKupujacego, kupujacy.getNumerNIP());
	}
	
	@Test
	public void prototypeConstructorCheckBuyerName()
	{
		DaneFaktury kupujacy = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		DaneFaktury kupujacyDoSprawdzenia = new DaneFaktury(kupujacy);
		String nazwaKupujacego = "Y-Kom";
		assertEquals(nazwaKupujacego, kupujacyDoSprawdzenia.getNazwaFirmy());
	}
	
	@Test
	public void prototypeConstructorCheckBuyerAddress()
	{
		DaneFaktury kupujacy = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		DaneFaktury kupujacyDoSprawdzenia = new DaneFaktury(kupujacy);
		String adresKupujacego = "ul. Reja 3, 42-202 Czestochowa";
		assertEquals(adresKupujacego, kupujacyDoSprawdzenia.getAdresFirmy());
	}
	
	@Test
	public void prototypeConstructorCheckBuyerNIPNumber()
	{
		DaneFaktury kupujacy = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		DaneFaktury kupujacyDoSprawdzenia = new DaneFaktury(kupujacy);
		String numerNIPKupujacego = "646-71-02-079";
		assertEquals(numerNIPKupujacego, kupujacyDoSprawdzenia.getNumerNIP());
	}
	
	@Test
	public void overriddenToStringMethodCheck()
	{
		DaneFaktury kupujacy = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		String lancuch = "\n\tY-Kom\tul. Reja 3, 42-202 Czestochowa\tNIP: 646-71-02-079";
		assertEquals(lancuch, kupujacy.toString());
	}
}
