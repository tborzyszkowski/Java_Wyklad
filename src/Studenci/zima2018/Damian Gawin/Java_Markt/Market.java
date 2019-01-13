package Market;

public class Market {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("water", 2.50));
        cart.addProduct(new Product("apple", 1.30));
        cart.addProduct(new Product("blanket", 130.90));
        cart.addProduct(new Product("umbrella", 10.09));
        cart.addProduct(new Product("ball", 29.50));
        cart.addProduct(new Product("shoes", 300.03));
        cart.addPromotion(new FivePercentPromotion());
        cart.addPromotion(new MugProm());

//        System.out.println(cart.getNameSortedItems());
//        System.out.println(cart.getPriceSortedItems());
        cart.getTotalPrice();
        cart.apllyPromotions();
        cart.getTotalPriceDiscount();
        System.out.println(cart);
    }
}

