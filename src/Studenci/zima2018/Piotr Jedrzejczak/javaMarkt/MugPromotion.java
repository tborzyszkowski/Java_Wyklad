package lab2.javaMarkt;

public class MugPromotion implements PromotionInterface {
	
	public boolean isEligible(Basket koszyk) {
		
		if(koszyk.getBasketValue() >= 200)
			return true;
		else
			return false;
		
	}
	public void applyPromotion(Basket koszyk) {
		
		if(this.isEligible(koszyk))
			koszyk.addProductToBasket(new Product("P999", "Branded Mug", 0.00));
	
	}

}
