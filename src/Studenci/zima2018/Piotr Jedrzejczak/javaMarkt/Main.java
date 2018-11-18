package lab2.javaMarkt;

//import java.util.ArrayList;

public class Main {
	
//	public static ArrayList<Product> getSampleProducts(int n) {
//		ArrayList<Product> sample = new ArrayList<>();
//		for (int i = 1; i<= n; i++) {
//			Product p = new Product("PX" + i, "Product" + i, i * 12);
//			sample.add(p);
//		}
//		return sample;
//	}
//	
//	public static Basket getSampleBasket() {
//		Basket b = new Basket();
//		for (Product p : getSampleProducts(5)) {
//			b.addProductToBasket(p);
//		}
//		return b;
//	}
	
	

	public static void main(String[] args) {
		
		//Basket sample_basket = Main.getSampleBasket();
		//System.out.println(sample_basket.getBasketContent());
		//System.out.println(sample_basket.getBasketValue());
		//System.out.println(sample_basket.getCheapestProduct(sample_basket));
		
		Basket custom_basket = new Basket();
		
		custom_basket.addProductToBasket(new Product("PW1","Potato", 21.69));
		custom_basket.addProductToBasket(new Product("PW2","Broccoli", 43.19));
		custom_basket.addProductToBasket(new Product("PW3","Tomato", 21.59));
		custom_basket.addProductToBasket(new Product("PW4","Avocado", 70.87));
		custom_basket.addProductToBasket(new Product("PW4","Celery", 70.87));
		custom_basket.addProductToBasket(new Product("PW4","Rocket", 70.87));
		custom_basket.addProductToBasket(new Product("PW5","Beetroot", 12.00));
		System.out.println(custom_basket.getBasketValue());
		custom_basket.addPromotionToBasket(new ValuePromotion(300, 0.95));
		custom_basket.addPromotionToBasket(new ThreeForTwoPromotion());
		custom_basket.addPromotionToBasket(new MugPromotion());
		custom_basket.addPromotionToBasket(new CouponPromotion());
		custom_basket.toCheckout();
		System.out.println(custom_basket.getBasketValue());
		System.out.println(custom_basket.getBasketContent());
		System.out.println(custom_basket.sortBasketByPrice(custom_basket));
		System.out.println(custom_basket.sortBasketByPriceAndName(custom_basket));
		System.out.println(custom_basket.getNCheapestProducts(custom_basket, 3));
		System.out.println(custom_basket.getNMostExpensiveProducts(custom_basket, 2));
		System.out.println(custom_basket.getBasketContent());
		
		
		
	}

}
