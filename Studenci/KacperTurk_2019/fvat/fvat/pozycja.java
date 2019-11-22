package fvat;
public class pozycja {
    private String nazwa;
    private int ilosc;
    private double j_netto;
    private double podatek;
    private double p_netto;
    private double brutto;

    public pozycja(String nazwa, int ilosc, double netto, double podatek) {
        setStart(nazwa,ilosc,netto,podatek);
        setValues();
    }

    public pozycja() {
        setStart("Telewizor",5,1200.99,1.23);
        setValues();
    }

    public pozycja(String nazwa, int ilosc, double netto) {
        setStart(nazwa,ilosc,netto,1.23);
        setValues();
    }

    private void setStart(String nazwa, int ilosc, double netto, double podatek){
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.j_netto = netto;
        this.podatek = podatek;
    }


    private void setValues(){
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
        setValues();
    }

    public void setJ_netto(double j_netto) {
        this.j_netto = j_netto;
        setValues();
    }

    public void setPodatek(double podatek) {
        this.podatek = podatek;
        this.brutto = this. p_netto * this.podatek;
    }
}
