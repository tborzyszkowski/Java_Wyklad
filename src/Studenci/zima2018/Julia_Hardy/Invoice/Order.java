package Invoice;

public class Order {
    private String name;
    private int count;
    private double price;
    private double order_price;
    private double tax;
    private double price_b;

    public Order(){}

    public Order(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public double getOrder_price() {
        order_price = price * count;
        return order_price;
    }

    public double getTax() {
        tax = order_price * 0.23;
        return tax;
    }

    public double getPrice_b() {
        price_b = order_price + tax;
        return price_b;
    }




    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", order_price=" + order_price +
                ", tax=" + tax +
                ", price_b=" + price_b +
                '}';
    }
}
