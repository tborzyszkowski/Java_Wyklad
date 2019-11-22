package fvat;
public class pozycja {
    private String nazwa;
    private int ilosc;
    private double j_netto;
    private double podatek;
    private double p_netto;
    private double brutto;

    public pozycja(String nazwa, int ilosc, double netto, double podatek) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.j_netto = netto;
        this.podatek = podatek;
        this.p_netto = this.ilosc * this.j_netto;
        this.brutto = this. p_netto * this.podatek;
    }

    public pozycja() {
        this.nazwa = "Telewizor";
        this.ilosc = 5;
        this.j_netto = 1200.99;
        this.podatek = 1.23;
        this.p_netto = this.ilosc * this.j_netto;
        this.brutto = this. p_netto * this.podatek;
    }

    public pozycja(String nazwa, int ilosc, double netto) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.j_netto = netto;
        this.podatek = 1.23;
        this.p_netto = this.ilosc * this.j_netto;
        this.brutto = this. p_netto * this.podatek;
    }

    public String get_Nazwa() { return nazwa;}

    public double get_netto(){
        return p_netto;
    }

    public double get_brutto(){ return brutto; }

    public int get_ilosc(){ return ilosc; }

    public double get_podatek(){ return podatek; }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
        this.p_netto = this.ilosc * this.j_netto;
        this.brutto = this. p_netto * this.podatek;
    }

    public void setJ_netto(double j_netto) {
        this.j_netto = j_netto;
        this.p_netto = this.ilosc * this.j_netto;
        this.brutto = this. p_netto * this.podatek;
    }

    public void setPodatek(double podatek) {
        this.podatek = podatek;
        this.brutto = this. p_netto * this.podatek;
    }
}
