package faktura;

public  class Kupujacy {
    private String imie;
    private String nazwisko;
    private String nazwa_firmy;
    private String adres;
    private String nip;


    public Kupujacy(String imie, String nazwisko, String nazwa_firmy, String adres, String nip){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwa_firmy = nazwa_firmy;
        this.adres = adres;
        this.nip = nip;
    }


    String getImie() {
        return imie;
    }
    void setImie(String imie) {
        this.imie = imie;
    }
    String getNazwisko() {
        return nazwisko;
    }
    void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    String getNazwa_firmy() {
        return nazwa_firmy;
    }
    void setNazwa_firmy(String n_f) {
        this.nazwa_firmy = n_f;
    }
    String getAdres() {
        return adres;
    }
    void setAdres(String adres) {
        this.adres = adres;
    }
    String getNip() {
        return nip;
    }
    void setNip(String nip) {
        this.nip = nip;
    }
    public String toString(){
        return "Imię: " + getImie() + "\n" +"Nazwisko: " + getNazwisko() + "\n"
                +"Nazwa firmy: " + getNazwa_firmy() +
                "\n"+ "Adres: " + getAdres() + "\n" + "NIP: " + getNip() + "\n";
    }
}
