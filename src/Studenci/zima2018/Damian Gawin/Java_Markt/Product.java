package Market;
import java.util.Comparator;

public class Product {
    public String name;
    private double price;
    private double discountPrice;

    public Product() {}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return name + '\t' +
                "price=" + price + '\t' + "discountprice=" + discountPrice + '\n';
    }

    public static Comparator<Product> PriceComparator = new Comparator<Product>() {
        public int compare(Product p1, Product p2) {
            return Double.valueOf(p2.getPrice()).compareTo(Double.valueOf(p1.getPrice()));
        }
    };
    public static Comparator<Product> NameComparator = new Comparator<Product>() {
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    };
}
