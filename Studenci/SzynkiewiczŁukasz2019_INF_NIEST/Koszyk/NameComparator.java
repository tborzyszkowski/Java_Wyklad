import java.util.Comparator;

public class NameComparator implements Comparator<Product> {

    @Override
    public int compare(Product produkt1, Product produkt2) {
        return produkt1.getName().compareToIgnoreCase(produkt2.getName());
    }
}
