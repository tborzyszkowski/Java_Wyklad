package Bank;


import org.junit.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;


public class KontoTest {
    String imieTest = "Jan";
    String nazwiskoTest = "Kowalski";
    String numerKontaTest = "1231321321231321564";
    double srodkiPoczatkowe = 20.00;

    @Test
    public void kontoConstructorTest() {

        HistoriaKontaElementy otwarcieKonta = new HistoriaKontaElementy(LocalDate.now(), "Otwarcie konta", srodkiPoczatkowe);
        Konto kontoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);

        Assert.assertEquals(imieTest, kontoTest.getImie());
        Assert.assertEquals(nazwiskoTest, kontoTest.getNazwisko());
        Assert.assertEquals(numerKontaTest, kontoTest.getNumerKonta());
        Assert.assertEquals(srodkiPoczatkowe, kontoTest.getSrodki(), 0.001);
        Assert.assertEquals(otwarcieKonta.getDataTransakcji(), kontoTest.getHistoriaKonta().get(0).getDataTransakcji());
        Assert.assertEquals(otwarcieKonta.getCelTransakcji(), kontoTest.getHistoriaKonta().get(0).getCelTransakcji());
        Assert.assertEquals(otwarcieKonta.getWartoscTransakcji(), kontoTest.getHistoriaKonta().get(0).getWartoscTransakcji(), 0.001);


    }

    @Test
    public void kontoConstructorBezSrodkowTest() {

        HistoriaKontaElementy otwarcieKonta = new HistoriaKontaElementy(LocalDate.now(), "Otwarcie konta", 0.0);
        Konto kontoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest);

        Assert.assertEquals(imieTest, kontoTest.getImie());
        Assert.assertEquals(nazwiskoTest, kontoTest.getNazwisko());
        Assert.assertEquals(numerKontaTest, kontoTest.getNumerKonta());
        Assert.assertEquals(0.0, kontoTest.getSrodki(), 0.001);
        Assert.assertEquals(otwarcieKonta.getDataTransakcji(), kontoTest.getHistoriaKonta().get(0).getDataTransakcji());
        Assert.assertEquals(otwarcieKonta.getCelTransakcji(), kontoTest.getHistoriaKonta().get(0).getCelTransakcji());
        Assert.assertEquals(otwarcieKonta.getWartoscTransakcji(), kontoTest.getHistoriaKonta().get(0).getWartoscTransakcji(), 0.001);

    }

    @Test
    public void kontoDodajJednaTransakcjeTest() {
        Konto kontoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);

        kontoTest.dodajTransakcje("Test1", 11.11);
        kontoTest.dodajTransakcje("Test2", -1.11);
        kontoTest.dodajTransakcje("Test3", 10.11);
        List<HistoriaKontaElementy> historiaKontaTest = kontoTest.getHistoriaKonta();

        Assert.assertEquals(LocalDate.now(), historiaKontaTest.get(1).getDataTransakcji());
        Assert.assertEquals("Test1", historiaKontaTest.get(1).getCelTransakcji());
        Assert.assertEquals(11.11, historiaKontaTest.get(1).getWartoscTransakcji(), 0.001);
    }
    @Test
    public void kontoDodajDwieTransakcjeTest() {
        Konto kontoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);

        kontoTest.dodajTransakcje("Test1", 11.11);
        kontoTest.dodajTransakcje("Test2", -1.11);
        kontoTest.dodajTransakcje("Test3", 10.11);

        List<HistoriaKontaElementy> historiaKontaTest = kontoTest.getHistoriaKonta();

        Assert.assertEquals(LocalDate.now(), historiaKontaTest.get(2).getDataTransakcji());
        Assert.assertEquals("Test2", historiaKontaTest.get(2).getCelTransakcji());
        Assert.assertEquals(-1.11, historiaKontaTest.get(2).getWartoscTransakcji(), 0.001);
    }
    @Test
    public void kontoDodajTrzyTransakcjeTest() {
        Konto kontoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);

        kontoTest.dodajTransakcje("Test1", 11.11);
        kontoTest.dodajTransakcje("Test2", -1.11);
        kontoTest.dodajTransakcje("Test3", 10.11);

        List<HistoriaKontaElementy> historiaKontaTest = kontoTest.getHistoriaKonta();

        Assert.assertEquals(LocalDate.now(), historiaKontaTest.get(3).getDataTransakcji());
        Assert.assertEquals("Test3", historiaKontaTest.get(3).getCelTransakcji());
        Assert.assertEquals(10.11, historiaKontaTest.get(3).getWartoscTransakcji(), 0.001);
    }

    @Test
    public void kontoDrukujHistorieTest() {
        Konto kontoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);

        kontoTest.dodajTransakcje("Test1", 11.11);
        kontoTest.dodajTransakcje("Test2", -1.11);
        kontoTest.dodajTransakcje("Test3", 10.11);

        kontoTest.drukujHistoriaKonta();
    }

    @Test
    public void kontoWplataNaKontoTest() {
        Konto kontoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        double wplata = 21.21;

        kontoTest.wplataNaKonto(wplata);

        Assert.assertEquals(wplata + srodkiPoczatkowe, kontoTest.getSrodki(), 0.001);
    }

    @Test
    public void kontoWyplataZKontaUdanaTest() {
        Konto kontoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        double wyplata = 19.21;

        kontoTest.wyplataZKonta(wyplata);

        Assert.assertEquals(srodkiPoczatkowe - wyplata, kontoTest.getSrodki(), 0.001);
    }

    @Test
    public void kontoWyplataZKontaNieudanaTest() {
        Konto kontoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        double wyplata = 21.21;

        kontoTest.wyplataZKonta(wyplata);

        Assert.assertEquals(srodkiPoczatkowe, kontoTest.getSrodki(), 0.001);
    }

    @Test
    public void kontoPrzelewUdanySrodkiTest() {
        Konto kontoZTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        Konto kontoDoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        double wartosc = 19.21;

        kontoZTest.przelewMiedzyKontami(kontoDoTest, wartosc);

        Assert.assertEquals(srodkiPoczatkowe - wartosc, kontoZTest.getSrodki(), 0.001);
        Assert.assertEquals(srodkiPoczatkowe + wartosc, kontoDoTest.getSrodki(), 0.001);
    }

    @Test
    public void kontoPrzelewUdanyHistoriaZTest() {
        Konto kontoZTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        Konto kontoDoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        double wartosc = 19.21;

        kontoZTest.przelewMiedzyKontami(kontoDoTest, wartosc);

        Assert.assertEquals(LocalDate.now(), kontoZTest.getHistoriaKonta().get(1).getDataTransakcji());
        Assert.assertEquals("Przelew do: " + kontoDoTest.getNumerKonta(), kontoZTest.getHistoriaKonta().get(1).getCelTransakcji());
        Assert.assertEquals(wartosc, kontoZTest.getHistoriaKonta().get(1).getWartoscTransakcji(), 0.001);
    }

    @Test
    public void kontoPrzelewUdanyHistoriaDoTest() {
        Konto kontoZTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        Konto kontoDoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        double wartosc = 19.21;

        kontoZTest.przelewMiedzyKontami(kontoDoTest, wartosc);

        Assert.assertEquals(LocalDate.now(), kontoDoTest.getHistoriaKonta().get(1).getDataTransakcji());
        Assert.assertEquals("Wplata od: " + kontoZTest.getNumerKonta(), kontoDoTest.getHistoriaKonta().get(1).getCelTransakcji());
        Assert.assertEquals(wartosc, kontoDoTest.getHistoriaKonta().get(1).getWartoscTransakcji(), 0.001);
    }


    @Test
    public void kontoPrzelewNieudanyTest(){
        Konto kontoZTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        Konto kontoDoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        double wartosc = 21.21;

        kontoZTest.przelewMiedzyKontami(kontoDoTest, wartosc);

        Assert.assertEquals(srodkiPoczatkowe, kontoZTest.getSrodki(), 0.001);
        Assert.assertEquals(srodkiPoczatkowe, kontoDoTest.getSrodki(), 0.001);
    }

    @Test
    public void kontoHistoriaOgraniczonaTest(){
        Konto kontoTest = new Konto(imieTest, nazwiskoTest, numerKontaTest, srodkiPoczatkowe);
        LocalDate dataPoczatkowa = LocalDate.of(2018, Month.AUGUST, 1);
        LocalDate dataKoncowa = LocalDate.of(2020, Month.JANUARY, 31);

        kontoTest.drukujHistoriaKonta(dataPoczatkowa, dataKoncowa);

    }

}