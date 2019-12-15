import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class KlientTest {

    @Test
    void wplata() {
        Klient k1 = new Klient();
        k1.wplata(2000.60);
        assertEquals(2000.60,k1.getStan_konta(),0.01,"Blad");
    }

    @Test
    void wyplata() {
        Klient k1 = new Klient("Myrton","Grunwald",5600.70);
        k1.wyplata(2000.60);
        assertEquals(3600.10,k1.getStan_konta(),0.01,"Blad");
    }

    @Test
    void przelew() {
        Klient k1 = new Klient("Myrton","Grunwald",5600.70);
        Klient k2 = new Klient("Stefan","Nowak", 1290.90);
        k1.przelew(k2,1000.60);
        assertEquals(4600.10,k1.getStan_konta(),0.01,"Blad");
        assertEquals(2291.50,k2.getStan_konta(),0.01,"Blad");
    }


    @Test
    void showHistory() {
        Klient k1 = new Klient("Myrton","Grunwald",5600.70);
        Klient k2 = new Klient("Stefan","Nowak", 1290.90);
        k1.addLog(new Log(k1.getId(),200,  new GregorianCalendar(2018, Calendar.DECEMBER,20).getTime()));
        k1.addLog(new Log(0,600.50,  new GregorianCalendar(2019, Calendar.APRIL,19).getTime()));
        k1.addLog(new Log(k2.getId(),3200.90,  new GregorianCalendar(2019, Calendar.OCTOBER,5).getTime()));
        k1.addLog(new Log(k1.getId(),420.90,  new GregorianCalendar(2019, Calendar.OCTOBER,20).getTime()));
        k1.addLog(new Log(k1.getId(),67.83,  new GregorianCalendar(2019, Calendar.NOVEMBER,11).getTime()));
        k1.showHistory(new GregorianCalendar(2019, Calendar.MARCH,19).getTime(), new GregorianCalendar(2019, Calendar.NOVEMBER,6).getTime() );

    }
}