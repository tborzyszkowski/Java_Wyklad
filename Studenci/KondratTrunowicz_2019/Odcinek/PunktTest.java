
import java.util.*;
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
    public void prototypeConstructorSetX() {
        // Arrange
        Punkt punkt = new Punkt(1.0, 1.0);
        punkt.setX(1.0);
        // Assert
        Assert.assertEquals(1.0, punkt.getX(), 0.001);
    }
    @Test
    public void prototypeConstructorSetY() {
        // Arrange
        Punkt punkt = new Punkt(1.0, 1.0);
        punkt.setY(1.0);
        // Assert
        Assert.assertEquals(1.0, punkt.getY(), 0.001);
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
    public void shiftX(){
        // Arrange
        Punkt punkt1 = new Punkt(1.0, 1.0);
        Punkt punkt2 = new Punkt(2.0, 2.0);

        // Act
        punkt1.shift(1.0,0.0);

        // Assert
        Assert.assertEquals(punkt2.getX(), punkt1.getX(), 0.001);

    }

    @Test
    public void shiftY(){
        // Arrange
        Punkt punkt1 = new Punkt(1.0, 1.0);
        Punkt punkt2 = new Punkt(2.0, 2.0);

        // Act
        punkt1.shift(0.0,1.0);

        // Assert
        Assert.assertEquals(punkt2.getY(), punkt1.getY(), 0.001);

    }
}