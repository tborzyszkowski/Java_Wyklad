package Zamówienie;

public class Product {

    private String name;
    private int count;
    private double netto;
    private double nettoPosition;
    private final double vat = 1.23;
    private double bruttoPosition;

    public Product(String name, int count, double netto) {
        this.name = name;
        this.count = count;
        this.netto = netto;
//        this.nettoPosition = countNettoPosition(this.count, this.netto);
//        this.bruttoPosition = countBruttoPosition(this.nettoPosition, vat);
    }

    public double getBruttoPosition() {
        return bruttoPosition;
    }

    public double getNettoPosition() {
        return nettoPosition;
    }

    public int getCount() {
        return count;
    }

    public double getNetto() {
        return netto;
    }

    public double getVat() {
        return vat;
    }

    public double countNettoPosition(double count, double netto) {
        if (count == 0) {
            throw new IllegalArgumentException();
        } else {
            this.nettoPosition = count * netto;
        }
        return this.nettoPosition;
    }

    public double countBruttoPosition(double nettoPosition, double vat) {
        if (nettoPosition == 0) {
            throw new IllegalArgumentException();
        } else {
            this.bruttoPosition = nettoPosition * vat;
        }
        return this.bruttoPosition;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", netto=" + netto +
                ", nettoPosition=" + nettoPosition +
                ", bruttoPosition=" + bruttoPosition +
                '}';
    }
}
