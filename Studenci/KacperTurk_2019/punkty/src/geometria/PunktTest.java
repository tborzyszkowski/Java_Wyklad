package geometria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest {

    @Test
    void shift() {
        Punkt pun = new Punkt(4,5);
        pun.shift(2,2);
        assertEquals(6,pun.getX(),0.01,"Blad x");
        assertEquals(7,pun.getY(),0.01,"Blad y");
}

    @Test
    void distance() {
        Punkt pun1 = new Punkt(0,0);
        Punkt pun2 = new Punkt(3,4);
        assertEquals(5, pun1.distance(pun2),0.01,"Blad");

    }
}