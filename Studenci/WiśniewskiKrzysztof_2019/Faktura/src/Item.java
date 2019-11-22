public class Item {
    private String name;
    private int quantity;
    private double unit_price;
    private double net_price;
    private double VAT;
    private double gross_price;

    public Item(String name, int quantity, double unit_price, double VAT ) {
        this.name = name;
        this.quantity = quantity;
        this.unit_price = unit_price;
        this.VAT = VAT;
        this.net_price = this.unit_price * this.quantity;
        this.gross_price = this.net_price * (1+this.VAT);
    }

    public Item() {
    }
    

    public double getGross_price() {
        return gross_price;
    }
    

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }


    public double getNet_price() {
        return net_price;
    }
    

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
