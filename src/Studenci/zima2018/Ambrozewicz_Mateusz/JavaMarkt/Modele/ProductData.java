package JavaMarkt.Modele;

public class ProductData {
    private Product product;
    private double price;
    private double vat;
    private int quantum;

    public ProductData(Product product, int quantum){
        this.product = product;
        this.price = product.getProductNettoPrice();
        this.vat = product.getProductVat();
        this.quantum = quantum;
    }

    public String getName(){
        return product.getProductName();
    }

    public double getProductBruttoPrice(){
        double bruttoPrice = price + price*vat/100;
        return bruttoPrice;
    }

    public double getTotalBruttoPrice(){
        double totalBruttoPrice = getProductBruttoPrice()*quantum;
        return totalBruttoPrice;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    @Override
    public String toString() {
        return "\n" +
                "Nazwa: " + product + " " +
                "Cena netto: " + price + " " +
                "VAT: " + vat + " " +
                "Ilość: " + quantum + " " +
                "Cena brutto jednostkowa: " + getProductBruttoPrice()+ " " +
                "Suma brutto: " + getTotalBruttoPrice();
    }


}
