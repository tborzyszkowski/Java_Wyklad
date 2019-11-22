import org.junit.Assert;
import org.junit.Test;

public class ProduktTest {
    @Test
    public void test_init_name(){
        Produkt produkt = new Produkt("Koszula", 12,12.50);
        Assert.assertEquals("Koszula",produkt.getName());
    }
    @Test
    public void test_init_quantity(){
        Produkt produkt = new Produkt("Koszula", 12,12.50);
        Assert.assertEquals(12,produkt.getQuantity());
    }
    @Test
    public void test_init_nPrice(){
        Produkt produkt = new Produkt("Koszula", 12,12.50);
        Assert.assertEquals(12.50,produkt.getnPrice(),0.0001);
    }
    @Test
    public void test_get_name(){
        Produkt produkt = new Produkt("Koszula", 12,12.50);
        produkt.setName("Spodnie");
        Assert.assertEquals("Spodnie",produkt.getName());
    }
    @Test
    public void test_set_name(){
        Produkt produkt = new Produkt("Koszula", 12,12.50);
        produkt.setName("Spodnie");
        Assert.assertEquals("Spodnie",produkt.getName());
    }
    @Test
    public void test_set_quantity(){
        Produkt produkt = new Produkt("Koszula", 12,12.50);
        produkt.setQuantity(1);
        Assert.assertEquals(1,produkt.getQuantity());
    }
    @Test
    public void test_set_nPrice(){
        Produkt produkt = new Produkt("Koszula", 12,12.50);
        produkt.setnPrice(17.23);
        Assert.assertEquals(17.23,produkt.getnPrice(),0.0001);
    }

}
