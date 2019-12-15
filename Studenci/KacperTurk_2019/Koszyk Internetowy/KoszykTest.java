import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KoszykTest {

    @Test
    void getCheapest() {
        Product prod1 = new Product("JJJ25H00","Walizka",123.45);
        Product prod2 = new Product("DDJ20H92","Czajnik",574.99);
        Product prod3 = new Product("MNU11H34","Telewizor",2568.99);
        Product prod4 = new Product("ABX35H66","Mikrofalowka",323.45);
        List<Product> lista = new ArrayList<Product>();
        lista.add(prod1);
        lista.add(prod2);
        lista.add(prod3);
        lista.add(prod4);
        Koszyk kosz = new Koszyk(lista);
        List<Product> compare = new ArrayList<>(kosz.getCheapest(2));
        assertEquals(prod1, compare.get(0), "Error");
        assertEquals(prod4, compare.get(1), "Error");
    }


    @Test
    void getMexpensive() {
        Product prod1 = new Product("JJJ25H00","Plecak",123.45);
        Product prod2 = new Product("DDJ20H92","Czajnik",574.99);
        Product prod3 = new Product("MNU11H34","Telewizor",2568.99);
        Product prod4 = new Product("ABX35H66","Mikrofalowka",323.45);
        List<Product> lista = new ArrayList<Product>();
        lista.add(prod1);
        lista.add(prod2);
        lista.add(prod3);
        lista.add(prod4);
        Koszyk kosz = new Koszyk(lista);
        List<Product> compare = new ArrayList<>(kosz.getMexpensive(2));
        assertEquals(prod3, compare.get(0), "Error1");
        assertEquals(prod2, compare.get(1), "Error2");
    }

    @Test
    void sumDiscountedPrice() {
        Koszyk kosz = new Koszyk();
        kosz.addProduct(new Product("JJJ25H00","Plecak",123.45));
        kosz.addProduct(new Product("ABX35H66","Mikrofalowka",323.45));
        kosz.addProduct(new Product("MNU11H34","Telewizor",2568.99));
        kosz.discount300();
        assertEquals(2865.09, kosz.sumDiscountedPrice(),0.01,"Error");
    }

    @Test
    void discount3for2() {
        Product prod1 = new Product("JJJ25H00","Plecak",123.45);
        Product prod2 = new Product("DDJ20H92","Lodowka",574.99);
        Product prod3 = new Product("MNU11H34","Laptop",2568.99);
        Product prod4 = new Product("ABX35H66","Mikrofalowka",323.45);
        List<Product> lista = new ArrayList<Product>();
        lista.add(prod1);
        lista.add(prod2);
        lista.add(prod3);
        lista.add(prod4);
        Koszyk kosz = new Koszyk(lista);
        kosz.discount3for2();
        assertEquals(prod1.getDiscountPrice(), 0, "Error");
    }

    @Test
    void kubekGratis() {
        Koszyk kosz = new Koszyk();
        kosz.addProduct(new Product("JJJ25H00","Plecak",123.45));
        kosz.addProduct(new Product("ABX35H66","Mikrofalowka",323.45));
        kosz.kubekGratis();
        assertEquals("Firmowy Kubek",kosz.getLastProduct().getName(), "Error");
    }

    @Test
    void discount300() {
        Koszyk kosz = new Koszyk();
        kosz.addProduct(new Product("JJJ25H00","Plecak",123.45));
        kosz.addProduct(new Product("ABX35H66","Mikrofalowka",323.45));
        kosz.addProduct(new Product("MNU11H34","Telewizor",2568.99));
        kosz.discount300();
        assertEquals(2440.54,kosz.getLastProduct().getDiscountPrice(),0.01, "Error");
    }

    @Test
    void  kuponRabatowy() {
        Koszyk kosz = new Koszyk();
        kosz.addProduct(new Product("JJJ25H00","Plecak",123.45));
        kosz.addProduct(new Product("ABX35H66","Mikrofalowka",323.45));
        kosz.addProduct(new Product("MNU11H34","Telewizor",2568.99));
        kosz.kuponRabatowy(kosz.getXproduct(2));
        assertEquals(226.41, kosz.getXproduct(2).getDiscountPrice(), 0.01, "Error");
    }

    @Test
    void showList() {
        Product prod1 = new Product("JJJ25H00","Walizka",123.45);
        Product prod2 = new Product("DDJ20H92","Plecak",174.99);
        Product prod3 = new Product("MNU11H34","Telewizor",2568.99);
        Product prod4 = new Product("ABX35H66","Mikrofalowka",323.45);
        List<Product> lista = new ArrayList<Product>();
        lista.add(prod1);
        lista.add(prod2);
        lista.add(prod3);
        lista.add(prod4);
        Koszyk kosz = new Koszyk(lista);
        kosz.sortKoszykDescending();
        kosz.showList();
    }
}