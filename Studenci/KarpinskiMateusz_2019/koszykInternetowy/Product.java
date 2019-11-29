package koszykInternetowy;

public class Product implements Comparable<Product> {
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public int compareTo(Product o) {
        int cmp = -Double.compare(price, o.getPrice());
        if (cmp == 0) cmp = name.compareTo(o.getName());
        return cmp;
    }

    @Override
    public String toString() {
        return  "code: " + code +
                ", name: " + name +
                ", price: " + price +
                ", discountPrice: " + discountPrice;
    }
}
