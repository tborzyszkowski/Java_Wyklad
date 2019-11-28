
public class Sprzedający {
    private String nazwa_firmy;
    private String nip;
    private String adres;
    private String nr_konta;



    public Sprzedający(String nazwa_firmy, String nip, String adres, String nr_konta) {
        this.nazwa_firmy = nazwa_firmy;
        this.nip = nip;
        this.adres = adres;
        this.nr_konta = nr_konta;
    }

    public Sprzedający(Sprzedający sprzedający) {this(sprzedający.nazwa_firmy, sprzedający.nip, sprzedający.adres, sprzedający.nr_konta);}

    public Sprzedający() {
        this.nazwa_firmy =  "Firemka";
        this.nip = "8951253";
        this.adres = "Gdańsk, Budowlancow 555/0";
        this.nr_konta = "2249000054526807771493031";
    }

    public String getNr_konta() {
        return nr_konta;
    }

}
