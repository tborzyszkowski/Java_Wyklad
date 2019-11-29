
import java.util.Date;

public class Faktura {
    private int nr_faktury = 10000;
    private String wystawienie;
    private String zaplata;
    private String sprzedaz;
    private Klient klient;
    private Produkty[] produkty;


    public Faktura(Klient klient, String wystawienie, String zaplata, String sprzedaz, Produkty...produkty) {
        this.klient = klient;
        this.wystawienie = wystawienie;
        this.zaplata = zaplata;
        this.sprzedaz = sprzedaz;
        this.nr_faktury++;
        this.produkty = produkty;
    }

    public Faktura(Klient klient, Produkty...produkty) {
        this(klient, new Date().toString(), new Date(System.currentTimeMillis()-24*60*60*1000).toString(),
                new Date(System.currentTimeMillis()-48*60*60*1000).toString(), nr_faktury++, produkty);

    }

    public void setNowyNrFaktury(int n) {
        this.nr_faktury = n;
    }

    public int getNr_faktury() {
        return nr_faktury;
    }

    public String getWystawienie() {
        return wystawienie;
    }

    public String getSprzedaz() {
        return sprzedaz;
    }

    public String getZaplata() {
        return zaplata;
    }

    public void setSprzedaz(String sprzedaz) {
        this.sprzedaz = sprzedaz;
    }

    public void setZaplata(String zaplata) {
        this.zaplata = zaplata;
    }

    public void setWystawienie(String wystawienie) {
        this.wystawienie = wystawienie;
    }
}
