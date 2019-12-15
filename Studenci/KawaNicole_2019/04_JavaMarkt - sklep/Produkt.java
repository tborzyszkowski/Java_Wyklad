public class Produkt {
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    private Produkt() {
    }

    // print new product
    private void printNewProdukt() {
        System.out.println("Add new " + toString());
    }

    Produkt(String code, String name, double price) {
        this();
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price;

        this.printNewProdukt();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        if (! (obj instanceof Product)) return false;

        Produkt other = (Product) obj;
        if (this.getName().equals(other.getName())) return this.getPrice() == other.getPrice();
        else return false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
