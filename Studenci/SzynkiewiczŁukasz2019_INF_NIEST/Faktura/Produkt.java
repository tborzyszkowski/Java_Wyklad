public class Produkt {

    private String nazwa;
    private double cenaNetto;
    private int stawkaVat;

    public Produkt() {
        this("brak nazwy", 0, 0);
    }

    public Produkt(String nazwa, double cenaNetto, int stawkaVat) {
        this.nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.stawkaVat = stawkaVat;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public int getStawkaVat() {
        return stawkaVat;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public void setStawkaVat(int stawkaVat) {
        this.stawkaVat = stawkaVat;
    }

    public double countCenaBrutto () {
        return this.cenaNetto + ((double) this.stawkaVat / 100) * this.cenaNetto;
    }

    @Override
    public String toString() {
        return this.nazwa + " | " + String.format("%.2f", this.cenaNetto) + " | " + this.stawkaVat + "%";
    }
}
