package basket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {
	
	@Test
	public void explicitConstructorCodeCheck()
	{
		Product product = new Product("12345", "Oracle Microchip", 59.99, 59.99);
		String code = "12345";
		assertEquals(code, product.getCode());
	}
	
	@Test
	public void explicitConstructorNameCheck()
	{
		Product product = new Product("12345", "Oracle Microchip", 59.99, 59.99);
		String name = "Oracle Microchip";
		assertEquals(name, product.getName());
	}
	
	@Test
	public void explicitConstructorPriceCheck()
	{
		Product product = new Product("12345", "Oracle Microchip", 59.99, 49.99);
		double price = 59.99;
		assertEquals(price, product.getPrice(), 0.01);
	}
	
	@Test
	public void explicitConstructorDiscountPriceCheck()
	{
		Product product = new Product("12345", "Oracle Microchip", 59.99, 49.99);
		double discountPrice = 49.99;
		assertEquals(discountPrice, product.getDiscountPrice());
	}
	
	@Test
	public void productConstructorCodeCheck()
	{
		Product product = new Product("12345", "Oracle Microchip", 59.99, 59.99);
		Product toCompare = new Product(product);
		String code = "12345";
		assertEquals(code, toCompare.getCode());
	}
	
	@Test
	public void productConstructorNameCheck()
	{
		Product product = new Product("12345", "Oracle Microchip", 59.99, 59.99);
		Product toCompare = new Product(product);
		String name = "Oracle Microchip";
		assertEquals(name, toCompare.getName());
	}
	
	@Test
	public void productConstructorPriceCheck()
	{
		Product product = new Product("12345", "Oracle Microchip", 59.99, 49.99);
		double price = 59.99;
		Product toCompare = new Product(product);
		assertEquals(price, toCompare.getPrice(), 0.01);
	}
	
	@Test
	public void productConstructorDiscountPriceCheck()
	{
		Product product = new Product("12345", "Oracle Microchip", 59.99, 49.99);
		Product toCompare = new Product(product);
		double discountPrice = 49.99;
		assertEquals(discountPrice, toCompare.getDiscountPrice());
	}
}
