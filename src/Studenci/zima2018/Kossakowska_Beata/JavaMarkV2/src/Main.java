import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("cos1", 1.1, "12345");
		Product p2 = new Product("cos2", 125.1, "12345");
		Product p3 = new Product("cos3", 190.1, "12345");

		Cart cart1 = new Cart();
		cart1.addProduct(p1);
		cart1.addProduct(p2);
		cart1.addProduct(p3);

		List<Promotions> promotions = new ArrayList<>();
		promotions.add(new PromoExtraMug());
		promotions.add(new PromotionOnProduct30("cos2"));
		promotions.add(new Promotion5());
		promotions.add(new Promo3Extra());

		for (Promotions promotion : promotions) {
			if (promotion.isApplicable(cart1)) {
				promotion.applyPromotionToCart(cart1);

			}
		}
		cart1.showProducts();
	}

}
