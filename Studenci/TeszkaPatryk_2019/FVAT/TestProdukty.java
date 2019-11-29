
import org.junit.*;
import java.util.Date;

public class TestProdukty {

    @Test
    public void Produkt_Test_brutto() {
        Produkty produkty = new Produkty("Cement", 5, 0.23f);
        produkty.ilosc(10);
        float cos = produkty.cena_brutto();
        Assert.assertEquals(61.5, cos ,0.001);
    }

    @Test
    public void Produkt_Test_faktura() {
        Produkty produkty1 = new Produkty("Cement", 5, 0.23f, 100);
        Produkty produkty2 = new Produkty("Bibuła", 50, 0.10f, 10);
        Produkty produkty3 = new Produkty("Kostka", 15, 0.23f, 10);
        Produkty produkty4 = new Produkty("WD-40", 20, 0.23f, 10);

        Produkty licznik = new Produkty();
        float x = licznik.calkowita_cena_brutto(produkty1,produkty2,produkty3,produkty4); //5*1.23*100 + 50*1.10*10 + 15*1.23*10 + 20*1.23*10 = 1595.5
        Assert.assertEquals(1595.5, x , 0.0001);

    }


    @Test
    public void Sprzedajacy_Test_NrKonta() {
        Sprzedający sprzedający = new Sprzedający();
        Assert.assertEquals("2249000054526807771493031", sprzedający.getNr_konta());
    }

    @Test
    public void Klient_Test_NIP() {
        Klient klient = new Klient();
        Assert.assertEquals("4325453", klient.getNip());
    }


    @Test
    public void Faktura_Test_Nrfaktury() {
        Produkty produkty1 = new Produkty("Cement", 5, 0.23f, 100);
        Produkty produkty2 = new Produkty("Bibuła", 50, 0.10f, 10);
        Klient klient = new Klient("Budomix", "1183843958", "Gdańsk, ul.Budowlancow 56");

        Faktura faktura = new Faktura(klient, produkty1, produkty2);
        Assert.assertEquals(10001, faktura.getNr_faktury());

        faktura.setNowyNrFaktury(2819);
        Assert.assertEquals(2819, faktura.getNr_faktury());
    }

    @Test
    public void Faktura_Test_GetData() {
        Produkty produkty1 = new Produkty("Cement", 5, 0.23f, 100);
        Produkty produkty2 = new Produkty("Bibuła", 50, 0.10f, 10);
        Klient klient = new Klient("Budomix", "1183843958", "Gdańsk, ul.Budowlancow 56");

        Faktura faktura = new Faktura(klient, produkty1, produkty2);

        Date date = new Date();
        Assert.assertEquals(date.toString(), faktura.getWystawienie());

        Date date1 = new Date(System.currentTimeMillis()-48*60*60*1000);
        Assert.assertEquals(date1.toString(), faktura.getSprzedaz());

        Date date2 = new Date(System.currentTimeMillis()-24*60*60*1000);
        Assert.assertEquals(date2.toString(), faktura.getZaplata());

    }
}

