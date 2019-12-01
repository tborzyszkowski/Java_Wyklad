package koszyk;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void getCode() {
        Product product = new Product("asdf", "qwerty", 10.0);
        assertEquals("asdf", product.getCode());
    }

    @Test
    public void getName() {
        Product product = new Product("asdf", "qwerty", 10.0);
        assertEquals("qwerty", product.getName());
    }

    @Test
    public void getPrice() {
        Product product = new Product("asdf", "qwerty", 10.0);
        assertEquals(10.0, product.getPrice(), 0.001);
    }

    @Test
    public void getDiscountPrice() {
        Product product = new Product("asdf", "qwerty", 10.0);
        assertEquals(10.0, product.getDiscountPrice(), 0.001);
    }

    @Test
    public void setCode() {
        Product product = new Product("asdf", "qwerty", 10.0);
        product.setCode("asdf");
        assertEquals("asdf", product.getCode());
    }

    @Test
    public void setName() {
        Product product = new Product("asdf", "qwerty", 10.0);
        product.setName("asdf");
        assertEquals("asdf", product.getName());
    }

    @Test
    public void setPrice() {
        Product product = new Product("asdf", "qwerty", 10.0);
        product.setPrice(100.0);
        assertEquals(100.0, product.getPrice(), 0.001);
    }

    @Test
    public void setDiscountPrice() {
        Product product = new Product("asdf", "qwerty", 10.0);
        product.setDiscountPrice(5.0);
        assertEquals(5.0, product.getDiscountPrice(), 0.001);
    }
}