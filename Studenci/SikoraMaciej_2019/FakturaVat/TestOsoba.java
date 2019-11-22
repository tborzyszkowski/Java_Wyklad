import org.junit.*;

public class TestOsoba {
    @Test
    public void testTakiSam(){
        Osoba drut = new Osoba("Drutex", "Majowa", 1234567890, 230980);
        Osoba oszust = new Osoba(drut);

        Assert.assertEquals(1234567890, oszust.NIP, 0.001);
    }

}
