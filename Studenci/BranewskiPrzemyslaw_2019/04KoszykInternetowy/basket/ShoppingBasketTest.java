package basket;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShoppingBasketTest {
	
	@Test
	public void addToShoppingBasketMethodCheck()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		assertEquals(product1.toString(), 
				basket.getProductFromShoppingBasketByPosition(0).toString());
	}
	
	@Test
	public void getProductByPositionMethodCheck1()
	{
		Product product1 = null;
		ShoppingBasket basket = new ShoppingBasket();
		Product toCompare = basket.getProductFromShoppingBasketByPosition(0);
		assertEquals(product1, toCompare);
	}
	
	@Test
	public void getProductByPositionMethodCheck2()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = null;
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		Product toCompare = basket.getProductFromShoppingBasketByPosition(10);
		assertEquals(product2, toCompare);
	}
	
	@Test
	public void getProductByPositionMethodCheck3()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		Product toCompare = basket.getProductFromShoppingBasketByPosition(1);
		assertEquals(product2.toString(), toCompare.toString());
	}
	
	@Test
	public void getPositionOfProductMethodCheck1()
	{
		int i = -1;
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		ShoppingBasket basket = new ShoppingBasket();
		int toCompare = basket.getPositionOfProductInShoppingBasket(product1);
		assertEquals(i, toCompare);
	}
	
	@Test
	public void getPositionOfProductMethodCheck2()
	{
		int i = -1;
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		int toCompare = basket.getPositionOfProductInShoppingBasket(product2);
		assertEquals(i, toCompare);
	}
	
	@Test
	public void getPositionOfProductMethodCheck3()
	{
		int i = 0;
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		int toCompare = basket.getPositionOfProductInShoppingBasket(product1);
		assertEquals(i, toCompare);
	}
	
	@Test
	public void removeProductFromShoppingBasketByPositionMethodCheck1()
	{
		int i = 0;
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.removeProductFromShoppingBasketByPosition(i);
		ShoppingBasket basket2 = new ShoppingBasket();
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void removeProductFromShoppingBasketByPositionMethodCheck2()
	{
		int i = 10;
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.removeProductFromShoppingBasketByPosition(i);
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product1);
		basket2.addToShoppingBasket(product2);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void removeProductFromShoppingBasketByPositionMethodCheck3()
	{
		int i = 0;
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.removeProductFromShoppingBasketByPosition(i);
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product2);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void removeProductFromShoppingBasketByProductMethodCheck1()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.removeProductFromShoppingBasketByProduct(product1);
		ShoppingBasket basket2 = new ShoppingBasket();
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void removeProductFromShoppingBasketByProductMethodCheck2()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.removeProductFromShoppingBasketByProduct(product3);
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product1);
		basket2.addToShoppingBasket(product2);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void removeProductFromShoppingBasketByProductMethodCheck3()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		basket1.removeProductFromShoppingBasketByProduct(product2);
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product1);
		basket2.addToShoppingBasket(product3);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void findTheCheapestOneMethodCheck1()
	{
		Product product1 = null;
		ShoppingBasket basket = new ShoppingBasket();
		Product toCompare = basket.findTheCheapestOne();
		assertEquals(product1, toCompare);
	}
	
	@Test
	public void findTheCheapestOneMethodCheck2()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		basket.addToShoppingBasket(product3);
		Product toCompare = basket.findTheCheapestOne();
		assertEquals(product2.getPrice(), toCompare.getPrice(), 0.01);
	}
	
	@Test
	public void findTheMostExpensiveOneMethodCheck1()
	{
		Product product1 = null;
		ShoppingBasket basket = new ShoppingBasket();
		Product toCompare = basket.findTheMostExpensiveOne();
		assertEquals(product1, toCompare);
	}
	
	@Test
	public void findTheMostExpensiveOneMethodCheck2()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		basket.addToShoppingBasket(product3);
		Product toCompare = basket.findTheMostExpensiveOne();
		assertEquals(product1.getPrice(), toCompare.getPrice());
	}
	
	@Test
	public void findNTheCheapestOnesMethodCheck1()
	{
		ShoppingBasket basket = new ShoppingBasket();
		ArrayList<Product> toCompare = basket.findNTheCheapestOnes(1);
		ArrayList<Product> basket3 = new ArrayList<>();
		assertEquals(basket3, toCompare);
	}
	
	@Test
	public void findNTheCheapestOnesMethodCheck2()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product product3 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product1);
		basket2.addToShoppingBasket(product2);
		basket2.addToShoppingBasket(product3);
		ArrayList<Product> basket3 = basket1.findNTheCheapestOnes(4);
		assertEquals(basket1.toString(), basket2.toString());
	}

	@Test
	public void findNTheCheapestOnesMethodCheck3()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		ArrayList<Product> basket2 = basket1.findNTheCheapestOnes(4);
		ArrayList<Product> basket3 = new ArrayList<>();
		basket3.add(product2);
		basket3.add(product3);
		basket3.add(product1);
		assertEquals(basket2.toString(), basket3.toString());
	}
	
	@Test
	public void findNTheCheapestOnesMethodCheck4()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		ArrayList<Product> basket2 = basket1.findNTheCheapestOnes(3);
		ArrayList<Product> basket3 = new ArrayList<>();
		basket3.add(product2);
		basket3.add(product3);
		basket3.add(product1);
		assertEquals(basket2.toString(), basket3.toString());
	}
	
	@Test
	public void findNTheCheapestOnesMethodCheck5()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		ArrayList<Product> basket2 = basket1.findNTheCheapestOnes(2);
		ArrayList<Product> basket3 = new ArrayList<>();
		basket3.add(product2);
		basket3.add(product3);
		assertEquals(basket2.toString(), basket3.toString());
	}
	
	@Test
	public void findNTheMostExpensiveOnesMethodCheck1()
	{
		ShoppingBasket basket = new ShoppingBasket();
		ArrayList<Product> toCompare = basket.findNTheMostExpensiveOnes(1);
		ArrayList<Product> basket3 = new ArrayList<>();
		assertEquals(basket3, toCompare);
	}
	
	@Test
	public void findNTheMostExpensiveOnesMethodCheck2()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product product3 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product1);
		basket2.addToShoppingBasket(product2);
		basket2.addToShoppingBasket(product3);
		ArrayList<Product> basket3 = basket1.findNTheMostExpensiveOnes(4);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void findNTheMostExpensiveOnesMethodCheck3()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product product3 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		ArrayList<Product> basket2 = basket1.findNTheMostExpensiveOnes(4);
		ArrayList<Product> basket3 = new ArrayList<>();
		basket3.add(product3);
		basket3.add(product2);
		basket3.add(product1);
		assertEquals(basket2.toString(), basket3.toString());
	}
	
	@Test
	public void findNTheMostExpensiveOnesMethodCheck4()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product product3 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		ArrayList<Product> basket2 = basket1.findNTheMostExpensiveOnes(3);
		ArrayList<Product> basket3 = new ArrayList<>();
		basket3.add(product3);
		basket3.add(product2);
		basket3.add(product1);
		assertEquals(basket2.toString(), basket3.toString());
	}
	
	@Test
	public void findNTheMostExpensiveOnesMethodCheck5()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product product3 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		ArrayList<Product> basket2 = basket1.findNTheMostExpensiveOnes(2);
		ArrayList<Product> basket3 = new ArrayList<>();
		basket3.add(product3);
		basket3.add(product2);
		assertEquals(basket2.toString(), basket3.toString());
	}
	
	@Test
	public void sortByPriceAscendingMethodCheck()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		basket1.sortShoppingBasketByPriceAscending();
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product2);
		basket2.addToShoppingBasket(product3);
		basket2.addToShoppingBasket(product1);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void sortByPriceDescendingMethodCheck()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product2 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product product3 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		basket1.sortShoppingBasketByPriceDescending();
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product3);
		basket2.addToShoppingBasket(product2);
		basket2.addToShoppingBasket(product1);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void sortByNameAscendingMethodCheck()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		basket1.sortShoppingBasketByNameAscending();
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product2);
		basket2.addToShoppingBasket(product3);
		basket2.addToShoppingBasket(product1);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void sortByNameDescendingMethodCheck()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		basket1.sortShoppingBasketByNameDescending();
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product1);
		basket2.addToShoppingBasket(product3);
		basket2.addToShoppingBasket(product2);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void defaultSortMethodCheck()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product product4 = new Product("4", "ABS Speakers", 499.99, 499.99);
		Product product5 = new Product("5", "HDMI Cable", 29.99, 29.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		basket1.addToShoppingBasket(product4);
		basket1.addToShoppingBasket(product5);
		basket1.defaultSortShoppingBasket();
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product4);
		basket2.addToShoppingBasket(product1);
		basket2.addToShoppingBasket(product3);
		basket2.addToShoppingBasket(product2);
		basket2.addToShoppingBasket(product5);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void getSummaryPriceWODiscountMethodCheck()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		double summaryPrice = 499.99 + 29.99 + 149.99;
		assertEquals(summaryPrice, basket1.getSummaryPriceWODiscount(), 0.01);
	}
	
	@Test
	public void getSummaryOfDiscountPriceMethodCheck()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 299.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 19.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 49.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		double summaryDiscountPrice = 299.99 + 19.99 + 49.99;
		assertEquals(summaryDiscountPrice, basket1.getSummaryOfDiscountPrice(), 0.01);
	}
	
	@Test
	public void setThe300DiscountMethodCheck()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		basket1.setThe300Discount();
		double summaryAfter300Discount = (499.99 + 29.99 + 149.99) * 0.95;
		assertEquals(summaryAfter300Discount, basket1.getSummaryOfDiscountPrice(),0.01);
	}
	
	@Test
	public void setThe3rdFreeMethodCheck()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.addToShoppingBasket(product3);
		basket1.setThe3rdFree();
		double summaryAfter3rdFree = 499.99 + 149.99 + 0.00;
		assertEquals(summaryAfter3rdFree, basket1.getSummaryOfDiscountPrice(), 0.01);
	}
	
	@Test
	public void setTheFreeMugMethodCheck()
	{
		Product mug = new Product("0", "The JavaMarkt Mug", 0.00, 0.00);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.setTheFreeMug();
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(mug);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void setThe30PercentDiscountMethodCheck()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product product4 = new Product("99", "Asus Mouse", 100.00, 100.00);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		basket.addToShoppingBasket(product3);
		basket.addToShoppingBasket(product4);
		basket.setThe30PercentDiscount();
		double summaryAfter30Percent = 499.99 + 29.99 + 149.99 + 70.00;
		assertEquals(summaryAfter30Percent, basket.getSummaryOfDiscountPrice(), 0.01);
	}
	
	@Test
	public void resetDiscountMethodCheck1()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		basket.addToShoppingBasket(product3);
		basket.setThe300Discount();
		basket.resetDiscount();
		double summaryAfterReseting = 499.99 + 29.99 + 149.99;
		assertEquals(summaryAfterReseting, basket.getSummaryOfDiscountPrice(), 0.01);
	}
	
	@Test
	public void resetDiscountMethodCheck2()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		basket.addToShoppingBasket(product3);
		basket.setThe3rdFree();
		basket.resetDiscount();
		double summaryAfterReseting = 499.99 + 29.99 + 149.99;
		assertEquals(summaryAfterReseting, basket.getSummaryOfDiscountPrice(), 0.01);
	}
	
	@Test
	public void resetDiscountMethodCheck3()
	{
		Product product1 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.setTheFreeMug();
		basket1.resetDiscount();
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product1);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void resetDiscountMethodCheck4()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product product4 = new Product("99", "Asus Mouse", 100.00, 100.00);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		basket.addToShoppingBasket(product3);
		basket.addToShoppingBasket(product4);
		basket.setThe30PercentDiscount();
		basket.resetDiscount();
		double summaryAfter30Percent = 499.99 + 29.99 + 149.99 + 100.00;
		assertEquals(summaryAfter30Percent, basket.getSummaryOfDiscountPrice(), 0.01);
	}
	
	@Test
	public void setAndApplyDiscountMethodCheck1()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		basket.addToShoppingBasket(product3);
		basket.setAndApplyDiscount();
		double summaryAfterDiscount = (499.99 + 29.99 + 149.99) * 0.95;
		assertEquals(summaryAfterDiscount, basket.getSummaryOfDiscountPrice(), 0.01);
	}
	
	@Test
	public void setAndApplyDiscountMethodCheck2()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 99.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		basket.addToShoppingBasket(product3);
		basket.setAndApplyDiscount();
		double summaryAfterDiscount = 99.99 + 0.00 + 149.99;
		assertEquals(summaryAfterDiscount, basket.getSummaryOfDiscountPrice(), 0.01);
	}
	
	@Test
	public void setAndApplyDiscountMethodCheck3()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 99.99, 499.99);
		Product product2 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product mug = new Product("0", "The JavaMarkt Mug", 0.00, 0.00);
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.addToShoppingBasket(product1);
		basket1.addToShoppingBasket(product2);
		basket1.setAndApplyDiscount();
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.addToShoppingBasket(product1);
		basket2.addToShoppingBasket(product2);
		basket2.addToShoppingBasket(mug);
		assertEquals(basket1.toString(), basket2.toString());
	}
	
	@Test
	public void setAndApplyDiscountMethodCheck4()
	{
		Product product1 = new Product("2", "Motorola Cell Phone", 499.99, 499.99);
		Product product2 = new Product("1", "Duracel Batteries", 29.99, 29.99);
		Product product3 = new Product("3", "JBL Headphones", 149.99, 149.99);
		Product product4 = new Product("99", "Asus Mouse", 100.00, 100.00);
		ShoppingBasket basket = new ShoppingBasket();
		basket.addToShoppingBasket(product1);
		basket.addToShoppingBasket(product2);
		basket.addToShoppingBasket(product3);
		basket.addToShoppingBasket(product4);
		basket.setAndApplyDiscount();
		double summaryAfterDiscount = 0.95 * (499.99 + 29.99 + 149.99) + 0.70 * 100.00;
		assertEquals(summaryAfterDiscount, basket.getSummaryOfDiscountPrice());
	}
}
