import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class WlascicielTest
{
    @Test
    public void getImie()
    {
        Wlasciciel wlasciciel = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        Assert.assertEquals(wlasciciel.getImie(), "Roman");
    }
    @Test
    public void getNazwisko()
    {
        Wlasciciel wlasciciel = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        Assert.assertEquals(wlasciciel.getNazwisko(), "Polanski");
    }
    @Test
    public void getDataUrodzenia()
    {
        Wlasciciel wlasciciel = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        Assert.assertEquals(wlasciciel.getDataUrodzenia(), LocalDate.of(1987,12,23));
    }
    @Test
    public void setImie()
    {
        Wlasciciel wlasciciel = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        wlasciciel.setImie("Karol");
        Assert.assertEquals(wlasciciel.getImie(), "Karol");
    }
    @Test
    public void setNazwisko()
    {
        Wlasciciel wlasciciel = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        wlasciciel.setNazwisko("Nowak");
        Assert.assertEquals(wlasciciel.getNazwisko(), "Nowak");
    }
    @Test
    public void setDataUrodzenia()
    {
        Wlasciciel wlasciciel = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        wlasciciel.setDataUrodzenia(LocalDate.of(1985,11,30));
        Assert.assertEquals(wlasciciel.getDataUrodzenia(), LocalDate.of(1985,11,30));
    }
}
