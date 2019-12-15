package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

//	Product p1 = new Product("Jabłko", 1,1.23 );
//	Product p2 = new Product("Gruszka",2, 1.23);
//	Product p3 = new Product("Pietruszka",3, 1.23);
	
	@Test
	public void testProductName()
	{
		Product p1 = new Product("Jablko", 1.00, 1.23, 5);
		String name = "Jablko";
		assertEquals(name, p1.getProductName());
	}
	
	@Test
	public void testNetPrice() {
		Product p1 = new Product("Jablko", 1.00, 1.23, 5);
		double netPrice = 1.00;
		assertEquals(netPrice, p1.getNetPrice(), 0.01);
	}
	
	@Test
	public void testVat() {
		Product p1 = new Product("Jablko", 1.00, 1.23, 5);
		double vat = 1.23;
		assertEquals(vat, p1.getVat(), 0.01);
	}
	
	@Test
	public void testQuantity() {
		Product p1 = new Product("Jablko", 1.00, 1.23, 5);
		int quantity = 5;
		assertEquals(quantity, p1.getQuantity(), 0.01);
	}
	
	@Test
	public void testQuantityNetPrice() {
		Product p1 = new Product("Jablko", 1.00, 1.23, 5);
		p1.setQuantityNETPrice();
		double netQuantityNetPrice = 5 * 1.00;
		assertEquals(netQuantityNetPrice, p1.getQuantityNETPrice(), 0.01);
	}
	
	@Test
	public void testSumGross() {
		Product p1 = new Product("Jablko", 1.00, 1.23, 5);
		p1.setSumGross();
		double sumGross = 1.00 * 1.23 * 5;
		assertEquals(sumGross, p1.getSumGross(), 0.01);
	}
}
