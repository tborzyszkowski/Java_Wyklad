import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class CartTest {

    @Test
    public void addProduct() {
        Product product = new Product("123", "nazwa", 5);
        Cart cart = new Cart();
        cart.addProduct(product);
        Assert.assertEquals(cart.getMostExpensiveProduct(false), product);
    }

    @Test
    public void finalizePurchaseUnder200() {
        Product product = new Product("123", "nazwa", 5);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.finalizePurchase();
        Assert.assertEquals(cart.getDiscountsum(), 5, 0.001);
    }

    @Test
    public void finalizePurchaseOver200() {
        Product product = new Product("123", "nazwa", 201);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.finalizePurchase();
        Assert.assertEquals(cart.getProducts().size(), 2);
    }

    @Test
    public void finalizePurchaseOver300() {
        Product product = new Product("123", "nazwa", 301);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.finalizePurchase();
        Assert.assertEquals(cart.getDiscountsum(), 285.95, 0.001);
    }

    @Test
    public void finalizePurchaseWithDiscountedProduct() {
        Product product = new Product("123", "nazwa", 100);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.finalizePurchase("nazwa");
        Assert.assertEquals(cart.getDiscountsum(), 70, 0.001);
    }


    @Test
    public void getMostExpensiveProduct() {
        Product product = new Product("123", "nazwa", 15);
        Product product2 = new Product("123", "nazwa", 12);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        Assert.assertEquals(cart.getMostExpensiveProduct(false), product);
    }

    @Test
    public void getLeastExpensiveProduct() {
        Product product = new Product("123", "nazwa", 15);
        Product product2 = new Product("123", "nazwa", 12);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        Assert.assertEquals(cart.getMostExpensiveProduct(true), product2);
    }

    @Test
    public void get2MostExpensiveProduct() {
        Product product = new Product("123", "nazwa", 15);
        Product product2 = new Product("123", "nazwa", 12);
        Product product3 = new Product("123", "nazwa", 10);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);
        ArrayList<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product2);
        Assert.assertEquals(cart.getMostExpensiveProduct(2, false), list);
    }

    @Test
    public void printProducts() {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Product product = new Product("123", "nazwa", 15);
        Product product2 = new Product("123", "nazwa", 12);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.printProducts();
        String[] expected = {"Product{code='123', name='nazwa', price=15.0, discountPrice=15.0}",
                "Product{code='123', name='nazwa', price=12.0, discountPrice=12.0}"};
        String[] actual =  outputStream.toString().replaceAll("\\r\\n", "\n").split("\n");
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void getId() {
        Cart cart = new Cart();
        Cart cart2 = new Cart();
        Assert.assertEquals(cart.getId(), cart2.getId() - 1);
    }

    @Test
    public void getSum() {
        Product product = new Product("123", "nazwa", 5);
        Product product2 = new Product("1233", "nazwa2", 15);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        Assert.assertEquals(cart.getSum(), 20, 0.001);
    }

    @Test
    public void getDiscountsum() {
        Product product = new Product("123", "nazwa", 250);
        Product product2 = new Product("1233", "nazwa2", 100);
        Cart cart = new Cart();
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.finalizePurchase();
        Assert.assertEquals(cart.getDiscountsum(), 332.5, 0.001);

    }
    @Test
    public void getProducts() {
        Product product = new Product("123", "nazwa", 25);
        Product product2 = new Product("1233", "nazwa2", 10);
        Cart cart = new Cart();
        ArrayList<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product2);
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.finalizePurchase();
        Assert.assertEquals(cart.getProducts(), list);

    }
}
