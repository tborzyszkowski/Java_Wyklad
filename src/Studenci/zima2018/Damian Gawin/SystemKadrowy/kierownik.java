package SystemKadrowy;

public class kierownik extends umyslowy {
    private int dodatek;
    private int telefonkom;
    private String dzial;

    kierownik(String imie, String nazwisko, int dataur, int pensja, double premia,int dodatek, int telefon, int telefonkom, int pokoj, String dzial)
    {
        super(imie, nazwisko, dataur, pensja, premia, telefon, pokoj);
        this.dodatek = dodatek;
        this.telefonkom = telefonkom;
        this.dzial = dzial;
    }

    public double getDodatek() {
        return dodatek;
    }

    public void setDodatek(int dodatek) {
        this.dodatek = dodatek;
    }

    public int getTelefonkom() {
        return telefonkom;
    }

    public void setTelefonkom(int telefonkom) {
        this.telefonkom = telefonkom;
    }

    public String getDzial() {
        return dzial;
    }

    public void setDzial(String dzial) {
        this.dzial = dzial;
    }

    public String opis()
    {
        return super.opis() +
                "\n\tKierownik: " +
                "dodatek= " + dodatek +
                ", telefonkom= " + telefonkom +
                ", dział= '" + dzial + '\'' +
                ".\n";
    }

    public double wynagrodzenie()
    {
        return super.wynagrodzenie() + dodatek;
    }
}
