import java.util.Comparator;

public class Product implements Comparable{
    String code;
    String name;
    Double price;
    Double discountPrize = price;
    Product(String code, String name, Double price){
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrize = price;
    }

    public int compareTo(Object o) {
        return this.getDiscountPrize().compareTo(((Product) o).getDiscountPrize());
    }


    public void getValues(){
        System.out.println(code +" "+ name +" "+ price + " " +discountPrize);
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Double getDiscountPrize() {
        return discountPrize;
    }

    public void setDiscountPrize(double discountPrize) {
        this.discountPrize = discountPrize;
    }
}
