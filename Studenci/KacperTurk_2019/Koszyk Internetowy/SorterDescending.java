import java.util.Comparator;

public class SorterDescending implements Comparator<Product>
{
    public int compare(Product o1, Product o2)
    {
        return Double.compare(o2.getPrice(),o1.getPrice());
    }
}