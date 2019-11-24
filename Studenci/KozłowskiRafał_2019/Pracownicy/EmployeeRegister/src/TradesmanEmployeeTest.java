import org.junit.*;
public class TradesmanEmployeeTest{

    @Test
    public void prototypeConstructorGeProvision(){
        TradesmanEmployee nowak = new TradesmanEmployee("Jan", "Nowak", 35, 4, "Gdańsk", "Straussa", 56, 3,2.5, 1);
        Assert.assertEquals(2.5, nowak.getProvision(), 0.1);
    }
}
