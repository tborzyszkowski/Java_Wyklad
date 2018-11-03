package Laboratorium.JavaMarkt.model;

import java.util.*;

public class Cart {
	List<CartItem> items = new ArrayList<>();
	List<IPromotion> promotions = new ArrayList<>();
	
	double promotionSumOfProducts = 0;
	
	public double totalPriceOfProducts(){
		double sum = 0;
		for(CartItem it : items)
			sum += it.getProduct().getPrice();
		return sum;
	}
	public double totalPriceOfDiscountedProducts(){
		double sum = 0;
		for(CartItem it : items)
			sum += it.getCurrentPrice();
		return sum;
	}
	public List<CartItem> getItems() {
		return items;
	}
	
	public Cart addProduct(Product p) {
		items.add(new CartItem(p));
		promotionSumOfProducts += p.getPrice(); 
		return this;
	}

	public Cart removeProduct(Product p) {
		items.remove(new CartItem(p));
		promotionSumOfProducts -= p.getPrice(); 
		return this;
	}
	
	public Cart addPromotion(IPromotion p) {
		promotions.add(p);
		return this;
	}
	
	public Cart removePromotion(IPromotion p) {
		promotions.remove(p);
		return this;
	}

	public Cart applyPromotions(){
		for(IPromotion p : promotions){
			p.CalculateOffer(this);
		}
		return this;
	}
	@Override
	public String toString() {
		return "Cart(\nitems=" + items + "\npromotions=" + promotions + "\npromotionSumOfProducts="
				+ promotionSumOfProducts + "\n)";
	}

}
