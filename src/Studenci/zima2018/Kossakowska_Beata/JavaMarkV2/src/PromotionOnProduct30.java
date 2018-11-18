
public class PromotionOnProduct30 implements Promotions {
	private String productName;

	public PromotionOnProduct30(String productName) {
		super();
		this.productName = productName;
	}

	@Override
	public boolean isApplicable(Cart cart) {
		return true;
	}

	@Override
	public void applyPromotionToCart(Cart cart) {
		if (this.isApplicable(cart)) {
			for (CartItem cartItem : cart.getItems()) {
				if (cartItem.getProduct().getName().equals(productName)) {

					double discountedPrice = cartItem.getProduct().getPrice() * 0.7;
					if (discountedPrice < cartItem.getCurrentPrice()) {
						cartItem.setCurrentPrice(discountedPrice);
					}

				}
			}
		}

	}

}
