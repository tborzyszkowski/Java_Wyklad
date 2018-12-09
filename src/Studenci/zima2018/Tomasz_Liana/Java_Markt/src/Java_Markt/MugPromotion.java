package Java_Markt;

public class MugPromotion implements IPromotion{

	@Override
	public boolean CanCalculate(Cart cart) {
		double koszykBrutto = cart.totalPriceOfProducts();
		if (koszykBrutto >= 200)
			return true;
		else
			return false;
	}

	boolean mugAdded(Cart cart) {
		boolean itIs = false;
		for(CartItem it : cart.getItems()) {
			if (it.getProduct().getName().equals("Kubek promocyjny")) {
				itIs = true;
			}
		}
		return itIs;
	}
	
	@Override
	public void CalculateOffer(Cart cart) {
		if (this.CanCalculate(cart) && !this.mugAdded(cart))
			cart.addProduct(new Product("Kubek promocyjny", 0.01));
		
	}

	@Override
	public String toString() {
		return "MugPromotion( Kubek promocyjny )";
	}
	
}
