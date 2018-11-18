package lab2.javaMarkt;

public interface PromotionInterface {
	
	boolean isEligible(Basket koszyk);
	void applyPromotion(Basket koszyk);
	
}
