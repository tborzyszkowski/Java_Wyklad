import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ProductComparator implements Comparator<Product> {

    public int compare(Product product1, Product product2) {
        if(product1.getPrice() < product2.getPrice()) return -1;
        if(product1.getPrice() > product2.getPrice()) return 1;
        else {
            return product1.getName().compareTo(product2.getName());
        }
    }
}

class SortedList<Product> extends ArrayList<Product> {
    private Comparator<Product> comparator;

    public SortedList()
    {
        this.comparator = (Comparator<Product>) new ProductComparator();
    }
    @Override
    public boolean add(final Product product) {
        final boolean result = super.add(product);
        Collections.sort(this, this.comparator);
        return result;
    }
}

public class Product {
    private String code;
    private String name;
    private double price;
    private double discountPrice;
    private boolean discounted;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price;
        this.discounted = false;
    }

    @Override
    public String toString(){
        return "Code: " + code +
                "\nName: " + name +
                "\nPrice: " + price +
                "\nDiscount Price: " + discountPrice;
    }

    public void setDiscounted(boolean discounted) {
        this.discounted = discounted;
    }

    public boolean isDiscounted() {
        return discounted;
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
}
