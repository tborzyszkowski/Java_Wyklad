package JavaMarkt;

public class Product {
    private String code;
    private String name;
    private double priceNetto;
    private double discountPrice;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceNetto() {
        return priceNetto;
    }

    public void setPriceNetto(double priceNetto) {
        this.priceNetto = priceNetto;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }


    public Product(String code, String name, double priceNetto) {
        this.code = code;
        this.name = name;
        this.priceNetto = priceNetto;
        this.discountPrice = this.priceNetto;
    }

    @Override
    public String toString() {
        return code + '\t'
                + name + '\t' +
                + priceNetto + '\t' +
                + discountPrice + '\n';
    }

}