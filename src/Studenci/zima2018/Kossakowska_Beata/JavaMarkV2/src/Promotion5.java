
public class Promotion5 implements Promotions {

	@Override
	public boolean isApplicable(Cart cart) {
		if (cart.totalPriceProducts() > 300) {
			return true;
		}
		return false;
	}

	@Override
	public void applyPromotionToCart(Cart cart) {
		if (this.isApplicable(cart)) {
			for (CartItem cartItem : cart.getItems()) {
				double discountedPrice = cartItem.getProduct().getPrice() * 0.95;
				if (discountedPrice < cartItem.getCurrentPrice()) {
					cartItem.setCurrentPrice(discountedPrice);
				}
				
			}

		}

	}

}
