package Geometria.odcinek;

import org.junit.*;

public class OdcinekTest {
//    @Test
//    public void () {
//        // Arrange
//
//        // Act
//
//        // Assert
//
//    }
    @Test
    public void odcinekConstructorDwaPunktyTest() {
        // Arrange
        Punkt punkt1 = new Punkt(1.0, 2.0);
        Punkt punkt2 = new Punkt(2.0,3.0);


        // Act
        Odcinek odc1 = new Odcinek(punkt1, punkt2);
        // Assert
        Assert.assertEquals(1.0, odc1.getX1(), 0.001);
        Assert.assertEquals(2.0, odc1.getY1(), 0.001);
        Assert.assertEquals(2.0, odc1.getX2(), 0.001);
        Assert.assertEquals(3.0, odc1.getY2(), 0.001);

    }

    @Test
    public void odcinekConstructorDwieWspolrzedneTest() {
        // Arrange
        double x1 = 1.0;
        double y1 = 1.0;
        double x2 = 2.0;
        double y2 = 3.0;


        // Act
        Odcinek odc1 = new Odcinek(x1,y1,x2,y2);
        // Assert
        Assert.assertEquals(1.0, odc1.getX1(), 0.001);
        Assert.assertEquals(1.0, odc1.getY1(), 0.001);
        Assert.assertEquals(2.0, odc1.getX2(), 0.001);
        Assert.assertEquals(3.0, odc1.getY2(), 0.001);

    }

    @Test
    public void odcinekConstructorPustyTest() {
        // Arrange

        // Act
        Odcinek odc1 = new Odcinek();
        // Assert
        Assert.assertEquals(0.0, odc1.getX1(), 0.001);
        Assert.assertEquals(0.0, odc1.getY1(), 0.001);
        Assert.assertEquals(0.0, odc1.getX2(), 0.001);
        Assert.assertEquals(0.0, odc1.getY2(), 0.001);

    }

    @Test
    public void odcinekConstructorPunktWspolrzedneTest() {
        // Arrange
        Punkt punkt1 = new Punkt(1.0, 2.0);
        double x2 = 2.0;
        double y2 = 3.0;


        // Act
        Odcinek odc1 = new Odcinek(punkt1, x2, y2);
        // Assert
        Assert.assertEquals(1.0, odc1.getX1(), 0.001);
        Assert.assertEquals(2.0, odc1.getY1(), 0.001);
        Assert.assertEquals(2.0, odc1.getX2(), 0.001);
        Assert.assertEquals(3.0, odc1.getY2(), 0.001);

    }
    @Test
    public void odcinekConstructorWspolrzednePunktTest() {
        // Arrange
        double x2 = 2.0;
        double y2 = 3.0;
        Punkt punkt1 = new Punkt(1.0, 2.0);



        // Act
        Odcinek odc1 = new Odcinek( x2, y2, punkt1);
        // Assert
        Assert.assertEquals(2.0, odc1.getX1(), 0.001);
        Assert.assertEquals(3.0, odc1.getY1(), 0.001);
        Assert.assertEquals(1.0, odc1.getX2(), 0.001);
        Assert.assertEquals(2.0, odc1.getY2(), 0.001);

    }

    @Test
    public void odcinekLengthTest() {
        // Arrange
        Punkt punkt1 = new Punkt(1.0, 2.0);
        Punkt punkt2 = new Punkt(4.0,6.0);
        Odcinek odc1 = new Odcinek(punkt1, punkt2);
        // Act
        double len = odc1.length();
        // Assert
        Assert.assertEquals(5.0, len, 0.001);
    }

    @Test
    public void odcinekShiftTest() {
        // Arrange
        Odcinek odc1 = new Odcinek(1.0,2.0,2.0,3.0);
        double x = 1.0;
        double y = 1.0;
        // Act
        odc1.shift(x,y);
        // Assert
        Assert.assertEquals(2.0, odc1.getX1(), 0.001);
        Assert.assertEquals(3.0, odc1.getY1(), 0.001);
        Assert.assertEquals(3.0, odc1.getX2(), 0.001);
        Assert.assertEquals(4.0, odc1.getY2(), 0.001);

    }

}
