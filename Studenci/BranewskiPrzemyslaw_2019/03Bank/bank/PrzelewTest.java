package bank;

import java.time.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrzelewTest {
	
	@Test
	public void constructorDataOperacjiCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 25.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(LocalDate.now(), nadawca, odbiorca, kwota);
		assertEquals(data, przelew.getDataOperacji());
	}
	
	@Test
	public void constructorNadawcaCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 25.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(data, nadawca, odbiorca, kwota);
		assertEquals(nadawca, przelew.getNadawca());
	}
	
	@Test
	public void constructorOdbiorcaCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 25.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(data, nadawca, odbiorca, kwota);
		assertEquals(odbiorca, przelew.getOdbiorca());
	}
	
	@Test
	public void constructorKwotaOperacjiCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 25.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(data, nadawca, odbiorca, 25.00);
		assertEquals(kwota, przelew.getKwotaOperacji(), 0.01);
	}
	
	@Test
	public void constructorDateCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 25.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(LocalDate.now(), nadawca, odbiorca, kwota);
		assertEquals(data, przelew.getDataOperacji());
	}
	
	@Test
	public void successfulPrzelewSrodkiNadawcyInsideCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 20.00;
		double srodki = 30.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(data, nadawca, odbiorca, kwota);
		assertEquals(srodki, przelew.getNadawca().getSrodki(), 0.01);
	}
	
	@Test
	public void successfulPrzelewSrodkiOdbiorcyInsideCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 20.00;
		double srodki = 120.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(data, nadawca, odbiorca, kwota);
		assertEquals(srodki, przelew.getOdbiorca().getSrodki(), 0.01);
	}
	
	@Test
	public void successfulPrzelewSrodkiNadawcyOutsideCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 20.00;
		double srodki = 30.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(data, nadawca, odbiorca, kwota);
		assertEquals(srodki, nadawca.getSrodki(), 0.01);
	}
	
	@Test
	public void successfulPrzelewSrodkiOdbiorcyOutsideCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 20.00;
		double srodki = 120.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(data, nadawca, odbiorca, kwota);
		assertEquals(srodki, odbiorca.getSrodki(), 0.01);
	}
	
	@Test
	public void failPrzelewSrodkiNadawcyCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 120.00;
		double srodki = 50.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(data, nadawca, odbiorca, kwota);
		assertEquals(srodki, przelew.getNadawca().getSrodki(), 0.01);
	}
	
	@Test
	public void failPrzelewSrodkiOdbiorcyCheck()
	{
		KontoBankowe nadawca = new KontoBankowe(50.00, "37 1240 1169 0000 2117 6900 1001",
				  								"Jan", "Kowalski", 
				  								"ul. Sikorskiego 73, 61-001 Poznan", 
				  							  	"69020639261");
		KontoBankowe odbiorca = new KontoBankowe(100.00, "12 1240 0000 8463 0099 4555 9238",
												 "Krzysztof", "Nowak",
												 "ul. Grójecka 13, 00-000 Warszawa",
												 "57111105095");
		double kwota = 120.00;
		double srodki = 100.00;
		LocalDate data = LocalDate.now();
		Przelew przelew = new Przelew(data, nadawca, odbiorca, kwota);
		assertEquals(srodki, przelew.getOdbiorca().getSrodki(), 0.01);
	}
}
