import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class TransakcjaTest
{
    @Test
    public void getNadawca()
    {
        Wlasciciel wlasciciel1 = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        Wlasciciel wlasciciel2 = new Wlasciciel("Bartlomiej","Nowak",LocalDate.of(1970,11,11));
        Konto konto1 = new Konto(wlasciciel1, "11222233334444555566667777");
        Konto konto2 = new Konto(wlasciciel2, "99888877776666555544443333");
        Transakcja transakcja = new Transakcja(konto1, konto2,100.00);
        Assert.assertEquals(transakcja.getNadawca(), konto1);
    }
    @Test
    public void getOdbiorca()
    {
        Wlasciciel wlasciciel1 = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        Wlasciciel wlasciciel2 = new Wlasciciel("Bartlomiej","Nowak",LocalDate.of(1970,11,11));
        Konto konto1 = new Konto(wlasciciel1, "11222233334444555566667777");
        Konto konto2 = new Konto(wlasciciel2, "99888877776666555544443333");
        Transakcja transakcja = new Transakcja(konto1, konto2,100.00);
        Assert.assertEquals(transakcja.getOdbiorca(), konto2);
    }
    @Test
    public void getIlosc()
    {
        Wlasciciel wlasciciel1 = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        Wlasciciel wlasciciel2 = new Wlasciciel("Bartlomiej","Nowak",LocalDate.of(1970,11,11));
        Konto konto1 = new Konto(wlasciciel1, "11222233334444555566667777");
        Konto konto2 = new Konto(wlasciciel2, "99888877776666555544443333");
        Transakcja transakcja = new Transakcja(konto1, konto2,100.00);
        Assert.assertEquals(transakcja.getIlosc(), 100.0,0.001);
    }
    @Test
    public void getNrTransakcji()
    {
        Wlasciciel wlasciciel1 = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        Wlasciciel wlasciciel2 = new Wlasciciel("Bartlomiej","Nowak",LocalDate.of(1970,11,11));
        Konto konto1 = new Konto(wlasciciel1, "11222233334444555566667777");
        Konto konto2 = new Konto(wlasciciel2, "99888877776666555544443333");
        Transakcja transakcja1 = new Transakcja(konto1, konto2,100.00);
        Transakcja transakcja2 = new Transakcja(konto1, konto2,100.00);
        Assert.assertEquals(transakcja2.getNrTransakcji(), 2);
    }
    @Test
    public void getDataTransakcji()
    {
        Wlasciciel wlasciciel1 = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        Wlasciciel wlasciciel2 = new Wlasciciel("Bartlomiej","Nowak",LocalDate.of(1970,11,11));
        Konto konto1 = new Konto(wlasciciel1, "11222233334444555566667777");
        Konto konto2 = new Konto(wlasciciel2, "99888877776666555544443333");
        Transakcja transakcja = new Transakcja(konto1, konto2,100.00);
        Assert.assertEquals(transakcja.getDataTransakcji(), LocalDate.now());
    }
    @Test
    public void setDataTransakcji()
    {
        Wlasciciel wlasciciel1 = new Wlasciciel("Roman", "Polanski", LocalDate.of(1987, 12, 23));
        Wlasciciel wlasciciel2 = new Wlasciciel("Bartlomiej","Nowak",LocalDate.of(1970,11,11));
        Konto konto1 = new Konto(wlasciciel1, "11222233334444555566667777");
        Konto konto2 = new Konto(wlasciciel2, "99888877776666555544443333");
        Transakcja transakcja = new Transakcja(konto1, konto2,100.00);
        transakcja.setDataTransakcji(LocalDate.of(2019,1,1));
        Assert.assertEquals(transakcja.getDataTransakcji(), LocalDate.of(2019,1,1));
    }
}
