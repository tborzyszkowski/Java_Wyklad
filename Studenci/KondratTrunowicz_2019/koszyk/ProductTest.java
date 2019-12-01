import org.junit.*;
public class ProductTest {
    @Test
    public void ProductGetName(){
        Product product = new Product ("000","Telewizor",100);
        Assert.assertEquals("Telewizor", product.getName());

    }
    @Test
    public void ProductGetPrice(){
        Product product = new Product ("000","Telewizor",100);
        Assert.assertEquals(100, product.getPrice(),0.001);
    }
    @Test
    public void ProductGetCode(){
        Product product = new Product ("000","Telewizor",100);
        Assert.assertEquals("000", product.getCode());
    }
    @Test
    public void ProductGetDiscountPrice(){
        Product product = new Product ("000","Telewizor",100);
        Assert.assertEquals(100, product.getDiscountPrice(),0.001);
    }
    @Test
    public void ProductSetName(){
        Product product = new Product ("000","Telewizor",100);
        product.setName("Telewizorek");
        Assert.assertEquals("Telewizorek", product.getName());

    }
    @Test
    public void ProductSetPrice(){
        Product product = new Product ("000","Telewizor",100);
        product.setPrice(200);
        Assert.assertEquals(200, product.getPrice(),0.001);
    }
    @Test
    public void ProductSetCode(){
        Product product = new Product ("000","Telewizor",100);
        product.setCode("1111");
        Assert.assertEquals("1111", product.getCode());

    }
    @Test
    public void ProductSetDiscountPrice(){
        Product product = new Product ("000","Telewizor",100);
        product.setDiscountPrice(product.getPrice()*0.7);
        Assert.assertEquals(70, product.getDiscountPrice(),0.001);
    }
}
