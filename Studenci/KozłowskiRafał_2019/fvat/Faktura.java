package fvat;

import java.util.*;
public class Faktura {
    List<PozycjaFaktury> lista = new ArrayList<>();
    private int numerFaktury;
    static int ostNumerFaktury = 0;
    private String datSp;
    private String datZp;
    private double wartoscFv;
    private String datWyst;
    private Firma sprzedajacy;
    private Firma kupujacy;

    Faktura(Firma sprzed, Firma kupuj, String datS, String datZ, String datW){
        numerFaktury = ++ostNumerFaktury;
        sprzedajacy = sprzed;
        kupujacy = kupuj;
        datSp = datS;
        datZp = datZ;
        datWyst = datW;
    }

    int getNumerFaktury(){
        return this.numerFaktury;
    }
    String getDatSp(){
        return this.datSp;
    }

    String getDatZp(){
        return this.datZp;
    }

    double getWartoscFv(){
        return this.wartoscFv;
    }

    String getDatWyst(){
        return this.datWyst;
    }

    Firma getSprzedajacy(){
        return this.sprzedajacy;
    }

    Firma getKupujacy(){
        return this.kupujacy;
    }

    void dodajPozycje(PozycjaFaktury poz){
        lista.add(poz);
        wartoscFv += poz.wartoscPoz();
    }

    double zwrocWartosc(){
        double sum = 0;
        for(int i=0; i < lista.size(); i++){
            sum += lista.get(i).wartoscPoz();
        }
        return sum;
    }

    public String toString(){

        return    "Faktura nr:   " + numerFaktury +
                "\nSprzedajacy:  " + sprzedajacy.toString() +
                "\nKupujący:     " + kupujacy.toString() +
                "\nData sprzed:  " + datSp +
                "\nData zaplaty: " + datZp +
                "\nData wystaw:  " + datWyst +
                pozycjeFaktury();
    }

    public String pozycjeFaktury(){
        String pozycje = new String();
        for (int i=0; i < lista.size(); i++) {
            pozycje += lista.get(i).toString();
        }
        return pozycje;
    }

    public static void main(String[] args){
        Firma dpd = new Firma("DPD", "Gdansk", 55236367);
        Firma fedex = new Firma("FedEx", "Londyn", 5635345);
        PozycjaFaktury lp1 = new PozycjaFaktury("Maszynka", 1, 30.25, 23);
        PozycjaFaktury lp2 = new PozycjaFaktury("Wiertlo", 3, 15.49, 23);
        Faktura pierwsza = new Faktura(dpd, fedex, "dzis", "jutro", "pojutrze");
        pierwsza.dodajPozycje(lp1);
        pierwsza.dodajPozycje(lp2);
        System.out.println(pierwsza.toString());
    }

}