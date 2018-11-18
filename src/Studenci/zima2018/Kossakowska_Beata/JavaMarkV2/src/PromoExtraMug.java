
public class PromoExtraMug implements Promotions {

	@Override
	public boolean isApplicable(Cart cart) {
		if (cart.totalPriceProducts() > 200) {
			return true;
		}
		return false;
	}

	@Override
	public void applyPromotionToCart(Cart cart) {
		if (this.isApplicable(cart)) {
			cart.addProduct(new Product("Kubek", 0.00, "123"));
		}

	}

}
