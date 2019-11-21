package fvat;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class fakturaTest {

    @org.junit.jupiter.api.Test
    void add_brutto() {
        faktura f = new faktura(new klient(),new sprzedajacy());
        f.add_brutto(251.90);
        assertEquals(251.90,f.getBrutto(),0.01,"Blad");
    }

    @org.junit.jupiter.api.Test
    void dodaj_pozycje() {
        faktura f = new faktura(new klient(),new sprzedajacy());
        pozycja poz = new pozycja("Walizka",3,247.99,1.23);
        f.dodaj_pozycje(poz);
        assertEquals(915.08,f.getBrutto(),0.01,"Blad");
    }

    @org.junit.jupiter.api.Test
    void dodaj_liste() {
        faktura f = new faktura(new klient(),new sprzedajacy());
        List<pozycja> lista =new ArrayList<pozycja>();
        lista.add(new pozycja("Walizka",3,247.99,1.23));
        lista.add(new pozycja("Poduszka",5,24.99,1.23));
        f.dodaj_liste(lista);
        assertEquals(1068.77,f.getBrutto(),0.01,"Blad");
    }

    @org.junit.jupiter.api.Test
    void wypisz_fakture() {
        faktura f = new faktura(new klient(),new sprzedajacy());
        List<pozycja> lista =new ArrayList<pozycja>();
        lista.add(new pozycja("Walizka",3,247.99,1.23));
        lista.add(new pozycja("Poduszka",5,24.99,1.23));
        f.dodaj_liste(lista);
        f.wypisz_fakture();
    }
}

