import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UTest {

    @org.junit.jupiter.api.Test
    void pointConstructor() {
        Point toTest = new Point();
        assertEquals(0, toTest.getX(), "konstruktor bezargumentowy i geter x");
        assertEquals(0, toTest.getY(), "konstruktor bezargumentowy i geter y");
        Point toTest2 = new Point(3.4, 4.7);
        assertEquals(3.4, toTest2.getX(), "konstruktor z double i geter x");
        assertEquals(4.7, toTest2.getY(), "konstruktor z double i geter y");
        toTest2.setX(2.7);
        toTest2.setY(4.8);
        Point toTest3 = new Point(toTest2);
        assertEquals(2.7, toTest2.getX(), "konstruktor z Point i geter x");
        assertEquals(4.8, toTest2.getY(), "konstruktor z Point geter y");
    }

    @org.junit.jupiter.api.Test
    void pointShift() {
        Point toTest = new Point();
        toTest.shift(1,2);
        assertEquals(1, toTest.getX(), "shift");
        assertEquals(2, toTest.getY(), "shift");
    }

    @org.junit.jupiter.api.Test
    void pointDistance() {
        Point toTest = new Point(1,2);
        Point toTest2 = new Point(2,1);
        assertEquals(Math.sqrt(2), toTest.distance(toTest2), "distance");
    }

    @org.junit.jupiter.api.Test
    void lineConstructor() {
        Line toTest = new Line();
        assertEquals(new Point(), toTest.getPoint(0), "pusty konstruktor");
        assertEquals(new Point(), toTest.getPoint(1), "pusty konstruktor");

        Point point = new Point(2,1);
        Line toTest2 = new Line(new Point(1,2), point);
        assertEquals(new Point(1,2), toTest2.getPoint(0), "konstruktor z obiektami point");
        assertEquals(new Point(2,1), toTest2.getPoint(1), "konstruktor z obiektami point");
        point.setX(20);
        assertEquals(new Point(2,1), toTest2.getPoint(1), "czy konstruktor wykonuje głęboką kopie");

        Line toTest3 = new Line(new Point(1,2), 2, 3);
        assertEquals(new Point(1,2), toTest3.getPoint(0), "konstruktor mieszany");
        assertEquals(new Point(2,3), toTest3.getPoint(1), "konstruktor mieszany");
    }

    @org.junit.jupiter.api.Test
    void lineShift() {
        Line toTest = new Line();
        toTest.shift(1,2);
        assertEquals(new Point(1,2), toTest.getPoint(0), "przesuniecie linii");
        assertEquals(new Point(1,2), toTest.getPoint(1), "przesuniecie linii");
    }

    @org.junit.jupiter.api.Test
    void lineDistance() {
        Line toTest = new Line(new Point(0,2), new Point(2,2));
        assertEquals(1 , toTest.pointDistance(new Point(1,1)), "dystans do punktu");
    }
}