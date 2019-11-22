package FVAT;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.time.LocalDate;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FakturaTest {
    public Klient klient = new Klient("Renren",
             "jerzy@mail.com",
            "84-300",
            "Lębork",
            "Zbyszka","23/3",
            12345432,
            "2134764543456555");

    public Pozycja poz1 = new Pozycja("Placki", 4, 4.5, 0.23);
    public Pozycja poz2 = new Pozycja("Surowka", 1, 2.25, 0.23);
    public Pozycja poz3 = new Pozycja("Kompot", 1, 3.0, 0.23);
    @Test
    public void faktura1TestLicznikaFakturTest()
        //Test licznika jako pierwszy - żeby nie zmienić licznika faktur przed testem
    {
        Faktura fakturaTest1 = new Faktura(klient);
        Faktura fakturaTest2 = new Faktura(klient);
        Faktura fakturaTest3 = new Faktura(klient);

        int licznik = Faktura.getLicznikFaktur();


        Assert.assertEquals(3,licznik);
    }

    @Test
    public void fakturaConstructorTest(){

        LocalDate dataWystawieniaTest = LocalDate.now();

        Faktura fakturaTest = new Faktura(klient);


        Assert.assertEquals(klient, fakturaTest.getNabywca());
        Assert.assertEquals(0.0, fakturaTest.getWartosc(), 0.0001);
        Assert.assertEquals(dataWystawieniaTest, fakturaTest.getDataWystawienia());

    }
    @Test
    public void fakturaConstructorTestLicznik(){
        int i = Faktura.getLicznikFaktur();
        LocalDate dataWystawieniaTest = LocalDate.now();

        Faktura fakturaTest = new Faktura(klient);

        Assert.assertEquals(i + 1, fakturaTest.getNumerFaktury());

    }

    @Test
    public void fakturaNowaPozycjaTest(){
        Faktura fakturaTest = new Faktura(klient);

        fakturaTest.addPozycje(poz1);

        Assert.assertEquals(poz1, fakturaTest.getPozycja(0));

    }

    @Test
    public void fakturaDrugaPozycjaTest(){
        Faktura fakturaTest = new Faktura(klient);
        fakturaTest.addPozycje(poz1);

        fakturaTest.addPozycje(poz2);

        Assert.assertEquals(poz2, fakturaTest.getPozycja(1));

    }

    @Test
    public void fakturaPobierzDlugoscTest(){
        Faktura fakturaTest = new Faktura(klient);
        fakturaTest.addPozycje(poz1);
        fakturaTest.addPozycje(poz2);
        fakturaTest.addPozycje(poz3);

        int dlugosc = fakturaTest.dlugosc();

        Assert.assertEquals(3, dlugosc);
    }

    @Test
    public void fakturaPobierzPierwszaPozycjeTest(){
        Faktura fakturaTest = new Faktura(klient);
        fakturaTest.addPozycje(poz1);
        fakturaTest.addPozycje(poz2);

        Pozycja pobrana = fakturaTest.getPozycja(0);

        Assert.assertEquals(poz1, pobrana);
    }

    @Test
    public void fakturaPobierzOstatniaPozycjeTest(){
        Faktura fakturaTest = new Faktura(klient);
        fakturaTest.addPozycje(poz1);
        fakturaTest.addPozycje(poz2);

        Pozycja pobrana = fakturaTest.getPozycja(fakturaTest.dlugosc()-1);

        Assert.assertEquals(poz2, pobrana);
    }

    @Test
    public void fakturaPobierzNabywceTest(){
        Faktura fakturaTest = new Faktura(klient);

        Klient klientTest = fakturaTest.getNabywca();

        Assert.assertEquals(klient, klientTest);
    }

    @Test
    public void fakturaPobierzWartoscTest(){
        Faktura fakturaTest = new Faktura(klient);
        fakturaTest.addPozycje(poz1);
        fakturaTest.addPozycje(poz2);

        double wartoscTest = poz1.getBrutto() + poz2.getBrutto();

        Assert.assertEquals(wartoscTest, fakturaTest.getWartosc(), 0.001);
    }

    @Test
    public void fakturaDrukujFakture(){
        Faktura fakturaTest = new Faktura(klient);
        fakturaTest.addPozycje(poz1);
        fakturaTest.addPozycje(poz2);
        fakturaTest.addPozycje(poz3);

        fakturaTest.drukujFakture();
    }


}
