package koszyk;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BasketTest {

    @Test
    public void getClient() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        assertEquals(client, basket.getClient());
    }

    @Test
    public void sortProducts() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product1 = new Product("a", "test1", 10.0);
        Product product2 = new Product("b", "gbcda", 5.0);
        Product product3 = new Product("c", "zbcda", 20.0);
        Product product4= new Product("d", "erfgr", 20.0);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product4);
        products.add(product3);
        products.add(product1);
        products.add(product2);

        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);

        assertEquals(products, basket.getProducts());
    }

    @Test
    public void getProducts() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product = new Product("abcd", "qwerty", 10.0);
        basket.addProduct(product);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        assertEquals(products, basket.getProducts());
    }

    @Test
    public void getSum() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product = new Product("abcd", "qwerty", 10.0);
        basket.addProduct(product);
        assertEquals(10.0, basket.getSum(), 0.001);
    }

    @Test
    public void setClient() {
        Client client1 = new Client("asdf");
        Client client2 = new Client("qwerty");
        Basket basket = new Basket(client1);
        basket.setClient(client2);
        assertEquals(client2, basket.getClient());
    }

    @Test
    public void setDiscountCoupon() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        basket.setDiscountCoupon(true);
        assertTrue(basket.getDiscountCoupon());
    }

    @Test
    public void getSumWithDiscount() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product1 = new Product("a", "a", 200.0);
        Product product2 = new Product("b", "b", 800.0);
        basket.addProduct(product1);
        basket.addProduct(product2);
        assertEquals(950.0, basket.getSumWithDiscount(), 0.001);
    }

    @Test
    public void setProductDiscount() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product = new Product("a", "a", 100.0);
        basket.setDiscountCoupon(true);
        basket.addProduct(product);
        basket.setProductDiscount(product);
        assertEquals(70.0, basket.getProducts().get(0).getDiscountPrice(), 0.001);
    }

    @Test
    public void addProduct() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product = new Product("a", "a", 100.0);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        basket.addProduct(product);
        assertEquals(products, basket.getProducts());
    }

    @Test
    public void FreeCup() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product = new Product("a", "a", 300.0);
        Product cup = new Product("cup", "cup", 0.0);
        basket.addProduct(product);
        assertTrue(basket.getProducts().contains(cup));
    }

    @Test
    public void GlobalDiscount() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product = new Product("a", "a", 1000.0);
        basket.addProduct(product);
        assertEquals(950.0, basket.getSumWithDiscount(), 0.001);
    }

    @Test
    public void findCheapestProducts() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product1 = new Product("a", "a", 10.0);
        Product product2 = new Product("b", "b", 20.0);
        Product product3 = new Product("c", "c", 5.0);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product3);
        assertEquals(products, basket.findCheapestProducts());
    }

    @Test
    public void FindNCheapestProducts() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product1 = new Product("a", "a", 10.0);
        Product product2 = new Product("b", "b", 20.0);
        Product product3 = new Product("c", "c", 5.0);
        Product product4 = new Product("d", "d", 15.0);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product3);
        products.add(product1);
        assertEquals(products, basket.findCheapestProducts(2));
    }

    @Test
    public void findMostExpensiveProducts() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product1 = new Product("a", "a", 10.0);
        Product product2 = new Product("b", "b", 20.0);
        Product product3 = new Product("c", "c", 5.0);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product2);
        assertEquals(products, basket.findMostExpensiveProducts());
    }

    @Test
    public void FindNMostExpensiveProducts() {
        Client client = new Client("asdf");
        Basket basket = new Basket(client);
        Product product1 = new Product("a", "a", 10.0);
        Product product2 = new Product("b", "b", 20.0);
        Product product3 = new Product("c", "c", 5.0);
        Product product4 = new Product("d", "d", 15.0);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product2);
        products.add(product4);
        assertEquals(products, basket.findMostExpensiveProducts(2));
    }
}