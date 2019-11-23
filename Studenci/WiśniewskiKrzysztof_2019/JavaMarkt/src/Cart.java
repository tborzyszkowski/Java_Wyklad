import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Cart {
    private static int globalId = 0;
    private int id;
    private ArrayList<Product> products;
    private double sum;
    private double discountsum;

    public Cart() {
        this.id = globalId;
        globalId++;
        this.products = new ArrayList<>();
        this.sum = 0;
        this.discountsum = 0;
    }

    public void addProduct(Product product) {
        products.add(product);
        sum += product.getPrice();
        this.products.sort(Comparator.comparing(Product::getName).reversed());
        this.products.sort(Comparator.comparing(Product::getPrice).reversed());
    }

    public void finalizePurchase() {
        if (this.sum > 200) {
            Product kubek = new Product("9999", "Kubek", 0);
            kubek.setDiscountPrice(0);
            products.add(kubek);
        }
        if (this.sum > 300) {
            products.forEach(item -> item.setDiscountPrice(item.getPrice() * 0.95));
        }
        if (this.products.size() > 2) {
            Product kubek = getKubek();
            if (this.products.get(this.products.size() - 1) == kubek) {
                this.products.get(this.products.size() - 2).setDiscountPrice(0);
            } else {
                this.products.get(this.products.size() - 1);

            }
        }
        products.forEach(item -> this.discountsum += item.getDiscountPrice());
    }

    public Product getMostExpensiveProduct(boolean desc) {
        ArrayList<Product> list = (ArrayList<Product>) products.clone();
        if (desc) list.sort(Comparator.comparing(Product::getPrice));
        else list.sort(Comparator.comparing(Product::getPrice).reversed());
        return list.get(0);
    }

    public ArrayList<Product> getMostExpensiveProduct(int count, boolean desc) {
        ArrayList<Product> list = (ArrayList<Product>) products.clone();
        if (desc) list.sort(Comparator.comparing(Product::getPrice));
        else list.sort(Comparator.comparing(Product::getPrice).reversed());
        ArrayList<Product> returnList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            returnList.add(list.get(i));
        }
        return returnList;
    }

    public void finalizePurchase(String discountedProductName) {
        if (this.sum > 200) {
            Product kubek = this.getKubek();
            kubek.setDiscountPrice(0);
            this.products.add(kubek);
        }
        if (this.sum > 300) {
            this.products.forEach(item -> item.setDiscountPrice(item.getPrice() * 0.95));
        }
        if (this.products.size() > 2) {
            Product kubek = this.getKubek();
            if (this.products.get(this.products.size() - 1) == kubek) {
                this.products.get(this.products.size() - 2).setDiscountPrice(0);
            } else {
                this.products.get(this.products.size() - 1);

            }
        }
        for (Iterator<Product> it = products.iterator(); it.hasNext(); ) {
            Product x = it.next();
            if (x.getName().equals(discountedProductName)) {
                this.products.remove(x);
                x.setDiscountPrice(x.getPrice() * 0.7);
                this.products.add(x);
                this.sortProducts("name", true);
                this.sortProducts("price", true);
                break;
            }
        }
        products.forEach(item -> this.discountsum += item.getDiscountPrice());
    }

    public void sortProducts(String by, boolean desc) {
        by = by.toLowerCase();
        if (by.equals("name")) {
            if (desc) this.products.sort(Comparator.comparing(Product::getName));
            else this.products.sort(Comparator.comparing(Product::getName).reversed());
        } else if (by.equals("price")) {
            if (desc) this.products.sort(Comparator.comparing(Product::getPrice));
            else this.products.sort(Comparator.comparing(Product::getPrice).reversed());
        } else {
            throw new ValueException("Unsupported sorting field");
        }
    }

    public Product getKubek() {
        return new Product("9999", "Kubek", 0);
    }

    public void printProducts() {
        this.products.forEach(item -> System.out.println(item));
    }

    public int getId() {
        return id;
    }

    public double getSum() {
        return sum;
    }

    public double getDiscountsum() {
        return discountsum;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
