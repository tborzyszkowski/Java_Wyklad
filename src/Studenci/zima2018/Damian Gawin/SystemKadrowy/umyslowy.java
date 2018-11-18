package SystemKadrowy;

public class umyslowy extends pracownik {
    private int pensja;
    private double premia;
    private int telefon;
//    private String kierownik;
    private int pokoj;

    umyslowy(String imie, String nazwisko, int dataur, int pensja, double premia, int telefon, int pokoj)
    {
        super(imie, nazwisko, dataur);
        this.pensja = pensja;
        this.premia = premia;
        this.telefon = telefon;
//        this.kierownik = kierownik;
        this.pokoj = pokoj;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

//    public String getKierownik() {
//        return kierownik;
//    }
//
//    public void setKierownik(String kierownik) {
//        this.kierownik = kierownik;
//    }

    public int getPokoj() {
        return pokoj;
    }

    public void setPokoj(int pokoj) {
        this.pokoj = pokoj;
    }

    String opis()
    {
        return  super.nazwa() +
                "\n"+"\t"+"Pracownik Umysłowy: " +
                "pensja= " + pensja +
                ", premia= " + premia +
                ", telefon= " + telefon +
//                ", kierownik= '" + kierownik + '\'' +
                ", pokoj= '" + pokoj + '\'' +
                ".";
    }

    public double wynagrodzenie()
    {
        return (pensja + (premia * pensja));
    }
}
