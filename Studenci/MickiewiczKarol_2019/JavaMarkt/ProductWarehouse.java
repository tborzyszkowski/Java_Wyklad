import java.util.ArrayList;

public class ProductWarehouse {

    private static final ProductWarehouse INSTANCE  = new ProductWarehouse();

    private ArrayList<Product> productArray = new ArrayList<Product>() {
        { add(new Product("1", "Laptop", 2499.99));
            add(new Product("2", "Słuchawki", 250.50));
            add(new Product("3", "Zeszyt", 8.20));
            add(new Product("4", "Monitor", 499.99));
            add(new Product("5", "Drukarka", 650.80));
            add(new Product("6", "Klawiatura", 99.90));
            add(new Product("7", "Biurko", 2499.99));
            add(new Product("8", "Lampka", 70.00));
            add(new Product("9", "Kubek", 12.50)); }
    };

    private ProductWarehouse() {

    }

    public ArrayList<Product> getProductArray() {
        return productArray;
    }

    public static ProductWarehouse getInstance() {
        return INSTANCE;
    }

}
