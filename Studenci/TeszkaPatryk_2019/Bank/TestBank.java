
import org.junit.*;

import java.time.LocalDate;

public class TestBank {

    @Test
    public void Klient_Test_Przelew() {
        Klient klient1 = new Klient("Artur Busz", "84124000016851951755649064");
        Klient klient2 = new Klient("Magdalena Krzak","47249000058974608030475365");
        Transakcje transakcje1 = new Transakcje(klient1, 1000f);
        Transakcje transakcje2 = new Transakcje(klient2, 500f);

        transakcje1.przelew(transakcje2, 200f);
        Assert.assertEquals(800f, transakcje1.getSaldo(), 0);
        Assert.assertEquals(700f, transakcje2.getSaldo(), 0);
    }

    @Test
    public void Klient_Test_Wyplata_Wplata() {
        Klient klient = new Klient("Artur Busz", "84124000016851951755649064");
        Transakcje transakcje = new Transakcje(klient, 500f);

        transakcje.wplata(300f);
        Assert.assertEquals(800f, transakcje.getSaldo(), 0);

        transakcje.wyplata(200f);
        Assert.assertEquals(600f, transakcje.getSaldo(), 0);
    }

    @Test
    public void Historia_Test() {
        Klient klient = new Klient("Artur Busz", "84124000016851951755649064");
        Transakcje transakcje = new Transakcje(klient, 100f);


        transakcje.wplata(300f);
        Assert.assertEquals(400f, transakcje.getSaldo(), 0);
        transakcje.wyplata(50f);
        Assert.assertEquals(350f, transakcje.getSaldo(), 0);
    }

    @Test
    public void Transakcje_Test_Print() {
        Klient klient = new Klient("Artur Busz", "84124000016851951755649064");
        Transakcje transakcje = new Transakcje(klient, 1000f);
        Klient klient2 = new Klient("Magdalena Krzak","47249000058974608030475365");
        Transakcje transakcje2 = new Transakcje(klient2, 500f);

        transakcje.wplata(300f);
        Assert.assertEquals(1300f, transakcje.getSaldo(), 0);
        transakcje.wyplata(50f);
        Assert.assertEquals(1250f, transakcje.getSaldo(), 0);
        transakcje.wplata(450f);
        Assert.assertEquals(1700f, transakcje.getSaldo(), 0);
        transakcje.przelew(transakcje2, 10);

        transakcje.print_transakcje("84124000016851951755649064", LocalDate.now(), LocalDate.now());
        transakcje.print_transakcje("47249000058974608030475365", LocalDate.now(), LocalDate.now());

    }
}

