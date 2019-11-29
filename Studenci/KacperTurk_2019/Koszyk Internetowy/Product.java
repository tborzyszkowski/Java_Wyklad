
public class Product {
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    public Product() {
        valuesSetter("HH34J7","Torebka",79.99);
    }

    public Product(String code, String name, double price) {
        valuesSetter(code,name,price);
    }

    public void valuesSetter(String code, String name, double price){
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }
}
