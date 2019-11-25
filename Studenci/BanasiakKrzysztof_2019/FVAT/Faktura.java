package faktura;

import java.util.*;

public class Faktura {
    private String data_transakcji;
    private String data_zaplaty;
    private String data_wystawienia;
    private faktura.Kupujacy Sprzedajacy;
    private faktura.Kupujacy Kupujacy;
    private List<PozycjaFaktury> wykaz = new ArrayList<>();
    static int l_faktur = 0;
    private int nr_Faktury;


    Faktura(faktura.Kupujacy Sprze, faktura.Kupujacy Kup, String data_tra, String data_zap, String data_wys) {
        nr_Faktury = ++l_faktur;
        Sprzedajacy = Sprze;
        Kupujacy = Kup;
        data_transakcji = data_tra;
        data_zaplaty = data_zap;
        data_wystawienia = data_wys;
    }

    String getData_transakcji() {
        return this.data_transakcji;
    }

    String getData_zaplaty() {
        return this.data_zaplaty;
    }

    String getDataWystawienia() {
        return this.data_wystawienia;
    }

    void dodajArtykul(PozycjaFaktury a) {
        wykaz.add(a);
    }

    public String listartykulow() {
        String artykuly = "";
        for (PozycjaFaktury pozycjaFaktury : wykaz) {
            artykuly += "\n" + pozycjaFaktury.toString();
        }
        return artykuly;
    }

    double cena_koncowa() {
        double wartosc_cal_brutto = 0;
        for (PozycjaFaktury pozycjaFaktury : wykaz) {
            wartosc_cal_brutto += pozycjaFaktury.getCena_brutto();
        }
        return wartosc_cal_brutto;
    }

    int getNr_Faktury() {
        return this.nr_Faktury;
    }

    public String toString() {

        return "Faktura nr:" + getNr_Faktury() + "\nSprzedajacy:" + Sprzedajacy.toString() + "\nKupujący:" + Kupujacy.toString() +
                "\nData transakcji:" + getData_transakcji() + "\nData zaplaty:" + getData_zaplaty() +
                "\nData wystaw:" + getDataWystawienia() + "\n" + listartykulow() + "\n całkowita wartość faktury: " + cena_koncowa() + " zł";
    }
}
