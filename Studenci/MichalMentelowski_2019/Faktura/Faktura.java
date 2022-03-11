package faktura;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Faktura {
    private int numerFaktury;
    private LocalDate dataWystawienia;
    private LocalDate dataSprzedazy;
    private LocalDate dataZaplaty;
    private Klient client;
    private List<Produkt> listaProduktow;

    public Faktura(int numerFaktury, LocalDate dataWystawienia, LocalDate dataSprzedazy, Klient client) {
        this.numerFaktury = numerFaktury;
        this.dataWystawienia = dataWystawienia;
        this.dataSprzedazy = dataSprzedazy;
        this.dataZaplaty = dataSprzedazy.minus(Period.ofDays(1));
        this.client = client;
        this.listaProduktow = new ArrayList<Produkt>();
    }

    public int getNumerFaktury() {
        return numerFaktury;
    }

    public void setNumerFaktury(int numerFaktury) {
        this.numerFaktury = numerFaktury;
    }

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(LocalDate dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public LocalDate getDataSprzedazy() {
        return dataSprzedazy;
    }

    public void setDataSprzedazy(LocalDate dataSprzedazy) {
        this.dataSprzedazy = dataSprzedazy;
    }

    public LocalDate getDataZaplaty() {
        return dataZaplaty;
    }

    public void setDataZaplaty(LocalDate dataZaplaty) {
        this.dataZaplaty = dataZaplaty;
    }

    public Klient getClient() {
        return client;
    }

    public void setClient(Klient client) {
        this.client = client;
    }

    public List<Produkt> getListaProduktow() {
        return listaProduktow;
    }
    public void dodajProdukt(Produkt produkt){
        listaProduktow.add(produkt);
    }
    public void usunProdukt(Produkt produkt){
        listaProduktow.remove(produkt);
    }

}
