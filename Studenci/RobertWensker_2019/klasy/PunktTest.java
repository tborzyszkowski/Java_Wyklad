import org.junit.*;

import java.security.PublicKey;

public class PunktTest {

    @Test
    public void prototypeConstructorResult_getX() {
        // Arrange
        Punkt punkt = new Punkt(1.0, 1.0);

        // Act
        Punkt newPunkt = new Punkt(punkt);

        // Assert
        Assert.assertEquals(1.0, newPunkt.getX(), 0.001);
    }
    @Test
    public void prototypeConstructorResult_getY() {
        // Arrange
        Punkt punkt = new Punkt(1.0, 1.0);

        // Act
        Punkt newPunkt = new Punkt(punkt);

        // Assert
        Assert.assertEquals(1.0, newPunkt.getY(), 0.001);
    }
    @Test
    public void distanceFromTheSamePoint() {
        // Arrange
        Punkt punkt = new Punkt(1.0, 1.0);

        // Act
        double distance = punkt.distance(punkt);

        // Assert
        Assert.assertEquals(0.0, distance, 0.001);
    }
    @Test
    public void distanceFromAnotherPoint() {
        // Arrange
        Punkt punkt1 = new Punkt(1.0, 1.0);
        Punkt punkt2 = new Punkt(1.0, 2.0);

        // Act
        double distance = punkt1.distance(punkt2);

        // Assert
        Assert.assertEquals(1.0, distance, 0.001);
    }
    @Test
    public void IDKshiftx1(){
        Punkt punkt1 = new Punkt(1.0,1.0);
        Punkt punkt2 = new Punkt(6.0,6.0);
        punkt1.shift(5.0,5.0);
        Assert.assertEquals(punkt2.getX(),punkt1.getX(),0.001);
    }
    @Test
    public void IDKshifty1(){
        Punkt punkt1 = new Punkt(1.0,1.0);
        Punkt punkt2 = new Punkt(6.0,6.0);
        punkt1.shift(5.0,5.0);
        Assert.assertEquals(punkt2.getY(),punkt1.getY(),0.001);
    }
    @Test
    public void distance(){
        Punkt punkt1 = new Punkt(1.0,1.0);
        Assert.assertEquals( 3,punkt1.distance(new Punkt(4,1)),0.001);
    }
    @Test
    public void PunktInitNoArgsX(){
        Punkt punkt = new Punkt();
        Assert.assertEquals(0,punkt.getX(),0.001);
    }
    @Test
    public void PunktInitNoArgsY(){
        Punkt punkt = new Punkt();
        Assert.assertEquals(0,punkt.getY(),0.001);
    }
    @Test
    public void TestSetX(){
        Punkt punkt = new Punkt();
        punkt.setX(5);
        Assert.assertEquals(5,punkt.getX(),0.001);
    }
    @Test
    public void TestSetY(){
        Punkt punkt = new Punkt();
        punkt.setY(5);
        Assert.assertEquals(5,punkt.getY(),0.001);
    }



}