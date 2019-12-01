import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PromotionTest {

    @Test
    public void thirdGratis() {

        Product product1 = new Product("1", "Laptop", 2499.99);
        Product product2 = new Product("2", "Słuchawki", 250.50);
        Product product3 = new Product("8", "Lampka", 70.00);
        ArrayList<Product> chosenProducts = new ArrayList<>();
        chosenProducts.add(product1);
        chosenProducts.add(product2);
        chosenProducts.add(product3);
        Order order = new Order(chosenProducts);

        order.countOrderPrice();
        double before = order.getOrderPrice();

        Promotion promotion = new Promotion(order);
        promotion.thirdGratis();
        double after = order.getOrderPrice();

        assertEquals(before-product3.getPrice(), after, 0.001);
    }

    @Test
    public void freeCup() {
        Product product1 = new Product("1", "Laptop", 2499.99);
        ArrayList<Product> chosenProducts = new ArrayList<>();
        chosenProducts.add(product1);

        Order order = new Order(chosenProducts);
        Promotion promotion = new Promotion(order);
        int before = order.getProducts().size();

        promotion.freeCup();
        int after = order.getProducts().size();

        assertEquals(before, after, 1);
    }

    @Test
    public void ifDiscountCoupon_couponPresent() {
        Product product1 = new Product("1", "Laptop", 2499.99);
        ArrayList<Product> chosenProducts = new ArrayList<>();
        chosenProducts.add(product1);

        Order order = new Order(chosenProducts);
        Promotion promotion = new Promotion(order);

        double before = order.getOrderPrice();

        chosenProducts.get(0).setCoupon("fsd");
        promotion.ifDiscountCoupon();

        double after = order.getOrderPrice();

        assertEquals(before, after, 0.001);
    }

    @Test
    public void fivePercentDiscount() {
        Product product1 = new Product("1", "Laptop", 2499.99);
        ArrayList<Product> chosenProducts = new ArrayList<>();
        chosenProducts.add(product1);

        Order order = new Order(chosenProducts);
        Promotion promotion = new Promotion(order);

        double before = order.getOrderPrice();
        promotion.fivePercentDiscount();

        double after = order.getOrderPrice();

        assertEquals(before * 0.95, after, 0.001);

    }

}