import org.junit.*;
public class OfficeEmployeeTest {
    @Test
    public void prototypeConstructorGet(){
        OfficeEmployee kowalski = new OfficeEmployee("Jan", "Kowalski", 25, 3, "Warszawa", "Kasztanowa", 4, 1, 70);
        Assert.assertEquals(70, kowalski.getIntelect(), 0.0);
    }
}
