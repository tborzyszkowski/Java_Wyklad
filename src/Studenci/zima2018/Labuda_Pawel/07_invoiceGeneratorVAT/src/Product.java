@SuppressWarnings("WeakerAccess")
public class Product {
    private String name;
    private int quantity;
    private double net;
    private double vatTax;

    private Product() {
    }

    public Product(String name, int quantity, double net, double vatTax) {
        this();
        this.name = name;
        this.quantity = quantity;
        this.net = net;
        this.vatTax = vatTax;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        if (!(obj instanceof Product)) return false;

        Product other = (Product) obj;
        return this.getName().equals(other.getName());
    }

    private double calcTotalNet() {
        return Math.round(net * quantity * 100.0) / 100.0;
    }

    public double calcGross() {
        return Math.round((calcTotalNet() * (1 + vatTax)) * 100.0) / 100.0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", net=" + net +
                ", totalNet=" + calcTotalNet() +
                ", vatTax=" + vatTax +
                ", gross=" + calcGross() +
                '}';
    }
}
