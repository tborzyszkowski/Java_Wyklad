package fvat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FakturaTest {
	
	@Test
	public void prototypeConstructorSPRZEDAJACYBankAccountCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-18", "2019-11-18");
		String konto = "37 1240 1169 0000 2117 6900 1001";
		assertEquals(konto, dokument.getSprzedajacy().getKONTO());
	}
	
	@Test
	public void prototypeConstructorSPRZEDAJACYNameCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-18", "2019-11-18");
		String nazwaSprzedawcy = "Elektroniker S.A.";
		assertEquals(nazwaSprzedawcy, dokument.getSprzedajacy().getNazwaFirmy());
	}
	
	@Test
	public void prototypeConstructorSPRZEDAJACYAddressCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-18", "2019-11-18");
		String adresSprzedawcy = "ul. Sikorskiego 73, 61-001 Poznan";
		assertEquals(adresSprzedawcy, dokument.getSprzedajacy().getAdresFirmy());
	}
	
	@Test
	public void prototypeConstructorSPRZEDAJACYNIPNumberCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-18", "2019-11-18");
		String numerNIPSprzedawcy = "692-06-03-926";
		assertEquals(numerNIPSprzedawcy, dokument.getSprzedajacy().getNumerNIP());
	}
	
	@Test
	public void prototypeConstructorklientNameCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-18", "2019-11-18");
		String nazwaKupujacego = "Y-Kom";
		assertEquals(nazwaKupujacego, dokument.getKupujacy().getNazwaFirmy());
	}
	
	@Test
	public void prototypeConstructorklientAddressCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-18", "2019-11-18");
		String adresKupujacego = "ul. Reja 3, 42-202 Czestochowa";
		assertEquals(adresKupujacego, dokument.getKupujacy().getAdresFirmy());
	}
	
	@Test
	public void prototypeConstructorklientNIPNumberCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-18", "2019-11-18");
		String numerNIPKupujacego = "646-71-02-079";
		assertEquals(numerNIPKupujacego, dokument.getKupujacy().getNumerNIP());
	}
	
	@Test
	public void prototypeConstructorDateOfDocumentCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-19", "2019-11-20");
		String dataWystawieniaDokumentu = "2019-11-18";
		assertEquals(dataWystawieniaDokumentu, dokument.getDataWystawieniaDokumentu());
	}
	
	@Test
	public void prototypeConstructorDateOfSellingCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-19", "2019-11-20");
		String dataSprzedazy = "2019-11-19";
		assertEquals(dataSprzedazy, dokument.getDataSprzedazy());
	}
	
	@Test
	public void prototypeConstructorDateOfPaymentCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-19", "2019-11-20");
		String dataZakupu = "2019-11-20";
		assertEquals(dataZakupu, dokument.getDataZaplaty());
	}
	
	@Test
	public void prototypeConstructorInitialAmountOfProducts()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-19", "2019-11-20");
		String produkty = "";
		assertEquals(produkty, dokument.wszystkiePozycjeFaktury());
	}
	
	@Test
	public void prototypeConstructorInitialValueCheck()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-19", "2019-11-20");
		double poczatkowaWartosc = 0.00;
		assertEquals(poczatkowaWartosc, dokument.getWartoscCalkowitaFaktury(), 0.01);
	}
	
	@Test
	public void dodajPozycjeFakturyCheck1()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-19", "2019-11-20");
		PozycjaFaktury pozycja = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		dokument.dodajPozycjeFaktury(pozycja);
		assertEquals(pozycja.toString(), dokument.wszystkiePozycjeFaktury());
	}
	
	@Test
	public void dodajPozycjeFakturyCheck2()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-19", "2019-11-20");
		PozycjaFaktury pozycja1 = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		PozycjaFaktury pozycja2 = new PozycjaFaktury("ASUS R541U", 3, 1299.99, 23);
		dokument.dodajPozycjeFaktury(pozycja1);
		dokument.dodajPozycjeFaktury(pozycja2);
		assertEquals(pozycja1.toString() + pozycja2.toString(), dokument.wszystkiePozycjeFaktury());
	}
	
	@Test
	public void wartoscCalkowitaFakturyCheck1()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-19", "2019-11-20");
		PozycjaFaktury pozycja = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		dokument.dodajPozycjeFaktury(pozycja);
		double wartosc = 2 * 3199.99 * 1.23;
		assertEquals(wartosc, dokument.getWartoscCalkowitaFaktury(), 0.01);
	}
	
	@Test
	public void wartoscCalkowitaFakturyCheck2()
	{
		DaneFaktury klient = new DaneFaktury("Y-Kom", "ul. Reja 3, 42-202 Czestochowa", "646-71-02-079");
		Faktura dokument = new Faktura(klient, "2019-11-18", "2019-11-19", "2019-11-20");
		PozycjaFaktury pozycja1 = new PozycjaFaktury("DELL Vostro 5581", 2, 3199.99, 23);
		PozycjaFaktury pozycja2 = new PozycjaFaktury("ASUS R541U", 3, 1299.99, 23);
		dokument.dodajPozycjeFaktury(pozycja1);
		dokument.dodajPozycjeFaktury(pozycja2);
		double wartosc = (2 * 3199.99 + 3 * 1299.99) * 1.23;
		assertEquals(wartosc, dokument.getWartoscCalkowitaFaktury(), 0.01);
	}
}