package lab2.javaMarkt;

public class ValuePromotion implements PromotionInterface {
	
	private double value_threshold;
	private double discount_percentage;
	
	public ValuePromotion(double value_threshold, double discount_percentage) {
		
		this.value_threshold = value_threshold;
		this.discount_percentage = discount_percentage;
	}
	
	public boolean isEligible(Basket koszyk) {
		
		if(koszyk.getBasketValue() >= value_threshold)
			return true;
		else
			return false;
		
	}
	public void applyPromotion(Basket koszyk) {
		
		if(this.isEligible(koszyk))
			koszyk.setBasketValue(koszyk.getBasketValue() * discount_percentage);
	}
}
