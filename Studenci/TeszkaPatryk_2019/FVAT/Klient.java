public class Klient {
    private String nazwa_firmy;
    private String nip;
    private String adres;


    public Klient(String nazwa_firmy, String nip, String adres) {
        this.nazwa_firmy = nazwa_firmy;
        this.nip = nip;
        this.adres = adres;
    }

    public Klient(Klient klient) {this(klient.nazwa_firmy, klient.nip, klient.adres);}

    public Klient() {
        this.nazwa_firmy =  "JakasFirma";
        this.nip = "4325453";
        this.adres = "Gdańsk, Partyzantow 555/0";
    }

    public String getNip() {
        return nip;
    }

}
