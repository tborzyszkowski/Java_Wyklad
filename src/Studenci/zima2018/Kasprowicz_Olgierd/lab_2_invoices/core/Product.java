package lab2.core;

import java.util.StringJoiner;

public class Product
{
    public Product(double price, String name)
    {
        this.price = price;
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    private final double price;
    private final String name;

    @Override
    public String toString()
    {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("price=" + price)
                .add("name='" + name + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (Double.compare(product.getPrice(), this.getPrice()) != 0) return false;
        return this.getName().equals(product.getName());
    }

    @Override
    public int hashCode()
    {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getPrice());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getName().hashCode();
        return result;
    }
}
