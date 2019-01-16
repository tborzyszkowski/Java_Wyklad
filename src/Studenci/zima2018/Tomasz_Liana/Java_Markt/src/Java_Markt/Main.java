package Java_Markt;

public class Main {
	
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addPromotion(new ValuePromotion()).applyPromotions();
		cart.addPromotion(new MugPromotion()).applyPromotions().applyPromotions();
		
		Product buty = new Product("Buty", 150.21);
		Product czasopismo = new Product("Czasopismo", 10.50);

		cart.addProduct(buty).addProduct(czasopismo).applyPromotions();

		System.out.println( "\n" + cart);
		
		cart.addProduct(new Product("Telefon", 200.99)).applyPromotions();
		
		System.out.println("  \n" + cart);
		
		cart.removePromotion(new ValuePromotion()).applyPromotions();
		
		
		System.out.println("  \n" + cart);
		
		cart.removeProduct(new Product("Telefon", 200.99));
		
		System.out.println("  \n" + cart);
		
		

		

}
}
