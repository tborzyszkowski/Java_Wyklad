package fvat;

public class sprzedajacy {
    private String nazwa_firmy;
    private String adres;
    private String NIP;
    private String nr_konta;

    public sprzedajacy(){
        nazwa_firmy = "TELPOL";
        adres = "ul.Nosala 84, Warszawa";
        NIP = "6574534670";
        nr_konta = "77884337846";
    }

    public sprzedajacy(String nazwa_firmy, String adres, String NIP, String nr_konta){
        this.nazwa_firmy = nazwa_firmy;
        this.adres = adres;
        this.NIP = NIP;
        this.nr_konta = nr_konta;
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

    public String getNr_konta() {
        return nr_konta;
    }
}
