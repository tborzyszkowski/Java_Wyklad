package fvat;

public class PozycjaFaktury {
    private String nazwa;
    private int ilosc;
    private double cenaNetto;

    public PozycjaFaktury(String nazwa, int ilosc, double cenaNetto) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.cenaNetto = cenaNetto;
    }

    public String getNazwa() { return nazwa;}

    public int getIlosc() { return ilosc;}

    public double getCenaNetto() { return cenaNetto;}

    public double cenaNettoPoz() {
        return cenaNetto*ilosc;
    }

    public double podatek() {
        return cenaNettoPoz() * 0.23;
    }

    public double cenaBrutto() {
        return cenaNettoPoz() + podatek();
    }

    @Override
    public String toString(){
        return "Nazwa pozycji: " + nazwa + '\t' +
                "Ilosc: " + ilosc + '\t' +
                "Cena jednostkowa netto " + cenaNetto + '\t' +
                "Cena netto pozycji: " + cenaNettoPoz() + '\t' +
                "Podatek VAT: " + podatek() + '\t' +
                "Cena brutto: " + cenaBrutto() + '\n';
    }

}
