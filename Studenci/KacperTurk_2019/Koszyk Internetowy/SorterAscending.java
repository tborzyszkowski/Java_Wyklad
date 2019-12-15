import java.util.Comparator;

public class SorterAscending implements Comparator<Product>
{
    public int compare(Product o1, Product o2)
    {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}