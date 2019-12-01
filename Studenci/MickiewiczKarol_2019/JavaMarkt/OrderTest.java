import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class OrderTest {

    @Test
    public void countOrderPrice_properValue_properPrice() {
        Product product1 = new Product("1", "Laptop", 2499.99);
        Product product2 = new Product("2", "Słuchawki", 250.50);
        ArrayList<Product> chosenProducts = new ArrayList<>();
        chosenProducts.add(product1);
        chosenProducts.add(product2);
        Order order = new Order(chosenProducts);

        order.countOrderPrice();

        Assert.assertEquals(product1.getPrice() + product2.getPrice(), order.getOrderPrice(), 0.001);
    }

}
