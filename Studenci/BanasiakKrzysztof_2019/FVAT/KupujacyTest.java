package faktura;

import org.junit.*;


public class KupujacyTest {

    @Test
    public void cenaBruttoZilosci() {
        Kupujacy pierwszy = new Kupujacy("Piotr", "Gość", "Piotrbud", "Wojska Polskiego 23", "745-18-51-196" );

        Assert.assertEquals("745-18-51-196", pierwszy.getNip());
    }
}
