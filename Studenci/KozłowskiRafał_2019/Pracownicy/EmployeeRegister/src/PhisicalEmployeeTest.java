import org.junit.*;

public class PhisicalEmployeeTest {
    @Test
    public void prototypeConstructorGetStrength(){
        PhisicalEmployee figiel = new PhisicalEmployee("Daniel", "Figiel", 41, 2, "Wrocław",  "Leśna", 4, 1, 70);
        Assert.assertEquals(70, figiel.getStrength(), 0.0);
    }
}
