package fvat;

public class Firma {
    String nazwa;
    String adres;
    int nrNIP;
    static String nrKontaSprzedawcy="59 2331 4352 5436 3234 34";

    Firma(String nzw, String adr, int NIP){
        nazwa = nzw;
        adres = adr;
        nrNIP = NIP;
    }
    String getNazwa(){
        return this.nazwa;
    }

    String getAdres(){
        return this.adres;
    }

    int getNrNIP(){
        return nrNIP;
    }
}
