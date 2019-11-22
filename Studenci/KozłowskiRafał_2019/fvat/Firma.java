package fvat;
public class Firma {
    private String nazwa;
    private String adres;
    private int nrNIP;
    private static String nrKontaSprzedawcy="59 2331 4352 5436 3234 34";

    Firma(String nzw, String adr, int NIP){
        nazwa = nzw;
        adres = adr;
        nrNIP = NIP;
    }

    public String toString(){ return nazwa + ", " + adres + " , NIP: " + nrNIP; }
    String getNazwa(){
        return this.nazwa;
    }

    String getAdres(){
        return this.adres;
    }

    String getNrKontaSprzedawcy(){ return nrKontaSprzedawcy; }

    int getNrNIP(){
        return nrNIP;
    }
}
