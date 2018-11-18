package lab2.javaMarkt;

import java.util.ArrayList;
import java.util.Comparator;

public class Basket {

	private ArrayList<Product> basket_content = new ArrayList<Product>();
	private ArrayList<PromotionInterface> promotions = new ArrayList<PromotionInterface>();
	private double basket_value = 0.0;
	
	
	public void addPromotionToBasket(PromotionInterface promotion) {
		
		promotions.add(promotion);
		
	}
	
	public void addProductToBasket(Product p) {
		
		double price = p.getPrice();
		basket_content.add(p);
		basket_value += price;
			
	}
	
	public ArrayList<Product> getNCheapestProducts(Basket b, int n){
	
		ArrayList<Product> cheapest_products = new ArrayList<Product>();
		
		for(int i = 0; i < n; i++) {
			cheapest_products.add(b.getCheapestProduct(b));
			basket_content.remove(0);
		}
		basket_content.addAll(cheapest_products);
		
		return cheapest_products;
	}
	
	public ArrayList<Product> getNMostExpensiveProducts(Basket b, int n){
		
		ArrayList<Product> most_expensive_products = new ArrayList<Product>();
		basket_content = b.getBasketContent();
		
		for(int i = 0; i < n; i++) {
			most_expensive_products.add(b.getMostExpensiveProduct(b));
			basket_content.remove(basket_content.size() - 1);
		}
		basket_content.addAll(most_expensive_products);
		
		return most_expensive_products;
	}
	
	public Basket sortBasketByPriceAndName(Basket b) {
		
		basket_content = getBasketContent();
		basket_content.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getName));
		
		return this;
	}
	
	public ArrayList<Product> sortBasketByPrice(Basket b) {
		
		basket_content = getBasketContent();
		basket_content.sort(Comparator.comparing(Product::getPrice));
		
		return basket_content;
	}
	public String productSelector() {
		
		String name = "Beetroot";
		return name;
	}
	
	public Product getProductFromBasket() {
		Product chosen_product = new Product();
		
		for (Product p : basket_content) {
			if (p.getName().equals(productSelector())) {
				chosen_product = p;
			}
		}
		return chosen_product;
	}
	
	public Product getCheapestProduct(Basket b) {
		
		basket_content = sortBasketByPrice(b);
		return basket_content.get(0);
	}
	
	public Product getMostExpensiveProduct(Basket b) {
		
		basket_content = b.sortBasketByPrice(b);
		return basket_content.get(basket_content.size() - 1);
	}
	
	public void setBasketValue(double basket_value) {
		this.basket_value = basket_value;
	}
	
	public double getBasketValue() {
		return basket_value;
	}
	
	public ArrayList<Product> getBasketContent() {
		return basket_content;
	}
	
	public ArrayList<PromotionInterface> getPromotions() {
		return promotions;
	}
	
	public Basket toCheckout() {
		
		for (PromotionInterface p : promotions) {
			p.applyPromotion(this);
		}
		return this;
	}
	
	@Override
	public String toString() {
		return "Your Basket = " + basket_content + "\nBasket Value = " + basket_value + "\n";
	}
	
	
}
