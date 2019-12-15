import java.util.Comparator;

public class Product {
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    public Product(String code, String name, double price) throws IllegalArgumentException {
        if(price < 0.00 || (price*100)%1 != 0)
            throw new IllegalArgumentException("niepoprawna cena");
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice=price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    static String toStringHeader() {
        return "CODE        |NAME                                           |Price |DISCOUNTPRICE";
    }

    @Override
    public String toString() {
        String temp=code+"|";
        temp+=name;
        for(int i=temp.length();i<60;i++)
        {
            temp+=" ";
        }
        temp+="|"+price;
        for(int i=temp.length();i<67;i++)
        {
            temp+=" ";
        }
        temp+="|"+discountPrice;
        return temp;
    }
}

class SortByPriceAsc implements Comparator<Product> {
    public int compare(Product a, Product b) {
        return (int)((a.getPrice() - b.getPrice())*100);
    }
}

class SortByPriceDsc implements Comparator<Product> {
    public int compare(Product a, Product b) {
        return (int)((b.getPrice() - a.getPrice())*100);
    }
}

class SortByPriceAndName implements Comparator<Product> {
    public int compare(Product a, Product b) {
        if(a.getPrice()==b.getPrice())
            return a.getName().compareTo(b.getName());
        else
            return (int)((b.getPrice() - a.getPrice())*100);
    }
}
