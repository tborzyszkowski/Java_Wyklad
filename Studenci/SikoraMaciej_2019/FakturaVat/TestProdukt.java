import org.junit.*;

public class TestProdukt {
    @Test
    public void testCeny(){
        Produkt banany = new Produkt("Banan", 7.50);

        Assert.assertEquals(7.50, banany.podajCene(), 0.001);
    }
    @Test
    public void tenSamProdukt(){
        Produkt banany = new Produkt("Banan", 7.50);
        Produkt zieloneBanany = new Produkt(banany);

        Assert.assertEquals(7.50, zieloneBanany.podajCene(), 0.001);
    }

}
