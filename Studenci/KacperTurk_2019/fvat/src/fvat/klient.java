package fvat;
public class klient {
    private String nazwa_firmy;
    private String adres;
    private String NIP;

    public klient(){
        nazwa_firmy = "WOJNOJ";
        adres = "ul.Gorali 22, Gdansk";
        NIP = "4174594677";
    }

    public klient(String nazwa_firmy, String adres, String NIP, String nr_konta){
        this.nazwa_firmy = nazwa_firmy;
        this.adres = adres;
        this.NIP = NIP;
    }

    public String getNazwa_firmy() {
        return nazwa_firmy;
    }

    public String getAdres() {
        return adres;
    }

    public String getNIP() {
        return NIP;
    }
}
