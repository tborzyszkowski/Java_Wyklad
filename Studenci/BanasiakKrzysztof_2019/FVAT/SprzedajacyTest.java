package faktura;

import org.junit.*;


public class SprzedajacyTest {

    @Test
    public void v1() {
        Sprzedajacy pierwszy = new Sprzedajacy("Piotr", "Gość", "Piotrbud",
                "Wojska Polskiego 23", "745-18-51-196","64327689541276896453671009" );
                pierwszy.setNr_konta("1");
        Assert.assertEquals("1", pierwszy.getNr_konta());
    }
    @Test
    public void v2() {
        Sprzedajacy pierwszy = new Sprzedajacy("Piotr", "Gość", "Piotrbud",
                "Wojska Polskiego 23", "745-18-51-196","64327689541276896453671009" );
        pierwszy.setImie("Zygmunt");
        Assert.assertEquals("Zygmunt", pierwszy.getImie());
    }
}
