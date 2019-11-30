import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product produkt1, Product produkt2) {
        if (produkt1.getPrice() > produkt2.getPrice()) return 1;
        else if (produkt1.getPrice() < produkt2.getPrice()) return -1;
        else return 0;
    }
}
