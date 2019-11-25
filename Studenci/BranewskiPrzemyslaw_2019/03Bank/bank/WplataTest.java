package bank;

import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WplataTest {
	
	@Test
	public void constructorKontoCheck()
	{
		KontoBankowe konto = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
				  			"Jan", "Kowalski", 
				  			"ul. Sikorskiego 73, 61-001 Poznan", 
				  			"69020639261");
		Wplata wplata = new Wplata(konto, LocalDate.now(), 100.00);
		assertEquals(konto, wplata.getKontoWplaty());
	}
	
	@Test
	public void constructorDataCheck()
	{
		KontoBankowe konto = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
				  			"Jan", "Kowalski", 
				  			"ul. Sikorskiego 73, 61-001 Poznan", 
				  			"69020639261");
		LocalDate data = LocalDate.now();
		Wplata wplata = new Wplata(konto, LocalDate.now(), 100.00);
		assertEquals(data, wplata.getDataWplaty());
	}
	
	@Test
	public void constructorKwotaWplatyCheck()
	{
		KontoBankowe konto = new KontoBankowe(0.00, "37 1240 1169 0000 2117 6900 1001",
				  			"Jan", "Kowalski", 
				  			"ul. Sikorskiego 73, 61-001 Poznan", 
				  			"69020639261");
		double kwota = 100.00;
		Wplata wplata = new Wplata(konto, LocalDate.now(), 100.00);
		assertEquals(kwota, wplata.getKwotaWplaty(), 0.01);
	}
	
	@Test
	public void constructorPowiekszKontoOKwoteCheckFromOutside()
	{
		KontoBankowe konto = new KontoBankowe(48.00, "37 1240 1169 0000 2117 6900 1001",
				  			"Jan", "Kowalski", 
				  			"ul. Sikorskiego 73, 61-001 Poznan", 
				  			"69020639261");
		double kwota = 149.99;
		Wplata wplata = new Wplata(konto, LocalDate.now(), 101.99);
		assertEquals(kwota, konto.getSrodki(), 0.01);
	}
	
	@Test
	public void constructorPowiekszKontoOKwoteCheckFromInside()
	{
		KontoBankowe konto = new KontoBankowe(48.00, "37 1240 1169 0000 2117 6900 1001",
				  			"Jan", "Kowalski", 
				  			"ul. Sikorskiego 73, 61-001 Poznan", 
				  			"69020639261");
		double kwota = 149.99;
		Wplata wplata = new Wplata(konto, LocalDate.now(), 101.99);
		assertEquals(kwota, wplata.getKontoWplaty().getSrodki(), 0.01);
	}
}
