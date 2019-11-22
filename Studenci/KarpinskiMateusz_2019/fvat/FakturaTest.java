package fvat;

import org.junit.*;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class FakturaTest {

    @Test
    public void wartoscCalkowitaFaktury(){
        List<PozycjaFaktury> listapozycji = new ArrayList<>(Arrays.asList(
                new PozycjaFaktury("Klawiatura", 10, 300),
                new PozycjaFaktury("Myszka", 20, 200)
        ));
        Faktura faktura = new Faktura(
                listapozycji,
                new Klient("Klawiaturek i myszek", "Gdansk, ul. Bazynskiego 10", "123485"),
                new Sprzedawca("Hurtownia sprzetu", "Gdansk, ul. Bazynskiego 11", "129484", "091284129048" ),
                new Date(),
                new Date()
        );

        double wartosc = faktura.wartoscCalkowita();

        Assert.assertEquals(8610, wartosc, 0.001);
    }

    @Test
    public void aNumerFaktury(){
        List<PozycjaFaktury> listapozycji = new ArrayList<>();
        Faktura faktura1 = new Faktura(
                listapozycji,
                new Klient("Klawiaturek i myszek", "Gdansk, ul. Bazynskiego 10", "123485"),
                new Sprzedawca("Hurtownia sprzetu", "Gdansk, ul. Bazynskiego 11", "129484", "091284129048" ),
                new Date(),
                new Date()
        );
        Faktura faktura2 = new Faktura(
                listapozycji,
                new Klient("Klawiaturek i myszek", "Gdansk, ul. Bazynskiego 10", "123485"),
                new Sprzedawca("Hurtownia sprzetu", "Gdansk, ul. Bazynskiego 11", "129484", "091284129048" ),
                new Date(),
                new Date()
        );

        int numer = faktura2.getNumerFaktury();

        Assert.assertEquals(2, numer, 0.1);
    }
}
