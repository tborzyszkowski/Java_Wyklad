package Laboratorium.pracownicy;

import org.junit.Test;
import wyklad._03klasy.BoxSample.Box;

import static org.junit.Assert.assertEquals;

public class RejestrTest {
    @Test
    public void testAddPracownik() {
        // Arrange
        Rejestr sut = new Rejestr();
        Robotnik robotnik = new Robotnik("Jan", "Kowalski");
        // Act
        sut.addPracownik(robotnik);
        int result = sut.rejestrSize();
        // Assert
        assertEquals(1, result);
    }
    @Test
    public void testAddRobotnikIUrzednik() {
        // Arrange
        Rejestr sut = new Rejestr();
        Robotnik robotnik = new Robotnik("Jan", "Kowalski");
        Urzednik urzednik = new Urzednik("Jan", "Kowalski");
        // Act
        sut.addPracownik(robotnik);
        sut.addPracownik(urzednik);
        int result = sut.rejestrSize();
        // Assert
        assertEquals(2, result);
    }
    @Test
    public void testAddRobotnikIUrzednikWartoscIs0() {
        // Arrange
        Rejestr sut = new Rejestr();
        Robotnik robotnik = new Robotnik("Jan", "Kowalski");
        Urzednik urzednik = new Urzednik("Jan", "Kowalski");
        // Act
        sut.addPracownik(robotnik);
        sut.addPracownik(urzednik);
        int result = sut.wartoscRejestru();
        // Assert
        assertEquals(0, result);
    }

}
