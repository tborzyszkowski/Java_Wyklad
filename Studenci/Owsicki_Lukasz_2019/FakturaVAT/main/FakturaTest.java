package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FakturaTest {

	@Test
	public void testFakturaNR() {
		Faktura f1 = new Faktura("Biedronka", "Sopot", 1123456789);
		Product p1 = new Product("Jabłko", 1,1.23, 5 );
 		Product p2 = new Product("Gruszka",2, 1.23, 4);
		Product p3 = new Product("Pietruszka",3, 1.23, 3);
		assertEquals(1, f1.getFakturaNR());
	}
	
	@Test
	public void testTotalGross() {
		Faktura f1 = new Faktura("Biedronka", "Sopot", 1123456789);
		Product p1 = new Product("Jabłko", 1.00,1.23, 5 );
		p1.setSumGross();
 		Product p2 = new Product("Gruszka",2.00, 1.23, 4);
		p2.setSumGross();
 		Product p3 = new Product("Pietruszka",3.00, 1.23, 3);
		p3.setSumGross();
 		f1.faktura.add(p1);
		f1.faktura.add(p2);
		f1.faktura.add(p3);
		f1.setSumTotalGross();
		double sumTotalGross = p1.getSumGross() + p2.getSumGross() + p3.getSumGross();
		assertEquals(sumTotalGross, f1.getSumTotalGross(), 0.01);
	}
	
	@Test
	public void testClient() {
		Faktura f1 = new Faktura("Biedronka", "Sopot", 1123456789);
		Client client = new Client("Biedronka", "Sopot", 1123456789);
		assertEquals(client.toString(), f1.getClient().toString());
	}
	
	@Test
	public void testPayDay() {
		
		Faktura f1 = new Faktura("Biedronka", "Sopot", 1123456789);
		f1.setPayDay();
		LocalDate date = LocalDate.now();
		assertEquals(date.toString(), f1.getPayDay().toString());
	}
}
