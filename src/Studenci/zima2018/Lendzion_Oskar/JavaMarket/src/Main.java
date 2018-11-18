import model.*;

public class Main {
	
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addPromotion(new ValuePromotion()).applyPromotions();
		cart.addPromotion(new MugPromotion()).applyPromotions().applyPromotions();
		
		Product ksiazka = new Product("Ksiazka", 50.21);
		Product gazeta = new Product("Gazeta", 5.50);

		cart.addProduct(ksiazka).addProduct(gazeta).applyPromotions();

		System.out.println("-1-\n" + cart);
		
		cart.addProduct(new Product("Tablet", 1699.99)).applyPromotions();
		
		System.out.println("-2-\n" + cart);

		cart.removeProduct(new Product("Tablet", 1699.99));
		
		System.out.println("-3-\n" + cart);

		cart.removePromotion(new ValuePromotion()).applyPromotions();

		System.out.println("-4-\n" + cart);
		

}
}
