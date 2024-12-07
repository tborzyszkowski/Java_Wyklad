package Laboratorium.pracownicy;

public abstract class Pracownik {
    private String imie;
    private String nazwisko;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (this.validNazwisko(this.nazwisko))
            this.nazwisko = nazwisko;
    }

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.setNazwisko(nazwisko);
    }

    abstract boolean validNazwisko(String nazwisko);

    abstract int wartosc();

}
