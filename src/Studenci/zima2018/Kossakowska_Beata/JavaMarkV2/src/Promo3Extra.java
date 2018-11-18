
public class Promo3Extra implements Promotions {

	@Override
	public boolean isApplicable(Cart cart) {
		if (cart.getItems().size() >= 3) {
			return true;
		}
		return false;
	}

	@Override
	public void applyPromotionToCart(Cart cart) {
		Product extraProduct = cart.minPriceProducts();
		for (CartItem cartItem : cart.getItems()) {

			if (cartItem.getProduct() == extraProduct) {
				cartItem.setCurrentPrice(0.0);
			}

		}

	}

}
