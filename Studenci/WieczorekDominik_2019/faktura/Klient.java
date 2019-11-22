import java.util.Objects;

public class Klient {

    private String nazwaFirmy;
    private String adres;
    private String NIP;
    private String numerKonta;

    public Klient(String nazwaFirmy, String adres, String NIP, String numerKonta) {
        this.nazwaFirmy = nazwaFirmy;
        this.adres = adres;
        this.NIP = NIP;
        this.numerKonta = numerKonta;
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

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaFirmy, adres, NIP, numerKonta);
    }

    @Override
    public boolean equals(Object obj) {
     if (obj instanceof Klient) {
         Klient klient = (Klient) obj;
         return nazwaFirmy.equals(klient.nazwaFirmy) &&
                 adres.equals(klient.adres) &&
                 NIP.equals(klient.NIP) &&
                 numerKonta.equals(klient.numerKonta);
     }
     return false;
    }
}
