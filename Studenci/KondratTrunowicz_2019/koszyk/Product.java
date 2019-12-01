public class Product {
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    public Product (String code, String name, double price){
       this.code=code;
       this.name=name;
       this.price=price;
       this.discountPrice=price;
    }

    public Product (){ }
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

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
    public void printProduct()
    {
        System.out.printf("Code: ");
        System.out.println(code);
        System.out.printf("Nazwa:");
        System.out.println(name);
        System.out.printf("Price: ");
        System.out.println(price);
        System.out.printf("DiscountPrice: ");
        System.out.println(discountPrice);
    }
}


