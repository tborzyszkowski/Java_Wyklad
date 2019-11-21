package geometria;
import static org.junit.jupiter.api.Assertions.*;

class OdcinekTest {

    @org.junit.jupiter.api.Test
    void shift() {
        Odcinek od = new Odcinek(new Punkt(),8,0);
        od.shift(2,2);
        assertEquals(2,od.getX1(),0.01,"Blad x1");
        assertEquals(2,od.getY1(),0.01,"Blad y1");
        assertEquals(10,od.getX2(),0.01,"Blad x2");
        assertEquals(2,od.getY2(),0.01,"Blad y2");
    }

    @org.junit.jupiter.api.Test
    void pointDistance() {
        Odcinek od = new Odcinek(new Punkt(),8,0);
        Punkt pun = new Punkt(4,4);
        assertEquals(4,od.pointDistance(pun),0.01,"Blad");
    }
}