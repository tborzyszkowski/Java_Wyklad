import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KoszykTest {

    private Koszyk koszyk;
    private Product produkt1, produkt2, produkt3, produkt4;

    @Before
    public void start() {
        this.koszyk = new Koszyk();
        this.produkt1 = new Product("D01", "długopis", 198.45);
        this.produkt2 = new Product("Z01", "zeszyt 96 kartek", 22.87);
        this.produkt3 = new Product("K01", "kredki", 12.86);
        this.produkt4 = new Product("O01", "ołówek", 5.00);
        this.koszyk.addItem(produkt1);
        this.koszyk.addItem(produkt2);
        this.koszyk.addItem(produkt3);
        this.koszyk.addItem(produkt4);
        this.koszyk.checkDiscounts();
    }

    @Test
    public void testFindMaxItem() {

        Assert.assertEquals(produkt1, koszyk.findMaxPrice());

    }

    @Test
    public void testFindMinItem() {

        Assert.assertEquals(produkt4, koszyk.findMinPrice());

    }

    @Test
    public void testcountTotalPrice() {

        Assert.assertEquals(239.18, koszyk.countTotalPrice(), 0.001);

    }

}