package JavaMarkt.JavaMarkt2;

public class Main {
	public static void main(String[] args) {
		Cart cart = new Cart();
		Name name = new Name();
		//Name name2 = new Name("Sebastian");
		Welcome.welcome();
		System.out.println(name.getName());
		//System.out.println(name2.getName());
		
		cart.addProduct(new Product("Kartofle", 200.78));
		cart.addProduct(new Product("Gazeta", 100.70));
	    cart.addProduct(new Product("Pizza", 700.1));
	    
		if (cart.totalPriceOfProducts() >= 300 && cart.totalPriceOfProducts() < 1000) 
			cart.addPromotion(new ValuePromotion());
		else if (cart.totalPriceOfProducts() >= 1000)
			cart.addPromotion(new BiggerValuePromotion());
		else;
		
		cart.applyPromotions();
		cart.addPromotion(new MugPromotion());
		cart.applyPromotions();

		System.out.println(cart);
	}
}