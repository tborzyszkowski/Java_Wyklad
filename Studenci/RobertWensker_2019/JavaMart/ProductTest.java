import org.junit.Assert;
import org.junit.jupiter.api.Test;


class ProductTest {
    Product product1 = new Product("#1267","Czerwona koszulka",17.99);
    Product product2 = new Product("#1268","Biala koszulka",20.99);

    @Test
    void compareTo() {
       var res = product2.compareTo(product1);
        Assert.assertEquals(1,res);
    }

    @Test
    void getValues() {
        product1.getValues();
    }

    @Test
    void getCode() {
        Assert.assertEquals("#1267", product1.getCode());
    }

    @Test
    void setCode() {
        product1.setCode("#1234");
        Assert.assertEquals("#1234", product1.getCode());
    }

    @Test
    void getName() {
        Assert.assertEquals("Czerwona koszulka",product1.getName());
    }

    @Test
    void setName() {
        product1.setName("Czerwone spodnie");
        Assert.assertEquals("Czerwone spodnie",product1.getName());
    }

    @Test
    void getPrice() {
        Assert.assertEquals(17.99,product1.getPrice(),0.0001);
    }

    @Test
    void setPrice() {
        product1.setPrice(20.99);
        Assert.assertEquals(20.99,product1.getPrice(),0.0001);
    }

    @Test
    void getDiscountPrize() {
        Assert.assertEquals(17.99,product1.getDiscountPrize(),0.001);
    }

    @Test
    void setDiscountPrize() {
        product1.setDiscountPrize(12.00);
        Assert.assertEquals(12.00,product1.getDiscountPrize(), 0.001);
    }
}