package faktura;

public class Klient {
    private String nazwaFirmy;
    private String adres;
    private int numerNIP;
    private int konto;

    public Klient(String nazwaFirmy, String adres, int numerNIP, int konto) {
        this.nazwaFirmy = nazwaFirmy;
        this.adres = adres;
        this.numerNIP = numerNIP;
        this.konto = konto;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getNumerNIP() {
        return numerNIP;
    }

    public void setNumerNIP(int numerNIP) {
        this.numerNIP = numerNIP;
    }

    public int getKonto() {
        return konto;
    }

    public void setKonto(int konto) {
        this.konto = konto;
    }
}
