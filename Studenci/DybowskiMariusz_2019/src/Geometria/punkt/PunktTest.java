package Geometria.punkt;

import org.junit.*;

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

}