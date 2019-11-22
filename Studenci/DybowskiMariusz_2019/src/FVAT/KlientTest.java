package FVAT;

import org.junit.Assert;
import org.junit.Test;

public class KlientTest {

    String nazwa = "Bud-bud";
    String email = "email@email.com";
    String kodPocztowy = "84-300";
    String miasto = "Lemborg";
    String ulica = "Krzywa";
    String numer = "27/1";
    int nip = 1112345678;
    String numerKonta = "12345678987654334567897653";

    @Test
    public void klientConstructorTest(){


        Klient klientTest = new Klient(nazwa, email, kodPocztowy, miasto, ulica, numer, nip, numerKonta);

        Assert.assertEquals(nazwa, klientTest.getNazwaFirmy());
        Assert.assertEquals(email, klientTest.getEmail());
        Assert.assertEquals(kodPocztowy, klientTest.getKodPocztowy());
        Assert.assertEquals(miasto, klientTest.getMiasto());
        Assert.assertEquals(ulica, klientTest.getUlica());
        Assert.assertEquals(numer, klientTest.getNumer());
        Assert.assertEquals(nip, klientTest.getNip());
        Assert.assertEquals(numerKonta, klientTest.getNumerKonta());
    }
}
