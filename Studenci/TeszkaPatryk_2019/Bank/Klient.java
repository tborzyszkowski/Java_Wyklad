
public class Klient {
    private String imie_nazwisko;
    private String nr_bank;

    public Klient(String imie_nazwisko, String nr_bank) {
        this.imie_nazwisko = imie_nazwisko;
        this.nr_bank = nr_bank;
    }

    public String getNr_bank() {
        return nr_bank;
    }
    public String getImie_nazwisko() {
        return imie_nazwisko;
    }
}
