import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductTest {

    private Product produkt1, produkt2;

    @Before
    public void start() {
        this.produkt1 = new Product("D01", "długopis", 198.45);
        this.produkt2 = new Product("Z01", "zeszyt 96 kartek", 22.87);

    }

    @Test
    public void testAddDiscount() {

        produkt1.addDiscount(10);
        Assert.assertEquals(178.605, produkt1.getPrice(), 0.01);

    }

    @Test
    public void testCompareTo() {

        Assert.assertEquals(1, produkt1.compareTo(produkt2));

    }
}