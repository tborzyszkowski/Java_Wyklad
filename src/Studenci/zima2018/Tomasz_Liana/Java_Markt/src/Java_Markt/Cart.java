package Java_Markt;

import java.util.*;

public class Cart {
	List<CartItem> items = new ArrayList<>();
	List<IPromotion> promotions = new ArrayList<>();
	
	double promotionSumOfProducts = 0;
	
	public double totalPriceOfProducts(){
		double sum = 0;
		for(CartItem item : items)
			sum += item.getProduct().getPrice();
		return sum;
	}
	public double totalPriceOfDiscountedProducts(){
		double sum = 0;
		for(CartItem item : items)
			sum += item.getCurrentPrice();
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
		promotionSumOfProducts -= p.getPrice()*0.95; 
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
	
	public boolean remove(Object o) {
		return items.remove(o);
	}
	

	@Override
	public String toString() {
		return "Koszyk: \n" + items + "\npromocje:" + promotions + "\npromotionSumOfProducts="
				+ promotionSumOfProducts + "\n)";
	}

}
