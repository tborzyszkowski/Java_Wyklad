package koszyk;

import java.util.*;

public class Basket {
    private Client client;
    private int id;
    private static int idCounter = 0;
    private ArrayList<Product> products;
    private double sum;
    private double discount;
    private boolean hasCup;
    private boolean discountCoupon;

    public Basket(Client client) {
        this.client = client;
        this.products = new ArrayList<>();
        this.id = idCounter;
        idCounter += 1;
        sum = 0;
        discount = 1;
        hasCup = false;
        discountCoupon = false;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "client=" + client +
                ", id=" + id +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return id == basket.id &&
                Objects.equals(client, basket.client) &&
                Objects.equals(products, basket.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, id, products);
    }

    public Client getClient() {
        return client;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getSum(){
        return sum;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean getDiscountCoupon() { return discountCoupon; }

    public void setDiscountCoupon(boolean b){
        this.discountCoupon = b;
    }

    public double getSumWithDiscount(){
        return sum*discount;
    }

    public void setProductDiscount(Product product){
        if (!discountCoupon){
            return;
        }
        int i = products.indexOf(product);
        if (i == -1){
            return;
        }
        Product p = products.get(i);
        p.setDiscountPrice(p.getPrice()*0.7);
        discountCoupon = false;
        products.set(i, p);
    }

    private void sortProducts(){
        products.sort(Comparator.comparing(Product::getDiscountPrice, Comparator.reverseOrder())
                .thenComparing(Product::getName));

    }

    public void addProduct(Product product){
        this.products.add(product);
        this.sum += product.getDiscountPrice();
        this.sortProducts();
        if (sum >= 200 && !hasCup){
            Product cup = new Product("cup", "cup", 0.0);
            hasCup = true;
            this.addProduct(cup);
        }
        if (products.size() == 3){
            Product p = products.get(2);
            p.setDiscountPrice(0);
            products.set(2, p);
        }
        if (sum > 300){
            discount = 0.95;
        }
    }

    public ArrayList<Product> findMostExpensiveProducts(){
        ArrayList<Product> list = new ArrayList<>();
        double x;
        try{
            x = products.get(0).getDiscountPrice();
        }
        catch(IndexOutOfBoundsException e){
            return list;
        }
        for (int i = 0; products.get(i).getDiscountPrice() == x; i++){
            list.add(products.get(i));
        }
        return list;
    }

    public ArrayList<Product> findMostExpensiveProducts(int n) {
        ArrayList<Product> list = new ArrayList<>();
        int i = 0;
        for(Product product : products){
            if (i >= n){
                break;
            }
            list.add(product);
            i++;
        }
        return list;
    }

    public ArrayList<Product> findCheapestProducts(){
        ArrayList<Product> list = new ArrayList<>();
        double x = products.get(products.size()-1).getDiscountPrice();
        for (int i = products.size()-1; products.get(i).getDiscountPrice() == x; i--){
            list.add(products.get(i));
        }
        return list;
    }

    public ArrayList<Product> findCheapestProducts(int n){
        ArrayList<Product> list = new ArrayList<>();
        for (int i = products.size()-1; i >= 0 && products.size()-1 - i < n; i--){
            list.add(products.get(i));
        }
        return list;
    }

    public void printProductsInfo(){
        for(Product product : products){
            System.out.format("%s: %s %.2f %.2f",
                    product.getCode(), product.getName(),
                    product.getPrice(), product.getDiscountPrice());
        }
    }
}
