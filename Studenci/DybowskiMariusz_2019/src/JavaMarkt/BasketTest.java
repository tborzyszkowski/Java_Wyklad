package JavaMarkt;

import org.junit.*;

import java.util.ArrayList;

public class BasketTest {
    Product productTest1 = new Product("testCode1", "testName1", 1.0);
    Product productTest2 = new Product("testCode2", "testName2", 2.0);
    Product productTest3 = new Product("testCode3", "testName3", 3.0);
    Product productTest4 = new Product("testCode4", "testName4", 4.0);
    Product productExpTest1 = new Product("testCodeExp1", "testExpName1", 100.0);
    Product productExpTest2 = new Product("testExpCode2", "testExpName2", 200.0);

    @Test
    public void basketConstructorTest(){
        ArrayList<Product> items = new ArrayList<>();


        Basket basketTest = new Basket();

        Assert.assertEquals(items, basketTest.getItems());
        Assert.assertEquals(-1, basketTest.getDiscount30());
    }

    @Test
    public void basketPromoItemAtStartTest(){
        Product promoItemTest = new Product("PromoCup", "Promotional Cup", 0);
        Basket basketTest = new Basket();

        Assert.assertFalse(basketTest.isPromoItemFlag());
        Assert.assertEquals(0, promoItemTest.compareTo(basketTest.getPromoItem()));
    }

    @Test
    public void basketAddItemTest(){
        Basket basketTest = new Basket();

        basketTest.addItem(productTest1);

        Assert.assertEquals(0, productTest1.compareTo(basketTest.getItems().get(0)));
    }

    @Test
    public void basketAddTwoItemsSecondCheaperTest(){
        Basket basketTest = new Basket();

        basketTest.addItem(productTest2);
        basketTest.addItem(productTest1);

        Assert.assertEquals(0, productTest1.compareTo(basketTest.getItems().get(1)));
    }

    @Test
    public void basketAddTwoItemsSecondMoreExpensiveTest(){

        Basket basketTest = new Basket();

        basketTest.addItem(productTest1);
        basketTest.addItem(productTest2);

        Assert.assertEquals(0, productTest2.compareTo(basketTest.getItems().get(0)));
    }

    @Test
    public void basketRemoveItemToEmptyByIndexTest(){
        Basket basketTest = new Basket();
        basketTest.addItem(productTest1);

        basketTest.removeItem(0);

        Assert.assertEquals(0, basketTest.getItems().size());
    }

    @Test
    public void basketAddItemAfterRemovingTest(){
        Basket basketTest = new Basket();

        basketTest.addItem(productTest1);
        basketTest.removeItem(0);
        basketTest.addItem(productTest1);

        Assert.assertEquals(0, productTest1.compareTo(basketTest.getItems().get(0)));
    }

    @Test
    public void basketRemoveItemToEmptyByProductTest() {
        Basket basketTest = new Basket();
        basketTest.addItem(productTest1);

        basketTest.removeItem(productTest1);

        Assert.assertEquals(0, basketTest.getItems().size());
    }

    @Test
    public void basketRemoveItemByCodeSuccessfulTest(){
        Basket basketTest = new Basket();
        basketTest.addItem(productTest1);

        basketTest.removeItems("testCode1");

        Assert.assertEquals(0, basketTest.getItems().size());
    }

    @Test
    public void basketRemoveItemByCodeFailedTest(){

        Basket basketTest = new Basket();
        basketTest.addItem(productTest1);

        basketTest.removeItems("testCode");

        Assert.assertEquals(1, basketTest.getItems().size());
    }

    @Test
    public void basketRemoveByCodeMultipleProductsTest(){


        Basket basketTest = new Basket();
        basketTest.addItem(productTest1);
        basketTest.addItem(productTest2);
        basketTest.addItem(productTest1);

        basketTest.removeItems("testCode1");

        Assert.assertEquals(1, basketTest.getItems().size());

    }

    @Test
    public void basketFindTwoMaxOfFourTest(){

        Basket basketTest = new Basket();

        basketTest.addItem(productTest1);
        basketTest.addItem(productTest2);
        basketTest.addItem(productTest3);
        basketTest.addItem(productTest4);

        ArrayList<Product> maxTest = basketTest.findNMax(2);

        Assert.assertEquals(productTest4, maxTest.get(0));
        Assert.assertEquals(productTest3, maxTest.get(1));
    }

    @Test
    public void basketFindTwoMinOfFourTest(){


            Basket basketTest = new Basket();

            basketTest.addItem(productTest1);
            basketTest.addItem(productTest2);
            basketTest.addItem(productTest3);
            basketTest.addItem(productTest4);

            ArrayList<Product> minTest = basketTest.findNMin(2);

            Assert.assertEquals(productTest1, minTest.get(0));
            Assert.assertEquals(productTest2, minTest.get(1));
    }

    @Test
    public void basketFindMaxTest(){

        Basket basketTest = new Basket();

        basketTest.addItem(productTest1);
        basketTest.addItem(productTest2);
        basketTest.addItem(productTest3);
        basketTest.addItem(productTest4);

        Product maxTest = basketTest.findMax();

        Assert.assertEquals(productTest4, maxTest);
    }

    @Test
    public void basketFindMinTest(){

        Basket basketTest = new Basket();

        basketTest.addItem(productTest1);
        basketTest.addItem(productTest2);
        basketTest.addItem(productTest3);
        basketTest.addItem(productTest4);

        Product minTest = basketTest.findMin();

        Assert.assertEquals(productTest1, minTest);
    }

    @Test
    public void basketTotalPriceTest(){
        Basket basketTest = new Basket();

        basketTest.addItem(productTest1);
        basketTest.addItem(productTest2);
        basketTest.addItem(productTest3);
        basketTest.addItem(productTest4);

        double totalPriceTest = productTest1.getDiscountedPrice() + productTest2.getDiscountedPrice()
                + productTest3.getDiscountedPrice() + productTest4.getDiscountedPrice();

        Assert.assertEquals(totalPriceTest, basketTest.getTotalPrice(), 0.001);
    }

    @Test
    public void basketTotalDiscountedPriceBeforeDiscountsTest(){
        Basket basketTest = new Basket();

        basketTest.addItem(productTest1);
        basketTest.addItem(productTest2);
        basketTest.addItem(productTest3);
        basketTest.addItem(productTest4);

        double totalDiscountedPriceTest = productTest1.getDiscountedPrice() + productTest2.getDiscountedPrice()
                + productTest3.getDiscountedPrice() + productTest4.getDiscountedPrice();

        Assert.assertEquals(totalDiscountedPriceTest, basketTest.getTotalDiscountedPrice(), 0.001);
    }

    @Test
    public void basketAddingPromoItemTest(){
        Basket basketTest = new Basket();
        Product promoItemTest = new Product("PromoCup", "Promotional Cup", 0);


        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest2);


        Assert.assertEquals(0, promoItemTest.compareTo(basketTest.getItems().get(2)));
    }

    @Test
    public void basketRemovingItemRemovesPromoTest(){
        Basket basketTest = new Basket();

        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest2);
        basketTest.removeItem(productExpTest2);

        Assert.assertEquals(1, basketTest.getItems().size());
        Assert.assertFalse(basketTest.isPromoItemFlag());

    }

    @Test
    public void basketRemovingItemDoesntRemovePromoTest() {
        Basket basketTest = new Basket();

        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest2);
        basketTest.removeItem(1);

        Assert.assertEquals(3, basketTest.getItems().size());
        Assert.assertTrue(basketTest.isPromoItemFlag());
    }

    @Test
    public void basketCheckDiscountToAllTest(){
        Basket basketTest = new Basket();

        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest2);

        Assert.assertEquals(basketTest.getTotalPrice()*0.95, basketTest.getTotalDiscountedPrice(), 0.001);
    }

    @Test
    public void basketCheckRemovingDiscountToAllTest(){
        Basket basketTest = new Basket();

        basketTest.addItem(productTest1);
        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest2);

        basketTest.removeItem(productExpTest2);

        Assert.assertEquals(basketTest.getTotalPrice(), basketTest.getTotalDiscountedPrice(), 0.001);
    }

    @Test
    public void basketCheckDiscount30Test(){
        Basket basketTest = new Basket();

        basketTest.addItem(productExpTest1);
        basketTest.setDiscount30(0);

        Assert.assertEquals(productExpTest1.getPrice() * 0.7, basketTest.getTotalDiscountedPrice(), 0.001);

    }

    @Test
    public void basketRemoveDiscount30Test(){
        Basket basketTest = new Basket();

        basketTest.addItem(productExpTest1);
        basketTest.setDiscount30(0);
        basketTest.removeDiscount30();

        Assert.assertEquals(productExpTest1.getPrice() , basketTest.getTotalDiscountedPrice(), 0.001);
    }

    @Test
    public void basketRemoveDiscount30WithDiscountAllTest(){
        Basket basketTest = new Basket();

        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest2);
        basketTest.setDiscount30(0);


        Assert.assertEquals(productExpTest2.getPrice()*0.7 , basketTest.getItems().get(0).getDiscountPrice(), 0.001);
    }

    @Test
    public void basketPrint(){
        Basket basketTest = new Basket();

        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest1);
        basketTest.addItem(productExpTest2);
        basketTest.addItem(productTest1);
        basketTest.addItem(productTest2);
        basketTest.addItem(productTest3);
        basketTest.addItem(productTest4);

        basketTest.print();
    }

}
