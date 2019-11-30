public class Product implements Comparable<Product> {

    private String code;
    private String name;
    private double price;
    private double discountPrice;

    public Product() {};

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
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

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addDiscount(int discount) {
        this.discountPrice = this.price - ((double) discount / 100) * this.price;
        setPrice(this.discountPrice);
    }

    @Override
    public int compareTo(Product produkt) {
        if (this.price > produkt.price) return 1;
        else if (this.price < produkt.price) return -1;
        else {
            return this.getName().compareTo(produkt.getName());
        }
    }

    @Override
    public String toString() {
        return "Produkt {" +
                "kod = '" + this.code + '\'' +
                ", nazwa = '" + this.name + '\'' +
                ", cena = '" + this.price + " zł\'" +
                '}';
    }
}
