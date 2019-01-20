package JavaMarkt;

import java.util.Comparator;

public class ProductComparatorDefault implements Comparator<Product> {
    @Override
    public int compare(Product u, Product v) {
        if (u.getPriceNetto() < v.getPriceNetto()) {
            return 1;
        } else if (u.getPriceNetto() == v.getPriceNetto()) {
            return u.getName().compareTo(v.getName());
        } else return -1;
    }
}
