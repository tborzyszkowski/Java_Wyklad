package koszykInternetowy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    private ArrayList<Product> productsList;
    private boolean moreThan300;
    private boolean moreThan2Products;
    private boolean moreThan200FreeCup;
    private boolean discountCoupon;


    public Cart(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }

    public Cart() {
        this(new ArrayList<>());
    }

    public Cart(Product product) {
        this();
        addProduct(product);
    }


    public void addProduct(Product product) {
        productsList.add(product);
        sortList();
    }

    public double priceSum(){
        return productsList.stream().mapToDouble(p -> p.getPrice()).sum();
    }

    public double discountPriceSum(){
        return productsList.stream().mapToDouble(p -> p.getDiscountPrice()).sum();
    }


    private void isMoreThan300(){
        moreThan300 = priceSum() > 300;
        if (moreThan300) {
            productsList.forEach(p -> p.setDiscountPrice(p.getPrice()* 0.95));
            freeCup();
        }
    }


    private void freeProduct() {
        moreThan2Products = productsList.size() > 2;
        cheapestProduct().setDiscountPrice(0);
    }


    private void freeCup() {
        moreThan200FreeCup = priceSum() > 200;
        if (moreThan200FreeCup) productsList.add(new Product("0", "Kubek", 0));
    }

    public void sortList() {
        Collections.sort(productsList);
    }

    public Product cheapestProduct() {
        return Collections.max(productsList);
    }

    public Product mostExpensiveProduct() {
        return Collections.min(productsList);
    }

    public ArrayList<Product> cheapestProducts(int n) {
        sortList();
        return new ArrayList<>(productsList.subList(productsList.size() - n, productsList.size()));
    }

    public ArrayList<Product> mostExpensiveProducts(int n) {
        sortList();
        return new ArrayList<>(productsList.subList(0, n));
    }

    public void sortByPrice(boolean desc) {
        if (desc) productsList.sort(Comparator.comparing(p -> p.getPrice(), Comparator.reverseOrder()));
        else productsList.sort(Comparator.comparing(p -> p.getPrice()));
    }

    public void sortByName(boolean alphabetical) {
        if (!alphabetical) productsList.sort(Comparator.comparing(p -> p.getName(), Comparator.reverseOrder()));
        else productsList.sort(Comparator.comparing(p -> p.getName()));
    }

    public void applyDiscounts() {
        if (!moreThan300) isMoreThan300();
        if (!moreThan300 && !moreThan200FreeCup) freeCup();
        if (!moreThan2Products) freeProduct();
    }

    public void applyDiscounts(Product product) {
        applyDiscounts();
        if(!discountCoupon) {
            discountCoupon = true;
            if (moreThan300) {
                productsList.get(productsList.indexOf(product)).setDiscountPrice(product.getPrice() * 0.65);
            } else {
                productsList.get(productsList.indexOf(product)).setDiscountPrice(product.getPrice() * 0.7);
            }
        }
    }

    public void showProducts() {
        productsList.forEach(p -> System.out.println(p.toString()));
    }




}
