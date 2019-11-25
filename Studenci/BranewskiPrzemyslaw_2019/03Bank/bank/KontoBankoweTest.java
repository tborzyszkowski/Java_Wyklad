package bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KontoBankoweTest {
	
	@Test
	public void stringConstructorSrodkiCheck()
	{
		KontoBankowe konto = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
				  							  "Jan", "Kowalski", 
				  							  "ul. Sikorskiego 73, 61-001 Poznan", 
				  							  "69020639261");
		double srodki = 0.00;
		assertEquals(srodki, konto.getSrodki(), 0.01);
	}
	
	@Test
	public void stringConstructorNumerKontaCheck()
	{
		KontoBankowe konto = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
											  "Jan", "Kowalski", 
											  "ul. Sikorskiego 73, 61-001 Poznan", 
											  "69020639261");
		String numerKonta = "37 1240 1169 0000 2117 6900 1001";
		assertEquals(numerKonta, konto.getNumerKonta());
	}
	
	@Test
	public void stringConstructorImieCheck()
	{
		KontoBankowe konto = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
											  "Jan", "Kowalski", 
											  "ul. Sikorskiego 73, 61-001 Poznan", 
											  "69020639261");
		String imie = "Jan";
		assertEquals(imie, konto.getImie());
	}
	
	@Test
	public void stringConstructorNazwiskoCheck()
	{
		KontoBankowe konto = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
											  "Jan", "Kowalski", 
											  "ul. Sikorskiego 73, 61-001 Poznan", 
											  "69020639261");
		String nazwisko = "Kowalski";
		assertEquals(nazwisko, konto.getNazwisko());
	}
	
	@Test
	public void stringConstructorAdresCheck()
	{
		KontoBankowe konto = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
											  "Jan", "Kowalski", 
											  "ul. Sikorskiego 73, 61-001 Poznan", 
											  "69020639261");
		String adres = "ul. Sikorskiego 73, 61-001 Poznan";
		assertEquals(adres, konto.getAdres());
	}
	
	@Test
	public void stringConstructorPeselCheck()
	{
		KontoBankowe konto = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
											  "Jan", "Kowalski", 
											  "ul. Sikorskiego 73, 61-001 Poznan", 
											  "69020639261");
		String pesel = "69020639261";
		assertEquals(pesel, konto.getPesel());
	}
	
	@Test
	public void classConstructorSrodkiCheck()
	{
		KontoBankowe konto1 = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
				  							  "Jan", "Kowalski", 
				  							  "ul. Sikorskiego 73, 61-001 Poznan", 
				  							  "69020639261");
		KontoBankowe konto2 = new KontoBankowe(konto1);
		double srodki = 0.00;
		assertEquals(srodki, konto2.getSrodki(), 0.01);
	}
	
	@Test
	public void classConstructorNumerKontaCheck()
	{
		KontoBankowe konto1 = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
											  "Jan", "Kowalski", 
											  "ul. Sikorskiego 73, 61-001 Poznan", 
											  "69020639261");
		KontoBankowe konto2 = new KontoBankowe(konto1);
		String numerKonta = "37 1240 1169 0000 2117 6900 1001";
		assertEquals(numerKonta, konto2.getNumerKonta());
	}
	
	@Test
	public void classConstructorImieCheck()
	{
		KontoBankowe konto1 = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
											  "Jan", "Kowalski", 
											  "ul. Sikorskiego 73, 61-001 Poznan", 
											  "69020639261");
		KontoBankowe konto2 = new KontoBankowe(konto1);
		String imie = "Jan";
		assertEquals(imie, konto2.getImie());
	}
	
	@Test
	public void classConstructorNazwiskoCheck()
	{
		KontoBankowe konto1 = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
											  "Jan", "Kowalski", 
											  "ul. Sikorskiego 73, 61-001 Poznan", 
											  "69020639261");
		KontoBankowe konto2 = new KontoBankowe(konto1);
		String nazwisko = "Kowalski";
		assertEquals(nazwisko, konto2.getNazwisko());
	}
	
	@Test
	public void classConstructorAdresCheck()
	{
		KontoBankowe konto1 = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
											  "Jan", "Kowalski", 
											  "ul. Sikorskiego 73, 61-001 Poznan", 
											  "69020639261");
		KontoBankowe konto2 = new KontoBankowe(konto1);
		String adres = "ul. Sikorskiego 73, 61-001 Poznan";
		assertEquals(adres, konto2.getAdres());
	}
	
	@Test
	public void classConstructorPeselCheck()
	{
		KontoBankowe konto1 = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
											  "Jan", "Kowalski", 
											  "ul. Sikorskiego 73, 61-001 Poznan", 
											  "69020639261");
		KontoBankowe konto2 = new KontoBankowe(konto1);
		String pesel = "69020639261";
		assertEquals(pesel, konto2.getPesel());
	}
}
