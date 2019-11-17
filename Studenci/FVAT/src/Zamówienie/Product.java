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
        this.nettoPosition = this.count * this.netto;
        this.bruttoPosition = this.nettoPosition * vat;
    }

    public double getNettoPosition() {
        return nettoPosition;
    }

    public double getBrutto() {
        return bruttoPosition;
    }

    public double getBruttoPosition() {
        return bruttoPosition;
    }

}
