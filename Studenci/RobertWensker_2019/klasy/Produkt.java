public class Produkt {
    private String name;
    private int quantity;
    private double nPrice;
    public Produkt(String name, int quantity, double nPrice){
        setName(name);
        setQuantity(quantity);
        setnPrice(nPrice);
    }

    public String getName() {
        return name;
    }

    public double getnPrice() {
        return nPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setnPrice(double nPrice) {
        this.nPrice = nPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
