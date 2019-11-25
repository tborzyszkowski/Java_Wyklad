package bank;

import java.time.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WyplataTest {
	
	@Test
	public void constructorKontoCheck()
	{
		KontoBankowe konto = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  							  "Jan", "Kowalski", 
				  							  "ul. Sikorskiego 73, 61-001 Poznan", 
				  							  "69020639261");
		Wyplata wyplata = new Wyplata(konto, LocalDate.now(), 1.00);
		assertEquals(konto, wyplata.getKontoWyplaty());
	}
	
	@Test
	public void constructorDataCheck()
	{
		KontoBankowe konto = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  							  "Jan", "Kowalski", 
				  							  "ul. Sikorskiego 73, 61-001 Poznan", 
				  							  "69020639261");
		LocalDate data = LocalDate.now();
		Wyplata wyplata = new Wyplata(konto, LocalDate.now(), 1.00);
		assertEquals(data, wyplata.getDataWyplaty());
	}
	
	@Test
	public void constructorKwotaWyplatyCheck()
	{
		KontoBankowe konto = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  							  "Jan", "Kowalski", 
				  							  "ul. Sikorskiego 73, 61-001 Poznan", 
				  							  "69020639261");
		double kwota = 1.01;
		Wyplata wyplata = new Wyplata(konto, LocalDate.now(), 1.01);
		assertEquals(kwota, wyplata.getKwotaWyplaty(), 0.01);
	}
	
	@Test
	public void successfulWyplataSrodkiCheck()
	{
		KontoBankowe konto = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  							  "Jan", "Kowalski", 
				  							  "ul. Sikorskiego 73, 61-001 Poznan", 
				  							  "69020639261");
		double kwota = 48.99;
		Wyplata wyplata = new Wyplata(konto, LocalDate.now(), 1.01);
		assertEquals(kwota, wyplata.getKontoWyplaty().getSrodki(), 0.01);
	}
	
	@Test
	public void successfulWyplataPowodzenieCheck()
	{
		KontoBankowe konto = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  							  "Jan", "Kowalski", 
				  							  "ul. Sikorskiego 73, 61-001 Poznan", 
				  							  "69020639261");
		boolean powodzenie = true;
		Wyplata wyplata = new Wyplata(konto, LocalDate.now(), 1.01);
		assertEquals(powodzenie, wyplata.getPowodzenieWyplaty());
	}
	
	@Test
	public void failWyplataSrodkiCheck()
	{
		KontoBankowe konto = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  							  "Jan", "Kowalski", 
				  							  "ul. Sikorskiego 73, 61-001 Poznan", 
				  							  "69020639261");
		double kwota = 50.00;
		Wyplata wyplata = new Wyplata(konto, LocalDate.now(), 51.00);
		assertEquals(kwota, wyplata.getKontoWyplaty().getSrodki(), 0.01);
	}
	
	@Test
	public void failWyplataPowodzenieCheck()
	{
		KontoBankowe konto = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  							  "Jan", "Kowalski", 
				  							  "ul. Sikorskiego 73, 61-001 Poznan", 
				  							  "69020639261");
		boolean powodzenie = false;
		Wyplata wyplata = new Wyplata(konto, LocalDate.now(), 51.00);
		assertEquals(powodzenie, wyplata.getPowodzenieWyplaty());
	}
}
