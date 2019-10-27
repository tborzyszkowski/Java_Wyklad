package Laboratorium.klasy;

import org.junit.*;

public class PunktTest {

    @Test
    public void prototypeConstructorResult_getX() {
        // Arrange
        Punkt punkt = new Punkt(1, 1);

        // Act
        Punkt newPunkt = new Punkt(punkt);

        // Assert
        Assert.(1, newPunkt.getX());
    }
}
