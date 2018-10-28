package Laboratorium.JavaMarkt;

import java.util.ArrayList;
import Laboratorium.JavaMarkt.model.*;

public class Main {
	public static ArrayList<Product> getSampleProducts(int n) {
		ArrayList<Product> sample = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			Product p = new Product("Product " + i, i * 25);
			sample.add(p);
		}
		return sample;
	}

	public static Cart getSampleCart() {
		Cart c = new Cart();
		for (Product p : getSampleProducts(10)) {
			c.addProduct(p);
		}
		return c;
	}

	public static void main(String[] args) {
//		Product p = new Product("Jabłka", 1.69);
//		System.out.println(p);
		// System.out.println(getSampleCart().getItems());
		Cart cart = new Cart();
		cart.addProduct(new Product("Kartofle", 200))
		    .addProduct(new Product("Gazeta", 100))
		    .addPromotion(new ValuePromotion())
		    .applyPromotions();

		System.out.println(cart);

		cart.addPromotion(new MugPromotion())
		    .applyPromotions()
		    .applyPromotions();

		System.out.println(cart);
	}
}
