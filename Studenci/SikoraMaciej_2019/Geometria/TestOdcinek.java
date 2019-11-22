import org.junit.*;

public class TestOdcinek {
    @Test
    public void shift_o_jakis_wektorX1() {
        // Arrange
        Odcinek AB = new Odcinek(1.0, 1.0, 3.0, 4.0);

        // Act
        AB.shift(1,2);

        // Assert
        Assert.assertEquals(2, AB.x1, 0.001);
    }
    @Test
    public void shift_o_jakis_wektorX2() {
        // Arrange
        Odcinek AB = new Odcinek(1.0, 1.0, 3.0, 4.0);

        // Act
        AB.shift(1,2);

        // Assert
        Assert.assertEquals(4, AB.x2, 0.001);
    }
    @Test
    public void shift_o_jakis_wektorY1() {
        // Arrange
        Odcinek AB = new Odcinek(1.0, 1.0, 3.0, 4.0);

        // Act
        AB.shift(1,2);

        // Assert
        Assert.assertEquals(3, AB.y1, 0.001);
    }
    @Test
    public void shift_o_jakis_wektorY2() {
        // Arrange
        Odcinek AB = new Odcinek(1.0, 1.0, 3.0, 4.0);

        // Act
        AB.shift(1,2);

        // Assert
        Assert.assertEquals(6, AB.y2, 0.001);
    }
    @Test
    public void odleglosOdPunktuNaOdcinku() {
        // Arrange
        Odcinek AB = new Odcinek(1.0, 1.0, 3.0, 4.0);
        Punkt A = new Punkt(1.0,1.0);

        // Act
        double odleglosc = AB.distance(A);

        // Assert
        Assert.assertEquals(0.0, odleglosc, 0.001);
    }
    @Test
    public void OdlegloscOdDowolnegoPunktu() {
        // Arrange
        Odcinek AB = new Odcinek(0.0, 5.0, 10.0, 5.0);
        Punkt A = new Punkt(6.0,0.0);

        // Act
        double odleglosc = AB.distance(A);

        // Assert
        Assert.assertEquals(5.0, odleglosc, 0.001);
    }
}
