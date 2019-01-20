package JavaMarkt;

import java.util.Comparator;

public class ProductComparatorPrice implements Comparator<Product> {
    @Override
    public int compare(Product u, Product v) {
        if (u.getPriceNetto() < v.getPriceNetto()) {
            return 1;
        } else if (u.getPriceNetto() == v.getPriceNetto()) {
            return 0;
        } else return -1;
    }
}
