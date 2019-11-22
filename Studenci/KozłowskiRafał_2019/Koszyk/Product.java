public class Product {
    private int productCode;
    private String productName;
    private double productPrice;
    private double productDiscPrice;

    Product(int productCode, String productName, double productPrice){
        this.productCode=productCode;
        this.productName=productName;
        this.productPrice=productPrice;
        this.productDiscPrice=productPrice;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductDiscPrice() {
        return productDiscPrice;
    }

    public void setProductDiscPrice(double productDiscPrice) {
        this.productDiscPrice = productDiscPrice;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String toString(){
        return "Kod produktu: " + productCode +
                "\n\tNazwa produktu: " + productName +
                "\n\tCena produktu: " + productPrice +
                "\n\tCena po rabacie: " + String.format("%.2f",productDiscPrice) + "\n";
    }

}
