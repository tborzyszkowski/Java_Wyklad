import org.junit.*;

public class ShoppingCartTest {
    @Test
    public void testAbove300(){
        Product szampon = new Product(1, "szampon", 10.99);
        Product shower_gel = new Product(2, "Żel pod prysznic", 16.99);
        Product perfume = new Product(3, "Chanel 5", 299.99);

        ShoppingCart cart1 = new ShoppingCart();

        cart1.addProduct(szampon);
        cart1.addProduct(shower_gel);
        cart1.addProduct(perfume);
        Assert.assertEquals(301.13, cart1.getSumCart(), 0.01);
    }
    @Test
    public void testBonusProduct(){
        Product szampon = new Product(1, "szampon", 10.99);
        Product shower_gel = new Product(2, "Żel pod prysznic", 16.99);
        Product perfume = new Product(3, "Chanel 5", 299.99);
        Product soap = new Product(4, "Mydlo", 2.0);
        Product matches = new Product(5, "Zapałki", 0.20);

        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(szampon);
        cart1.addProduct(shower_gel);
        cart1.addProduct(perfume);
        cart1.addProduct(soap);
        cart1.addProduct(matches);

        Assert.assertEquals(0.0, matches.getProductDiscPrice(), 0.0);
    }
    @Test
    public void testCoupon(){
        Product perfume = new Product(3, "Chanel 5", 299.99);
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(perfume);
        cart1.useCoupon(perfume);
        Assert.assertEquals(299.99*0.7, perfume.getProductDiscPrice(), 0.01);
    }
}

