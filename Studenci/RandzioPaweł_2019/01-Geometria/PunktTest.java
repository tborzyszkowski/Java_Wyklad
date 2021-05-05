import org.junit.Assert;

class PunktTest {

    @org.junit.jupiter.api.Test
    void getX() {
        Punkt punkt = new Punkt(2.1,3.3);
        Punkt punktTest = new Punkt(punkt);
        Assert.assertEquals(2.1, punktTest.getX(), 0.0001);
    }

    @org.junit.jupiter.api.Test
    void getY() {
        Punkt punkt = new Punkt(1.9,4.2);
        Punkt punktTest = new Punkt(punkt);
        Assert.assertEquals(4.2,punktTest.getY(),0.0001);
    }

    @org.junit.jupiter.api.Test
    void setX() {
        Punkt punkt = new Punkt(0.2,6.3);
        Punkt punktTest = new Punkt(punkt);
        punktTest.setX(2.2);
        Assert.assertEquals(2.2,punktTest.x,0.0001);
    }

    @org.junit.jupiter.api.Test
    void setY() {
        Punkt punkt = new Punkt(7.4,4.5);
        Punkt punktTest = new Punkt(punkt);
        punktTest.setY(5.6);
        Assert.assertEquals(5.6,punktTest.y,0.0001);
    }

    @org.junit.jupiter.api.Test
    void shift() {
        Punkt punkt = new Punkt(2.0, 1.4);
        punkt.shift(3.1,0.2);
        Assert.assertEquals(5.1,punkt.getX(),0.0001);
        Assert.assertEquals(1.6,punkt.getY(),0.0001);
    }

    @org.junit.jupiter.api.Test
    void distance() {
        Punkt punktA = new Punkt();
        Punkt punktB = new Punkt(1.0,2.0);
        Assert.assertEquals(Math.sqrt(Math.pow(punktA.x-punktB.x,2)+Math.pow(punktA.y-punktB.y,2)),punktA.distance(punktB),0.0001);
    }
}