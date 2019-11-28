package faktura;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

class FakturaTest {
  @Test
  void dodajProdukt() {
    Klient client = new Klient("nazwa","gdzies",1234,1234);
    Faktura faktura = new Faktura(20,LocalDate.now(),LocalDate.now(),client);
    Produkt produkt = new Produkt("Ryze",4,20,1.23);
    faktura.dodajProdukt(produkt);
    ArrayList<Produkt> lista = new ArrayList<Produkt>();
    lista.add(produkt);
    Assert.assertEquals(faktura.getListaProduktow(),lista);
  }

  @Test
  void usunProdukt() {
    Klient client = new Klient("nazwa","gdzies",1234,1234);
    Faktura faktura = new Faktura(20,LocalDate.now(),LocalDate.now(),client);
    Produkt produkt = new Produkt("Ryze",4,20,1.23);
    faktura.dodajProdukt(produkt);
    faktura.usunProdukt(produkt);
    ArrayList<Produkt> lista = new ArrayList<Produkt>();
    Assert.assertEquals(faktura.getListaProduktow(),lista);
  }
}