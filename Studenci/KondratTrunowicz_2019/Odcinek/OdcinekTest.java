

import org.junit.*;

public class OdcinekTest {

    @Test
    public void prototypeConstructorResult_getStartingX() {
        // Arrange
        Odcinek odcinek = new Odcinek (3.0, 0.0, 8.0, 0.0 );
        // Act
        // Assert
        Assert.assertEquals(3.0, odcinek.getStarting_X(), 0.001);
    }
    @Test
    public void prototypeConstructorResult_getStartingY() {
        // Arrange
        Odcinek odcinek = new Odcinek (3.0, 0.0, 8.0, 0.0 );
        // Act
        // Assert
        Assert.assertEquals(0.0, odcinek.getStarting_Y(), 0.001);
    }
    @Test
    public void prototypeConstructorResult_getEndingX() {
        // Arrange
        Odcinek odcinek = new Odcinek (3.0, 0.0, 8.0, 0.0 );
        // Act
        // Assert
        Assert.assertEquals(8.0, odcinek.getEnding_X(), 0.001);
    }
    @Test
    public void prototypeConstructorResult_getEndingY() {
        // Arrange
        Odcinek odcinek = new Odcinek (3.0, 0.0, 8.0, 0.0 );
        // Act
        // Assert
        Assert.assertEquals(0.0, odcinek.getEnding_Y(), 0.001);
    }
    @Test
    public void prototypeConstructorSetStartingX() {
        // Arrange
        Odcinek odcinek = new Odcinek ();
        odcinek.setStarting_x(1.0);
        // Assert
        Assert.assertEquals(1.0, odcinek.getStarting_X(), 0.001);
    }
    @Test
    public void prototypeConstructorSetStartingY() {
        // Arrange
        Odcinek odcinek = new Odcinek ();
        odcinek.setStarting_y(1.0);
        // Assert
        Assert.assertEquals(1.0, odcinek.getStarting_Y(), 0.001);
    }
    @Test
    public void prototypeConstructorSetEndingX() {
        // Arrange
        Odcinek odcinek = new Odcinek ();
        odcinek.setEnding_x(1.0);
        // Assert
        Assert.assertEquals(1.0, odcinek.getEnding_X(), 0.001);
    }
    @Test
    public void prototypeConstructorSetEndingY() {
        // Arrange
        Odcinek odcinek = new Odcinek ();
        odcinek.setEnding_y(1.0);
        // Assert
        Assert.assertEquals(1.0, odcinek.getEnding_Y(), 0.001);
    }
    @Test
    public void OdcinekPunktOnStartX() {
        // Arrange
        Punkt punkt = new Punkt (5,10);
        Odcinek odcinek = new Odcinek (punkt, 8.0, 0.0 );
        Assert.assertEquals(5.0, odcinek.getStarting_X(), 0.001);
    }
    @Test
    public void OdcinekPunktOnStartY() {
        // Arrange
        Punkt punkt = new Punkt (5,10);
        Odcinek odcinek = new Odcinek (punkt, 8.0, 0.0 );
        Assert.assertEquals(10.0, odcinek.getStarting_Y(), 0.001);
    }
    @Test
    public void OdcinekPunktOnEndX() {
        // Arrange
        Punkt punkt = new Punkt (5,10);
        Odcinek odcinek = new Odcinek (8.0, 0.0, punkt );
        Assert.assertEquals(5.0, odcinek.getEnding_X(), 0.001);

    }
    @Test
    public void OdcinekPunktOnEndY() {
        // Arrange
        Punkt punkt = new Punkt (5,10);
        Odcinek odcinek = new Odcinek (8.0, 0.0, punkt );
        Assert.assertEquals(10.0, odcinek.getEnding_Y(), 0.001);
    }
    @Test
    public void OdcinekEmptyStartingX() {
        // Arrange
        Odcinek odcinek = new Odcinek();
        Assert.assertEquals(0.0, odcinek.getStarting_X(), 0.001);
    }
    @Test
    public void OdcinekEmptyStartingY() {
        // Arrange
        Odcinek odcinek = new Odcinek();
        Assert.assertEquals(0.0, odcinek.getStarting_Y(), 0.001);
    }
    @Test
    public void OdcinekEmptyEndingX() {
        // Arrange
        Odcinek odcinek = new Odcinek();
        Assert.assertEquals(0.0, odcinek.getEnding_X(), 0.001);
    }
    @Test
    public void OdcinekEmptyEndingY() {
        // Arrange
        Odcinek odcinek = new Odcinek();
        Assert.assertEquals(0.0, odcinek.getEnding_Y(), 0.001);
    }
    @Test
    public void OdcinekPunktPunktStartingX() {
        // Arrange
        Punkt punkt1 = new Punkt (5,10);
        Punkt punkt2 = new Punkt (20,30);
        Odcinek odcinek = new Odcinek (punkt1, punkt2);
        Assert.assertEquals(5.0, odcinek.getStarting_X(), 0.001);
    }
    @Test
    public void OdcinekPunktPunktStartingY() {
        // Arrange
        Punkt punkt1 = new Punkt (5,10);
        Punkt punkt2 = new Punkt (20,30);
        Odcinek odcinek = new Odcinek (punkt1, punkt2);
        Assert.assertEquals(10.0, odcinek.getStarting_Y(), 0.001);
    }
    @Test
    public void OdcinekPunktPunktEndingX() {
        // Arrange
        Punkt punkt1 = new Punkt (5,10);
        Punkt punkt2 = new Punkt (20,30);
        Odcinek odcinek = new Odcinek (punkt1, punkt2);
        Assert.assertEquals(20.0, odcinek.getEnding_X(), 0.001);
    }
    @Test
    public void OdcinekPunktPunktEndingY() {
        // Arrange
        Punkt punkt1 = new Punkt (5,10);
        Punkt punkt2 = new Punkt (20,30);
        Odcinek odcinek = new Odcinek (punkt1, punkt2);
        Assert.assertEquals(30.0, odcinek.getEnding_Y(), 0.001);
    }
    @Test
    public void shift_startingX() {
        // Arrange
        Odcinek odcinek1 = new Odcinek(1.0, 1.0, 2.0, 2.0);
        Odcinek odcinek2 = new Odcinek(2.0, 2.0, 3.0, 3.0);

        // Act
        odcinek1.shiftodcinek(1.0, 0.0);

        // Assert
        Assert.assertEquals(odcinek1.getStarting_X(), odcinek2.getStarting_X(), 0.001);

    }
    @Test
    public void shift_startingY() {
        // Arrange
        Odcinek odcinek1 = new Odcinek(1.0, 1.0, 2.0, 2.0);
        Odcinek odcinek2 = new Odcinek(2.0, 2.0, 3.0, 3.0);

        // Act
        odcinek1.shiftodcinek(0.0, 1.0);

        // Assert
        Assert.assertEquals(odcinek1.getStarting_Y(), odcinek2.getStarting_Y(), 0.001);

    }
    @Test
    public void shift_endingX() {
        // Arrange
        Odcinek odcinek1 = new Odcinek(1.0, 1.0, 2.0, 2.0);
        Odcinek odcinek2 = new Odcinek(2.0, 2.0, 3.0, 3.0);

        // Act
        odcinek1.shiftodcinek(1.0, 0.0);

        // Assert
        Assert.assertEquals(odcinek1.getEnding_X(), odcinek2.getEnding_X(), 0.001);

    }
    @Test
    public void shift_endingY() {
        // Arrange
        Odcinek odcinek1 = new Odcinek(1.0, 1.0, 2.0, 2.0);
        Odcinek odcinek2 = new Odcinek(2.0, 2.0, 3.0, 3.0);

        // Act
        odcinek1.shiftodcinek(0.0, 1.0);

        // Assert
        Assert.assertEquals(odcinek1.getEnding_Y(), odcinek2.getEnding_Y(), 0.001);

    }
    @Test
    public void pointDistanceXlesserThanStartingX() {
        // Arrange
        Odcinek odcinek = new Odcinek (3.0, 4.0, 10.0, 12.0);
        Punkt punkt = new Punkt(0.0, 0.0);

        // Act
        double distance = odcinek.pointDistance(punkt);

        // Assert
        Assert.assertEquals(5.0, distance, 0.001);
    }
    @Test
    public void pointDistanceXgreaterThanEndingX() {
        // Arrange
        Odcinek odcinek = new Odcinek (0.0, 0.0, 3.0, 4.0);
        Punkt punkt = new Punkt(6.0, 8.0);

        // Act
        double distance = odcinek.pointDistance(punkt);

        // Assert
        Assert.assertEquals(5.0, distance, 0.001);
    }

    @Test
    public void pointDistanceXInBeetwen() {
        // Arrange
        Odcinek odcinek = new Odcinek (0.0, 0.0, 8.0, 0.0);
        Punkt punkt = new Punkt(4.0, 8.0);

        // Act
        double distance = odcinek.pointDistance(punkt);

        // Assert
        Assert.assertEquals(8.0, distance, 0.001);
    }
    @Test
    public void pointDistanceInSegment() {
        // Arrange
        Odcinek odcinek = new Odcinek (0.0, 0.0, 6.0, 6.0);
        Punkt punkt = new Punkt(3.0, 3.0);

        // Act
        double distance = odcinek.pointDistance(punkt);

        // Assert
        Assert.assertEquals(0, distance, 0.001);
    }
}