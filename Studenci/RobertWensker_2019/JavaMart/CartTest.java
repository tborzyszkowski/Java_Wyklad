import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    Product product1 = new Product("#1267","Czerwona koszulka",17.99);
    Product product2 = new Product("#1268","Biala koszulka",20.99);
    Product product3 = new Product("#1269","Zielona koszulka",20.00);
    Product product4 = new Product("#1234","Supreme koszulka",300.00);

    Cart cart = new Cart();

    @Test
    void getDiscountTotal() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        cart.discounts();
        Assert.assertEquals(323.94,cart.getDiscountTotal(),0.01);
    }

    @Test
    void setDiscountTotal() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        cart.setDiscountTotal(123.12);
        Assert.assertEquals(123.12,cart.getDiscountTotal(),0.01);
    }

    @Test
    void getListOfProducts() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        Assert.assertEquals(cart.getListOfProducts(),products);
    }

    @Test
    void setListOfProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        cart.setListOfProducts(products);
        Assert.assertEquals(cart.getListOfProducts(),products);
    }

    @Test
    void setTotal() {
        cart.setTotal(123.12);
        Assert.assertEquals(123.12,cart.getTotal(),0.01);
    }

    @Test
    void showContents() {

    }

    @Test
    void addProduct() {
        cart.addProduct(product1);
        Assert.assertEquals(cart.getListOfProducts().get(0),product1);
    }

    @Test
    void testSetTotal() {
        cart.setTotal(123.12);
        Assert.assertEquals(123.12,cart.getTotal(),0.001);
    }

    @Test
    void getCupIncluded() {
        cart.setCupIncluded(true);
        Assert.assertEquals(true,cart.getCupIncluded());
    }

    @Test
    void setCupIncluded() {
        cart.setCupIncluded(true);
        Assert.assertEquals(true,cart.getCupIncluded());
    }

    @Test
    void getTotal() {
        cart.setTotal(123.12);
        Assert.assertEquals(123.12,cart.getTotal(),0.001);
    }

    @Test
    void set30() {
        cart.addProduct(product1);
        cart.set30(product1);
        Assert.assertEquals(12.6,product1.getDiscountPrize(),0.01);
    }

    @Test
    void discounts() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        //cart.showContents();
        cart.set30(product4);
        cart.discounts();

        Assert.assertEquals(323.94,cart.getDiscountTotal(),0.01);

    }

    @Test
    void sortByDiscountPrize() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product3);
        products.add(product2);
        products.add(product4);

        Assert.assertEquals(products, cart.sortByDiscountPrize());
    }

    @Test
    void serchByName() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product2);
        products.add(product1);
        products.add(product4);
        products.add(product3);

        Assert.assertEquals(products,cart.sortByName());

    }

    @Test
    void findCheapestProduct() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        Assert.assertEquals(product1,cart.findCheapestProduct(cart.getListOfProducts()));
    }

    @Test
    void findCheapestProducts() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product3);
        Assert.assertEquals(products,cart.findCheapestProducts(cart.getListOfProducts(),2));
    }
}