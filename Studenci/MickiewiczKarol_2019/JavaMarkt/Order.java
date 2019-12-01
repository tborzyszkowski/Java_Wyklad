import java.beans.PropertyChangeSupport;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Order {

    private ArrayList<Product> products;
    private double orderPrice;

    public Order(ArrayList<Product> products) {
        this.products = products;
    }

    public void countOrderPrice() {

        for (Product product : products) {
            this.orderPrice += product.getPrice();
        }

    }

    public void sortArrayByPrice() {

        products = products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).collect(Collectors.toCollection(ArrayList::new));

    }

    public void sortArrayByName() {

        Product temp;
        for (int i = 1; i < products.size(); i++) {
            for (int j = i; j > 0; j--) {

                if (products.get(j).getPrice() == products.get(j - 1).getPrice()) {
                    if (products.get(j).getName().compareTo(products.get(j - 1).getName()) < 0) {
                        temp = products.get(j);
                        products.set(j, products.get(j-1));
                        products.set(j-1, temp);
                    }
                }
            }
        }

    }

    public Optional<Product> findProductWithMaxPrice() {
        return products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).findFirst();
    }

    public Optional<Product> findProductWithMinPrice() {
        return products.stream().sorted(Comparator.comparing(Product::getPrice)).findFirst();
    }

    public void findNProductsWithMaxPrice(int n) {
        List<Product> temp = products.stream().sorted(comparing(Product::getPrice).reversed()).collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            System.out.printf(temp.get(i).toString() + " ");
        }
        System.out.println();
    }

    public void findNProductsWithMinPrice(int n) {
        List<Product> temp = products.stream().sorted(comparing(Product::getPrice)).collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            System.out.printf(temp.get(i).toString() + " ");
        }
        System.out.println();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products.stream().map(product -> product.toString()).collect(Collectors.joining()) +
                '}';
    }
}
