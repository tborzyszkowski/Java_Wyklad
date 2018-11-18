package lab2.javaMarkt;

public class ThreeForTwoPromotion implements PromotionInterface{
	
	public boolean isEligible(Basket koszyk) {
		if (koszyk.getBasketContent().size() > 2)
			return true;
		else
			return false;
	}
	
	public void applyPromotion(Basket koszyk) {
		
		koszyk.setBasketValue(koszyk.getBasketValue() - koszyk.getCheapestProduct(koszyk).getPrice() );
		
	}
}
