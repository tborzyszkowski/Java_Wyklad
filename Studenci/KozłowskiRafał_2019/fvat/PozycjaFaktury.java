package fvat;
import java.lang.Math.*;
public class PozycjaFaktury {
    String nazwaPoz;
    private int ilosc;
    private double cenaNetto;
    private double cenaNettoPoz;
    private double podatekVat;
    private double cenaBrutto;

    PozycjaFaktury(String nazw, int il, double netto, double pod){
        nazwaPoz = nazw;
        ilosc = il;
        cenaNetto = netto;
        cenaNettoPoz = ilosc * cenaNetto;
        podatekVat = pod;
        cenaBrutto = cenaNetto * (podatekVat/100.0 + 1.0) * ilosc;
    }

    double wartoscPoz(){
        return cenaBrutto;
    }

    String getNazwaPoz(){
        return this.nazwaPoz;
    }

    public String toString(){
        return "\n\t" + nazwaPoz + " " + ilosc + " szt. " + String.format("%.2f", cenaBrutto);
    }

    int getIlosc(){
        return this.ilosc;
    }

    double getCenaNetto(){
        return cenaNetto;
    }

    double getCenaNettoPoz(){
        return cenaNettoPoz;
    }

    double getPodatekVat(){
        return podatekVat;
    }

    double getCenaBrutto(){
        return cenaBrutto;
    }
}
