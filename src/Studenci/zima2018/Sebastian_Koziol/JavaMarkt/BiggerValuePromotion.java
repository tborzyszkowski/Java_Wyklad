package JavaMarkt.JavaMarkt2;

public class BiggerValuePromotion implements IPromotion{

	@Override
	public boolean CanCalculate(Cart cart) {
		double koszykBrutto = cart.totalPriceOfProducts();
		if (koszykBrutto >= 1000) 
			return true;
		else
			return false;
	}

	@Override
	public void CalculateOffer(Cart cart) {
		if (this.CanCalculate(cart)) {
			cart.promotionSumOfProducts = cart.totalPriceOfProducts() * 0.90;
		}
	}
	
	@Override
	public String toString() {
				return "Value of promotion 10% off";
	}
}