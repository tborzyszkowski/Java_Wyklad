import org.junit.Assert;
import org.junit.Test;

public class KoszykTest
{
    Produkt stol = new Produkt("000001","Stol",169.99);
    Produkt klawiatura = new Produkt("000002","Klawiatura",49.99);
    Produkt kanapa = new Produkt("000003","Kanapa",169.99);
    Produkt myszka = new Produkt("000004","Myszka",49.99);
    @Test
    public void sort()
    {
        Koszyk koszyk = new Koszyk();
        koszyk.addProdukt(stol);
        koszyk.addProdukt(klawiatura);
        koszyk.addProdukt(kanapa);
        koszyk.addProdukt(myszka);
        koszyk.sort();
        Assert.assertEquals(koszyk.getListaProduktow().toString(), "[" + kanapa + ", " + stol + ", " + klawiatura + ", " + myszka + "]");
    }
    @Test
    public void getSuma()
    {
        Koszyk koszyk = new Koszyk();
        koszyk.addProdukt(stol);
        koszyk.addProdukt(kanapa);
        koszyk.addProdukt(myszka);
        koszyk.sumCena();
        Assert.assertEquals(koszyk.getSuma(),389.97,0.01);
    }
    @Test
    public void getPromoSuma()
    {
        Koszyk koszyk = new Koszyk();
        koszyk.addProdukt(stol);
        koszyk.addProdukt(kanapa);
        koszyk.addProdukt(myszka);
        koszyk.sumCena();
        koszyk.koniec();
        koszyk.sumPromoCena();
        Assert.assertEquals(koszyk.getPromoSuma(),322.98,0.01);
    }
    @Test
    public void koniecBonus()
    {
        Koszyk koszyk = new Koszyk();
        koszyk.addProdukt(stol);
        koszyk.addProdukt(kanapa);
        koszyk.addProdukt(myszka);
        koszyk.sumCena();
        koszyk.koniec();
        koszyk.sumPromoCena();
        Assert.assertEquals(koszyk.getPromoSuma(),322.98,0.01);
    }
    @Test
    public void getCenaMax()
    {
        Koszyk koszyk = new Koszyk();
        koszyk.addProdukt(klawiatura);
        koszyk.addProdukt(kanapa);
        koszyk.addProdukt(myszka);
        koszyk.sort();
        Assert.assertEquals(koszyk.getCenaMax(),kanapa);
    }
    @Test
    public void getCenaMax2()
    {
        Koszyk koszyk = new Koszyk();
        koszyk.addProdukt(stol);
        koszyk.addProdukt(klawiatura);
        koszyk.addProdukt(kanapa);
        koszyk.addProdukt(myszka);
        koszyk.sort();
        Assert.assertEquals(koszyk.getCenaMax(2).toString(),"[" + kanapa + ", " + stol + "]");
    }
    @Test
    public void getCenaMin()
    {
        Koszyk koszyk = new Koszyk();
        koszyk.addProdukt(stol);
        koszyk.addProdukt(klawiatura);
        koszyk.addProdukt(kanapa);
        koszyk.sort();
        Assert.assertEquals(koszyk.getCenaMin(),klawiatura);
    }
    @Test
    public void getCenaMin2()
    {
        Koszyk koszyk = new Koszyk();
        koszyk.addProdukt(stol);
        koszyk.addProdukt(klawiatura);
        koszyk.addProdukt(kanapa);
        koszyk.addProdukt(myszka);
        koszyk.sort();
        Assert.assertEquals(koszyk.getCenaMin(2).toString(),"[" + myszka + ", " + klawiatura + "]");
    }
    @Test
    public void koniecPromo()
    {
        Koszyk koszyk = new Koszyk();
        koszyk.addProdukt(stol);
        koszyk.addProdukt(klawiatura);
        koszyk.addProdukt(kanapa);
        koszyk.addProdukt(myszka);
        koszyk.sumCena();
        koszyk.koniec(kanapa);
        koszyk.sumPromoCena();
        Assert.assertEquals(koszyk.getPromoSuma(),322.02,0.01);
    }
    @Test
    public void kubek()
    {
        Koszyk koszyk = new Koszyk();
        koszyk.addProdukt(stol);
        koszyk.addProdukt(kanapa);
        koszyk.sort();
        koszyk.sumCena();
        koszyk.koniec();
        koszyk.sumPromoCena();
        Assert.assertEquals(koszyk.getListaProduktow().toString(),"[" + kanapa + ", " + stol + ", Kubek Firmowy 0.0zl]");
    }
}