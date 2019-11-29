package koszykInternetowy;

import org.junit.Assert;
import org.junit.Test;


public class ProductTest {

    @Test
    public void getCode() {
        Product product = new Product("123", "Monitor", 1000.0);

        Assert.assertEquals(product.getCode(), "123");
    }

    @Test
    public void setCode() {
        Product product = new Product("123", "Monitor", 1000.0);

        product.setCode("12");

        Assert.assertEquals(product.getCode(), "12");
    }

    @Test
    public void getName() {
        Product product = new Product("123", "Monitor", 1000.0);

        Assert.assertEquals(product.getName(), "Monitor");
    }

    @Test
    public void setName() {
        Product product = new Product("123", "Monitor", 1000.0);

        product.setName("Klawiatura");

        Assert.assertEquals(product.getName(), "Klawiatura");
    }

    @Test
    public void getPrice() {
        Product product = new Product("123", "Monitor", 1000.0);

        Assert.assertEquals(product.getPrice(), 1000.0, 0.001);

    }

    @Test
    public void setPrice() {
        Product product = new Product("123", "Monitor", 1000.0);

        product.setPrice(900.0);

        Assert.assertEquals(product.getPrice(), 900.0, 0.001);
    }

    @Test
    public void getDiscountPrice() {
        Product product = new Product("123", "Monitor", 1000.0);

        Assert.assertEquals(product.getDiscountPrice(), 1000.0, 0.001);
    }

    @Test
    public void setDiscountPrice() {
        Product product = new Product("123", "Monitor", 1000.0);

        product.setDiscountPrice(900.0);

        Assert.assertEquals(product.getDiscountPrice(), 900.0, 0.001);

    }


}