package koszykInternetowy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CartTest {

    @Test
    public void addProduct() {
        Cart cart = new Cart();
        Product product = new Product("123", "Monitor", 1000.0);
        cart.addProduct(product);

        Assert.assertEquals(cart.cheapestProduct(), product);
    }

    @Test
    public void sortList() {
        Product product1 = new Product("312", "d", 15.00);
        Product product2 = new Product("333", "c", 15.00);
        Product product3 = new Product("334", "b", 15.00);
        Product product4 = new Product("335", "a", 15.00);
        Product product5 = new Product("335", "a", 14.00);
        Cart cart = new Cart(new ArrayList<Product>(Arrays.asList(product5,product1, product2, product3,product4)));

        cart.sortList();
        cart.showProducts();
    }

    @Test
    public void cheapestProduct() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 1000.0);
        Product product2 = new Product("124", "Klawiatura", 500.0);
        cart.addProduct(product1);
        cart.addProduct(product2);

        Assert.assertEquals(cart.cheapestProduct(), product2);
    }

    @Test
    public void mostExpensiveProduct() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 1000.0);
        Product product2 = new Product("124", "Klawiatura", 500.0);
        cart.addProduct(product1);
        cart.addProduct(product2);

        Assert.assertEquals(cart.mostExpensiveProduct(), product1);
    }

    @Test
    public void cheapestProducts() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 1000.0);
        Product product2 = new Product("124", "Klawiatura", 500.0);
        Product product3 = new Product("124", "Myszka", 200.0);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        Assert.assertEquals(cart.cheapestProducts(2), new ArrayList<>(Arrays.asList(product2, product3)));
    }

    @Test
    public void mostExpesiveProducts() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 1000.0);
        Product product2 = new Product("124", "Klawiatura", 500.0);
        Product product3 = new Product("124", "Myszka", 200.0);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        Assert.assertEquals(cart.mostExpensiveProducts(2), new ArrayList<>(Arrays.asList(product1, product2)));
    }

    @Test
    public void sortByPrice() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 1000.0);
        Product product2 = new Product("124", "Klawiatura", 500.0);
        Product product3 = new Product("124", "Myszka", 200.0);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.sortByPrice(false);

        cart.showProducts();
    }

    @Test
    public void sortByName() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 1000.0);
        Product product2 = new Product("124", "Klawiatura", 500.0);
        Product product3 = new Product("124", "Myszka", 200.0);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.sortByName(false);

        cart.showProducts();

    }

    @Test
    public void applyDiscountsMoreThan300() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 1000.0);
        Product product2 = new Product("124", "Klawiatura", 500.0);
        Product product3 = new Product("124", "Myszka", 200.0);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.applyDiscounts();

        Assert.assertEquals(cart.discountPriceSum(), 1615.0,0.001);
    }

    @Test
    public void applyDiscountsMoreThan200() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 1000.0);
        Product product2 = new Product("124", "Klawiatura", 500.0);
        Product product3 = new Product("124", "Myszka", 200.0);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.applyDiscounts();

        ArrayList<Product> list = cart.cheapestProducts(2);

        Assert.assertEquals(list.get(0), product3);
    }

    @Test
    public void applyDiscountsMoreThan2Products() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 1000.0);
        Product product2 = new Product("124", "Klawiatura", 500.0);
        Product product3 = new Product("124", "Myszka", 200.0);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.applyDiscounts();

        ArrayList<Product> list = cart.cheapestProducts(2);

        Assert.assertEquals(list.get(1).getName(), "Kubek");
    }

    @Test
    public void applyDiscountsWithCoupon() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 100.0);
        cart.addProduct(product1);

        cart.applyDiscounts(product1);



        Assert.assertEquals(cart.cheapestProduct().getDiscountPrice(), 70.0, 0.001);
    }


    @Test
    public void showProducts() {
        Cart cart = new Cart();
        Product product1 = new Product("123", "Monitor", 1000.0);
        Product product2 = new Product("124", "Klawiatura", 500.0);
        Product product3 = new Product("124", "Myszka", 200.0);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.showProducts();
    }
}