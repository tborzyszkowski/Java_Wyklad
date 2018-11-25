package JavaMarkt.Modele;

public class Product {
    private String productName;
    private double productNettoPrice;
    private double productVat;

    public Product(String productName, double productNettoPrice, double productVat){
        this.productName = productName;
        this.productNettoPrice = productNettoPrice;
        this.productVat = productVat;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductNettoPrice() {
        return productNettoPrice;
    }

    public void setProductNettoPrice(double productNettoPrice) {
        this.productNettoPrice = productNettoPrice;
    }

    public double getProductVat() {
        return productVat;
    }

    public void setProductVat(double productVat) {
        this.productVat = productVat;
    }

    @Override
    public String toString() {
        return productName + "\n";
    }
}
