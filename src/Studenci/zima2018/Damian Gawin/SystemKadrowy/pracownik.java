package SystemKadrowy;

public class pracownik {
    private String imie;
    private String nazwisko;
    private int dataur;

    pracownik(String imie, String nazwisko, int dataur)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataur = dataur;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    String getImie() {
        return imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    String getNazwisko() {
        return nazwisko;
    }

    public void setDataur(int dataur) {
        this.dataur = dataur;
    }

    int getDataur() {
        return dataur;
    }

    public String nazwa()
    {
        return "\n Pracownik " +
                "Imię= '" + imie + '\'' +
                ", Nazwisko= '" + nazwisko + '\'' +
                ", Data urodzenia= " + dataur +
                ' ';
    }
}
