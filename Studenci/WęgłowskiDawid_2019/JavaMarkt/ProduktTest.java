import org.junit.Assert;
import org.junit.Test;

public class ProduktTest
{
    @Test
    public void getKod()
    {
        Produkt produkt = new Produkt("123456","Jablko",1.00);
        Assert.assertEquals(produkt.getKod(), "123456");
    }
    @Test
    public void getNazwa()
    {
        Produkt produkt = new Produkt("123456","Jablko",1.00);
        Assert.assertEquals(produkt.getNazwa(), "Jablko");
    }
    @Test
    public void getCena()
    {
        Produkt produkt = new Produkt("123456","Jablko",1.00);
        Assert.assertEquals(produkt.getCena(), 1.00,0.001);
    }
    @Test
    public void getPromoCena()
    {
        Produkt produkt = new Produkt("123456","Jablko",1.00);
        Assert.assertEquals(produkt.getPromoCena(), 1.00,0.001);
    }
    @Test
    public void setKod()
    {
        Produkt produkt = new Produkt("123456","Jablko",1.00);
        produkt.setKod("987654");
        Assert.assertEquals(produkt.getKod(), "987654");
    }
    @Test
    public void setNazwa()
    {
        Produkt produkt = new Produkt("123456","Jablko",1.00);
        produkt.setNazwa("Gruszka");
        Assert.assertEquals(produkt.getNazwa(), "Gruszka");
    }
    @Test
    public void setCena()
    {
        Produkt produkt = new Produkt("123456","Jablko",1.00);
        produkt.setCena(2.00);
        Assert.assertEquals(produkt.getCena(), 2.00,0.001);
    }
    @Test
    public void setPromoCena()
    {
        Produkt produkt = new Produkt("123456","Jablko",1.00);
        produkt.setPromoCena(2.00*0.7);
        Assert.assertEquals(produkt.getPromoCena(), 1.40,0.001);
    }
}