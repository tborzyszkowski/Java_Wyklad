import org.junit.*;

public class OsobaTest {

    @Test
    public void prototypeConstructorGetDane()
    {
        Osoba dzieciol = new Osoba("Dzieciol", "Warszawa Zielona 2", "0123456789", "1234123412341234");
        Assert.assertEquals("Warszawa Zielona 2", dzieciol.getAdres());
        Assert.assertEquals("1234123412341234", dzieciol.getKonto());
        Assert.assertEquals("0123456789", dzieciol.getNIP());
        Assert.assertEquals("Dzieciol", dzieciol.getNazwa());
    }
}
