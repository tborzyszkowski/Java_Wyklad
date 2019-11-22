import java.time.LocalDate;
import java.util.ArrayList;

public class Faktura {

    private static int indeks = 0;
    private double suma;
    private int numerFaktury;
    private ArrayList<Produkt> listaProduktow;
    private LocalDate dataWystawienia;
    private LocalDate dataSprzedazy;
    private LocalDate dataZaplaty;
    private Klient klient;


    public Faktura(Klient klient) {
        this.klient = klient;
        this.listaProduktow = new ArrayList<>();
        this.numerFaktury = indeks;
        this.dataWystawienia = LocalDate.now();
        indeks++;
    }


    public ArrayList<Produkt> getListaProduktow() {
        return listaProduktow;
    }

    public void dodajProdukt(Produkt produkt) {
        this.listaProduktow.add(produkt);
    }

    public void usunProdukt(Produkt produkt) {
        this.listaProduktow.remove(produkt);
    }

    public Produkt getProdukt(Produkt produkt) {
        int i = this.listaProduktow.indexOf(produkt);
        return this.listaProduktow.get(i);
    }

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
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

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public double getSuma() {
        for (Produkt produkt : this.listaProduktow) {
            this.suma += produkt.getCenaBrutto();
        }
        return this.suma;
    }
}
