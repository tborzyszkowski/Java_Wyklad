package JavaMarkt;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    @Test
    public void productConstructorTest(){
        String code = "testCode";
        String name = "testName";
        double price = 9.99;
        double discountPrice = 8.87;

        Product productTest= new Product(code, name, price, discountPrice);

        Assert.assertEquals(code, productTest.getCode());
        Assert.assertEquals(name, productTest.getName());
        Assert.assertEquals(price, productTest.getDiscountedPrice(), 0.001);
        Assert.assertEquals(discountPrice, productTest.getDiscountPrice(),0.001);
    }

    @Test
    public void productConstructorWithoutDiscountTest(){
        String code = "testCode";
        String name = "testName";
        double price = 9.99;

        Product productTest = new Product(code, name, price);

        Assert.assertEquals(price, productTest.getDiscountPrice(), 0.001);
    }

    @Test
    public void productComparatorEqualTest(){
        Product productTest1 = new Product("testCode", "testName", 9.0);
        Product productTest2 = new Product("testCode", "testName", 9.0);

        int comparisonResult = productTest1.compareTo(productTest2);

        Assert.assertEquals(0, comparisonResult);
    }
    @Test
    public void productComparatorDifferentDiscountPriceTest(){
        Product productTest1 = new Product("testCode", "testName", 9.0, 9.0);
        Product productTest2 = new Product("testCode", "testName", 9.0, 8.9);

        int comparisonResult = productTest1.compareTo(productTest2);

        Assert.assertEquals(1, comparisonResult);
    }
    @Test
    public void productComparatorDifferentPriceTest(){
        Product productTest1 = new Product("testCode", "testName", 8.0);
        Product productTest2 = new Product("testCode", "testName", 9.0);

        int comparisonResult = productTest1.compareTo(productTest2);

        Assert.assertEquals(-1, comparisonResult);
    }
    @Test
    public void productComparatorDifferentNameTest(){
        Product productTest1 = new Product("testCode", "testName1", 9.0);
        Product productTest2 = new Product("testCode", "testName2", 9.0);

        int comparisonResult = productTest1.compareTo(productTest2);

        Assert.assertEquals(-1, comparisonResult);
    }

    @Test
    public void productComparatorDifferentCodeTest(){
        Product productTest1 = new Product("testCode1", "testName", 9.0);
        Product productTest2 = new Product("testCode2", "testName", 9.0);

        int comparisonResult = productTest1.compareTo(productTest2);

        Assert.assertEquals(-1, comparisonResult);
    }

    @Test
    public void productToStringTest(){
        Product productTest1 = new Product("testCode1", "testName", 9.0);

        System.out.println(productTest1.toString());
    }

    @Test
    public void productSettingDiscountedPriceByDiscountTest(){
        Product productTest1 = new Product("testCode1", "testName", 10.0);
        int discount = 5;

        productTest1.setDiscountPrice(discount);

        Assert.assertEquals(9.5, productTest1.getDiscountPrice(), 0.001);
    }

    @Test
    public void productApplyingDiscountTwiceByDiscountTest(){
        Product productTest1 = new Product("testCode1", "testName", 10.0);
        int discount = 5;

        productTest1.setDiscountPrice(discount);
        productTest1.setDiscountPrice(discount);

        Assert.assertEquals(9.5, productTest1.getDiscountPrice(), 0.001);
    }

    @Test
    public void productSettingDiscountedPriceTest(){
        Product productTest1 = new Product("testCode1", "testName", 10.0);
        double newDiscountedPrice = 9.5;

        productTest1.setDiscountPrice(newDiscountedPrice);

        Assert.assertEquals(newDiscountedPrice, productTest1.getDiscountPrice(), 0.001);
    }


}
