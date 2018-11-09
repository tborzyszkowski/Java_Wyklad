package Laboratorium.JavaMarkt;

import java.util.*;
import Laboratorium.JavaMarkt.model.*;

public class Main {

	public static void main(String[] args) {
//		Cart cart = new Cart();
//
//		cart.addProduct(new Product("Kartofle", 200)).addProduct(new Product("Gazeta", 100))
//				.addPromotion(new ValuePromotion()).applyPromotions();
//
//		System.out.println("-1-\n" + cart);
//
//		cart.addPromotion(new MugPromotion()).applyPromotions().applyPromotions();
//
//		System.out.println("-2-\n" + cart);
//
//		cart.removeProduct(new Product("Gazeta", 100)).applyPromotions();
//
//		System.out.println("-3-\n" + cart);
//
//		cart.removePromotion(new ValuePromotion()).applyPromotions();
//
//		System.out.println("-4-\n" + cart);
//		
		
		List<Product> prod = new ArrayList<Product>();
		
		prod.add(new Product("p1", 1));
		prod.add(new Product("p2", 2));
		prod.add(new Product("p3", 3));
		prod.add(new Product("p4", 4));
		
		boolean ok = true;
		
		for(Product p :  prod) {
			if (p.getName().equals("p3"))
//				ok = false;
				break; 
		}
	}
}
