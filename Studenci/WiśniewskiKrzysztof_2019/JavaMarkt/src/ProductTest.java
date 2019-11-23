import org.junit.Assert;

public class ProductTest {

    @org.junit.Test
    public void setDiscountPrice() {
        Product product = new Product("1234", "Pepsi" , 2.0);
        product.setDiscountPrice(1.5);
        Assert.assertEquals(product.getDiscountPrice(), 1.5, 0.001);
    }

    @org.junit.Test
    public void getCode() {
        Product product = new Product("1234", "Pepsi" , 2.0);
        Assert.assertEquals(product.getCode(), "1234");

    }

    @org.junit.Test
    public void getName() {
        Product product = new Product("1234", "Pepsi" , 2.0);
        Assert.assertEquals(product.getName(), "Pepsi");
    }

    @org.junit.Test
    public void getPrice() {
        Product product = new Product("1234", "Pepsi" , 2.0);
        Assert.assertEquals(product.getPrice(), 2.0, 0.001);
    }

    @org.junit.Test
    public void getDiscountPrice() {
        Product product = new Product("1234", "Pepsi" , 2.0);
        product.setDiscountPrice(1.5);
        Assert.assertEquals(product.getDiscountPrice(), 1.5, 0.001);
    }
}