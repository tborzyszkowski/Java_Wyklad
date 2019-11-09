package fvat;

public class PozycjaFaktury {
    String nazwaPoz;
    int ilosc;
    double cenaNetto;
    double ceneNettoPoz;
    double podatekVat;
    double cenaBrutto;

    PozycjaFaktury(String nazw, int il, double netto, double pod){
        nazwaPoz = nazw;
        ilosc = il;
        cenaNetto = netto;
        ceneNettoPoz = ilosc * cenaNetto;
        podatekVat = pod;
        cenaBrutto = cenaNetto * (podatekVat/100.0 + 1.0) * ilosc;
    }

    double wartoscPoz(){
        return cenaBrutto;
    }

    String getNazwaPoz(){
        return this.nazwaPoz;
    }

    int getIlosc(){
        return this.ilosc;
    }

    double getCenaNetto(){
        return cenaNetto;
    }

    double getCeneNettoPoz(){
        return ceneNettoPoz;
    }

    double getPodatekVat(){
        return podatekVat;
    }

    double getCenaBrutto(){
        return cenaBrutto;
    }
}
