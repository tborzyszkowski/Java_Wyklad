public class Produkt {

    private String nazwaProduktu;
    private int iloscTowaru;
    private double cenaSztuki;
    private double cenaNetto;
    private double VAT;
    private double cenaBrutto;

    public Produkt(String nazwaProduktu, int iloscTowaru, double cenaSztuki, double VAT) {
        this.nazwaProduktu = nazwaProduktu;
        this.iloscTowaru = iloscTowaru;
        this.cenaSztuki = cenaSztuki;
        this.cenaNetto = this.cenaSztuki * this.iloscTowaru;
        this.VAT = VAT;
        this.cenaBrutto = this.cenaNetto * VAT;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public int getIloscTowaru() {
        return iloscTowaru;
    }

    public void setIloscTowaru(int iloscTowaru) {
        this.iloscTowaru = iloscTowaru;
    }

    public double getCenaSztuki() {
        return cenaSztuki;
    }

    public void setCenaSztuki(double cenaSztuki) {
        this.cenaSztuki = cenaSztuki;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double netto) {
        this.cenaNetto = netto;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public double getCenaBrutto() {
        return cenaBrutto;
    }

    public void setCenaBrutto(double cenaBrutto) {
        this.cenaBrutto = cenaBrutto;
    }
}
