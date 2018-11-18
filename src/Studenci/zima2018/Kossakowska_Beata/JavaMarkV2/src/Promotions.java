
public interface Promotions {
	boolean isApplicable(Cart cart);

	void applyPromotionToCart(Cart cart);
}
