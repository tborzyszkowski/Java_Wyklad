package geometria;

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
    @Test
    public void shiftValue() {
        // Arrange
        Punkt punkt = new Punkt(1.0, 1.0);

        // Act
        punkt.shift(1.0, 1.0);
        double x = punkt.getX();
        double y = punkt.getY();

        // Assert
        Assert.assertEquals(2, x, 0.001);
        Assert.assertEquals(2, y, 0.001);

    }

    @Test
    public void shiftPointZero() {
        // Arrange
        Punkt punkt = new Punkt(1.0, 1.0);

        // Act
        punkt.shift(0.0, 0.0);
        double x = punkt.getX();
        double y = punkt.getY();

        // Assert
        Assert.assertEquals(1, x, 0.001);
        Assert.assertEquals(1, y, 0.001);

    }

    @Test
    public void shiftFromZero() {
        // Arrange
        Punkt punkt = new Punkt(0.0, 0.0);

        // Act
        punkt.shift(1.0, 1.0);
        double x = punkt.getX();
        double y = punkt.getY();

        // Assert
        Assert.assertEquals(1, x, 0.001);
        Assert.assertEquals(1, y, 0.001);

    }

    @Test
    public void shiftZeroFromZero() {
        // Arrange
        Punkt punkt = new Punkt(0.0, 0.0);

        // Act
        punkt.shift(0.0, 0.0);
        double x = punkt.getX();
        double y = punkt.getY();

        // Assert
        Assert.assertEquals(0, x, 0.001);
        Assert.assertEquals(0, y, 0.001);

    }

}
