import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FakturaTest {

    @Test
    public void getListaProduktow() {
        Klient klient = new Klient("Mobbyn", "2137", "123", "3456");
        Produkt produkt = new Produkt("Trapfon", 2, 1.5, 1.23);
        Faktura faktura = new Faktura(klient);
        ArrayList<Produkt> lista = new ArrayList<>();
        Assert.assertEquals(faktura.getListaProduktow(), lista);
    }

    @Test
    public void dodajProdukt() {
        Klient klient = new Klient("Mobbyn", "2137", "123", "3456");
        Produkt produkt = new Produkt("Trapfon", 2, 1.5, 1.23);
        Faktura faktura = new Faktura(klient);
        faktura.dodajProdukt(produkt);
        ArrayList<Produkt> lista = new ArrayList<>();
        lista.add(produkt);
        Assert.assertEquals(faktura.getListaProduktow(), lista);
    }

    @Test
    public void usunProdukt() {
        Klient klient = new Klient("Mobbyn", "2137", "123", "3456");
        Produkt produkt = new Produkt("Trapfon", 2, 1.5, 1.23);
        Produkt produkt2 = new Produkt("Trapfon", 2, 1.5, 1.23);
        Faktura faktura = new Faktura(klient);
        faktura.dodajProdukt(produkt);
        faktura.dodajProdukt(produkt2);
        faktura.usunProdukt(produkt2);
        Assert.assertEquals(faktura.getListaProduktow().size(), 1);
    }

    @Test
    public void getProdukt() {
        Klient klient = new Klient("Mobbyn", "2137", "123", "3456");
        Produkt produkt = new Produkt("Trapfon", 2, 1.5, 1.23);
        Faktura faktura = new Faktura(klient);
        faktura.dodajProdukt(produkt);
        Assert.assertEquals(faktura.getProdukt(produkt), produkt);
    }


    @Test
    public void getSuma() {
        Klient klient = new Klient("Mobbyn", "2137", "123", "3456");
        Produkt produkt = new Produkt("Koks", 10, 1, 1.5);
        Produkt produkt2 = new Produkt("Weed", 20, 2, 1.5);
        Faktura faktura = new Faktura(klient);
        faktura.dodajProdukt(produkt);
        faktura.dodajProdukt(produkt2);
        Assert.assertEquals(faktura.getSuma(), 75.0, 0);
    }
}