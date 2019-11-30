import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KlientTest {

    @Test
    public void getNazwaFirmy() {
        Klient klient = new Klient("Mobbyn", "Gdynia", "2115", "0700");
        Assert.assertEquals(klient.getNazwaFirmy(), "Mobbyn");
    }

    @Test
    public void setNazwaFirmy() {
        Klient klient = new Klient("Mobbyn", "Gdynia", "2115", "0700");
        klient.setNazwaFirmy("HEWRA");
        Assert.assertEquals(klient.getNazwaFirmy(), "HEWRA");
    }

    @Test
    public void getAdres() {
        Klient klient = new Klient("Mobbyn", "Gdynia", "2115", "0700");
        Assert.assertEquals(klient.getAdres(), "Gdynia");
    }

    @Test
    public void setAdres() {
        Klient klient = new Klient("Mobbyn", "Gdynia", "2115", "0700");
        klient.setAdres("OSTR");
        Assert.assertEquals(klient.getAdres(), "OSTR");
    }
}