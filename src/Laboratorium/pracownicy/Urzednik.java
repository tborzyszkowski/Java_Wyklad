package Laboratorium.pracownicy;

public class Urzednik extends Pracownik{
    public Urzednik(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    boolean validNazwisko(String nazwisko) {
        return false;
    }

    @Override
    int wartosc() {
        return -1;
    }
}
