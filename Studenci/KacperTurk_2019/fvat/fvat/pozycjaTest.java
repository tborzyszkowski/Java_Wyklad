package fvat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pozycjaTest {

    @Test
    void get_netto() {
        pozycja poz = new pozycja("Walizka",3,247.99,1.23);
        assertEquals(743.97,poz.get_netto(),0.01,"Blad");
    }

    @Test
    void get_brutto() {
        pozycja poz = new pozycja("Walizka",3,247.99,1.23);
        assertEquals(915.08,poz.get_brutto(),0.01,"Blad");
    }

    @Test
    void get_ilosc() {
        pozycja poz = new pozycja("Walizka",3,247.99,1.23);
        assertEquals(3,poz.get_ilosc(),"Blad");
    }

    @Test
    void get_podatek() {
        pozycja poz = new pozycja("Walizka",3,247.99,1.23);
        assertEquals(1.23,poz.get_podatek(),0.01,"Blad");
    }

}