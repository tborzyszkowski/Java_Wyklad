package JavaMarkt;

public class Product implements Comparable<Product> {
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    public Product(String code, String name, double price, double discountPrice) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public Product(String code, String name, double price) {
        this(code, name,price,price);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountedPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        if(discountPrice>=0 && discountPrice<= this.getPrice()) this.discountPrice = discountPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setDiscountPrice(int discount){
        this.setDiscountPrice(this.getPrice()*(100-discount)/100);
    }

    @Override
    public int compareTo(Product product) {

        if (this.getCode().equals(product.getCode()) &&
                this.getName().equals(product.getName()) &&
        this.getDiscountedPrice() == product.getDiscountedPrice()){
        //jeśli to jest dokładnie taki sam produkt zwroc 0
            if(this.getDiscountPrice() == product.getDiscountPrice())
                return 0;
        //jeśli różni się tylko rabatem zwraca 1
            else return 1;
        }
        //jeśli różnią się pozostałymi zmiennymi zwraca -1
        else
            return -1;
    }

    public static int comparePrice(Product product1, Product product2){
        if (product1.getDiscountedPrice() > product2.getDiscountedPrice()) return 1;
        if (product1.getDiscountedPrice() < product2.getDiscountedPrice()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%12s | %20s | %7.2f | %7.2f ", this.code, this.name, this.price, this.discountPrice);
    }
}
