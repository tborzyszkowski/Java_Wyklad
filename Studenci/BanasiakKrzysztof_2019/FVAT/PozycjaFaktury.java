package faktura;

public class PozycjaFaktury {
    private String nazwa;
    private int ilosc;
    private double cena_j_netto;
    private double cena_netto;
    private double podatekVAT;
    private double cena_brutto;

    PozycjaFaktury(String n, int ile, double c_j_netto, double VAT) {
        nazwa = n;
        ilosc = ile;
        cena_j_netto = c_j_netto;
        cena_netto = ilosc * cena_j_netto;
        podatekVAT = VAT;
        cena_brutto = cena_netto +cena_netto*(podatekVAT/100);
    }

    String getNazwa() {
        return nazwa;
    }

    void setNazwa(String n) {
        this.nazwa = n;
    }

    double getIlosc() {
        return ilosc;
    }

    void setIlosc(int ile) {
        this.ilosc = ile;
    }

    double getCena_j_netto() {
        return cena_j_netto;
    }

    void setCena_j_netto(double n_c_j) {
        this.cena_j_netto = n_c_j;
        this.cena_netto = ilosc * cena_j_netto;
        this.cena_brutto = cena_netto * (1 + podatekVAT / 100);
    }

    double getCena_netto() {
        return cena_netto;
    }

    void setCena_netto(double n_c) {
        this.cena_netto = n_c;
    }

    double getPodatekVAT() {
        return podatekVAT;
    }

    void setPodatekVAT(double vat) {
        this.podatekVAT = vat;
    }

    double getCena_brutto() {
        return cena_brutto;
    }

    void setCena_brutto(double n_c_b) {
        this.cena_brutto = n_c_b;
    }

    public String toString() {
        return " " + getNazwa() + " : " + getIlosc()+ " szt\n" + " 1 szt netto= " +
                getCena_j_netto() + "\n VAT=" + getPodatekVAT()+" %"+ "\n cena całościowa brutto= "+ getCena_brutto();

    }
}



