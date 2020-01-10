import java.util.*;

public class Faktura {
    int numer;
    String dataSprz;
    String dataKup;
    String dataFak;
    Osoba kupiec;
    Osoba sprzedawca;
    List<Pozycja> pozycje = new ArrayList<>();

    int i = 0;
    double suma = 0;

    public Faktura(){}

    public Faktura(String dataSprz, String dataKup, String dataFak, Osoba kupiec, Osoba sprzedawca){
        numer = ++i;
        this.dataSprz = dataSprz;
        this.dataKup = dataKup;
        this.dataFak = dataFak;
        this.kupiec = kupiec;
        this.sprzedawca = sprzedawca;
    }

    void KolejnyProdukt(Pozycja pozycja){
        pozycje.add(pozycja);
        suma = suma + pozycja.brutto;
    }



}
