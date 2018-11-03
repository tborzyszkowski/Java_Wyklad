package Laboratorium.JavaMarkt;

import java.util.ArrayList;
import Laboratorium.JavaMarkt.model.*;

public class Main {

	public static void main(String[] args) {
		Cart cart = new Cart();

		cart.addProduct(new Product("Kartofle", 200)).addProduct(new Product("Gazeta", 100))
				.addPromotion(new ValuePromotion()).applyPromotions();

		System.out.println("-1-\n" + cart);

		cart.addPromotion(new MugPromotion()).applyPromotions().applyPromotions();

		System.out.println("-2-\n" + cart);

		cart.removeProduct(new Product("Gazeta", 100)).applyPromotions();

		System.out.println("-3-\n" + cart);

		cart.removePromotion(new ValuePromotion()).applyPromotions();

		System.out.println("-4-\n" + cart);
	}
}
