package JavaMarkt;

import java.util.Comparator;

public class ProductComparatorName implements Comparator<Product> {
    @Override
    public int compare(Product u, Product v) {
        return u.getName().compareTo(v.getName());
    }
}
