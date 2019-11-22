package FVAT;

public class Pozycja {
    private String nazwa;
    private int ilosc;
    private double cena;
    private double wartoscNetto;
    private double podatek;
    private double wartoscBrutto;

    Pozycja(String nazwa, int ilosc, double cena, double podatek){
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.cena = cena;
        this.wartoscNetto = ilosc * cena;
        this.podatek = podatek;
        this.wartoscBrutto = this.wartoscNetto * (1+podatek);
    }

    public String getNazwa(){
        return this.nazwa;
    }

    public int getIlosc(){
        return this.ilosc;
    }

    public double getCena() {
        return cena;
    }

    public double getNetto() {
        return wartoscNetto;
    }

    public double getPodatek() {
        return podatek;
    }

    public double getBrutto() {
        return wartoscBrutto;
    }

    public void wypiszPozycje(){
        System.out.println(String.format("%15s", this.getNazwa()) + " | " +
                String.format("%3d", this.getIlosc()) + " | " +
                String.format("%6.2f", this.getCena()) + " | " +
                String.format("%6.2f", this.getNetto()) + " | " +
                String.format("%2d", (int)(this.getPodatek()*100)) + " | " +
                String.format("%.2f", this.getBrutto())+" zł");
    }
}
