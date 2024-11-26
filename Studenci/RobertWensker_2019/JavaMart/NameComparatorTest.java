import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameComparatorTest {

    @Test
    void compare() {
        Product product1 = new Product("#1267","Czerwona koszulka",17.99);
        Product product2 = new Product("#1268","Biala koszulka",20.99);
        Assert.assertEquals(-1,product1.compareTo(product2));
    }
}