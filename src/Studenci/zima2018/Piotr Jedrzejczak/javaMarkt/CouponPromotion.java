package lab2.javaMarkt;

public class CouponPromotion implements PromotionInterface {
	
	double discount_percentage = 0.70;
	
	public boolean isEligible(Basket koszyk) {
		return true;
	}
	public void applyPromotion(Basket koszyk) {
		
		if (this.isEligible(koszyk)) {
			double discount_amount = koszyk.getProductFromBasket().getPrice() * discount_percentage;
			koszyk.setBasketValue(koszyk.getBasketValue() - discount_amount);
		}
	}
}
