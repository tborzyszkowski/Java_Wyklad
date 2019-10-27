package Laboratorium.klasy;

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
}
