package Laboratorium.pracownicy;

public class Robotnik extends Pracownik{

    public Robotnik(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    boolean validNazwisko(String nazwisko) {
        return true;
    }

    @Override
    int wartosc() {
        return 1;
    }
}
