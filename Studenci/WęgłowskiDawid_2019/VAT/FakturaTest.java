import org.junit.*;

public class FakturaTest
{
	@Test
	public void prototypeConstructorGetNrFaktury()
	{
		Faktura.prevNrFaktury=0;
		Osoba dzieciol = new Osoba("Dzieciol", "Warszawa Zielona 2", "0123456789", "1234123412341234");
		Osoba kruk = new Osoba("Kruk", "Zakopane Drzazgowa 7", "9876543210", "43214321432124321");
		Faktura first = new Faktura(dzieciol, kruk, "2019-03-31", "2019-04-04", "2019-04-09");
		Assert.assertEquals(1, first.getNrFaktury());
	}

	@Test
	public void prototypeConstructorGetCena()
	{
		Osoba dzieciol = new Osoba("Dzieciol", "Warszawa Zielona 2", "0123456789", "1234123412341234");
		Osoba kruk = new Osoba("Kruk", "Zakopane Drzazgowa 7", "9876543210", "43214321432124321");
		Produkt prod1 = new Produkt("Jablko", 5, 2.12, 0.23);
		Produkt prod2 = new Produkt("Stol",2,122.62, 0.23);
		Faktura testFaktura = new Faktura(dzieciol, kruk, "2019-03-31", "2019-04-04", "2019-04-09");
		testFaktura.addProdukt(prod1);
		testFaktura.addProdukt(prod2);
		Assert.assertEquals(314.68, testFaktura.getCena(), 0.01);
	}

	@Test
	public void prototypeConstructorGetData()
	{
		Osoba dzieciol = new Osoba("Dzieciol", "Warszawa Zielona 2", "0123456789", "1234123412341234");
		Osoba kruk = new Osoba("Kruk", "Zakopane Drzazgowa 7", "9876543210", "43214321432124321");
		Produkt prod1 = new Produkt("Jablko", 5, 2.12, 0.23);
		Produkt prod2 = new Produkt("Stol",2,122.62, 0.23);
		Faktura testFaktura = new Faktura(dzieciol, kruk, "2019-03-31", "2019-04-04", "2019-04-09");
		testFaktura.addProdukt(prod1);
		testFaktura.addProdukt(prod2);
		Assert.assertEquals("2019-03-31", testFaktura.getDW());
		Assert.assertEquals("2019-04-04", testFaktura.getDS());
		Assert.assertEquals("2019-04-09", testFaktura.getDZ());
	}

	@Test
	public void prototypeConstructorGetOsoba()
	{
		Osoba dzieciol = new Osoba("Dzieciol", "Warszawa Zielona 2", "0123456789", "1234123412341234");
		Osoba kruk = new Osoba("Kruk", "Zakopane Drzazgowa 7", "9876543210", "43214321432124321");
		Faktura testFaktura = new Faktura(dzieciol, kruk, "2019-03-31", "2019-04-04", "2019-04-09");
		Assert.assertEquals(dzieciol, testFaktura.getKlient());
		Assert.assertEquals(kruk, testFaktura.getSprzedajacy());
	}

	@Test
	public void prototypeConstructorPrintFaktura()
	{
		Osoba dzieciol = new Osoba("Dzieciol", "Warszawa Zielona 2", "0123456789", "1234123412341234");
		Osoba kruk = new Osoba("Kruk", "Zakopane Drzazgowa 7", "9876543210", "43214321432124321");
		Produkt prod1 = new Produkt("Jablko", 5, 2.12, 0.23);
		Produkt prod2 = new Produkt("Stol",2,122.62, 0.23);
		Faktura testFaktura = new Faktura(dzieciol, kruk, "2019-03-31", "2019-04-04", "2019-04-09");
		testFaktura.addProdukt(prod1);
		testFaktura.addProdukt(prod2);
		Assert.assertEquals("Nr. Faktury: 1\nSprzedajacy: Kruk\nKlient: Dzieciol\nData sprzedazy: 2019-04-04\nData zaplaty: 2019-04-09\nData wystawienia: 2019-03-31\nJablko\nStol", testFaktura.printFaktura());
	}
}
