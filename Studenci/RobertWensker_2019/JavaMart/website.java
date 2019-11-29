import java.util.ArrayList;
import java.util.Collections;

public class website {
    public static void main (String[] args){
        Product product1 = new Product("#1267","Czerwona koszulka",17.99);
        Product product2 = new Product("#1268","Biala koszulka",20.99);
        Product product3 = new Product("#1269","Zielona koszulka",20.00);
        Product product4 = new Product("#1234","Supreme koszulka",300.00);

        Cart cart = new Cart();

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        //cart.showContents();
        cart.set30(product4);
        cart.discounts();
        System.out.println();
        cart.sortByDiscountPrize();
        System.out.println("Total: " + cart.getDiscountTotal());
        System.out.println("Is free cup included: " + cart.getCupIncluded());
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product4);
        cart.findCheapestProduct(products).getValues();
        System.out.println();
        cart.sortByName();
        System.out.println();
        cart.showContents(products);
    }
}
