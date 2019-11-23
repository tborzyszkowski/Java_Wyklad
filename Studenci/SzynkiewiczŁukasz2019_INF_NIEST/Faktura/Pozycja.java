public class Pozycja {

    private Produkt produkt;
    private int ilosc;

    public Pozycja(Produkt produkt, int ilosc) {
        this.produkt = produkt;
        this.ilosc = ilosc;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public double countCenaPozycjiNetto() {
        return this.produkt.getCenaNetto() * this.ilosc;
    }

    public double countCenaPozycjiBrutto() {
        return this.produkt.countCenaBrutto() * this.ilosc;
    }

    @Override
    public String toString() {
        return this.produkt.toString() + " | " + this.ilosc + " | "
                + String.format("%.2f", countCenaPozycjiNetto()) + " | "
                + String.format("%.2f", countCenaPozycjiBrutto());
    }
}
