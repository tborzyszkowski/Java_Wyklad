package JavaMarkt;

import java.util.ArrayList;
import java.util.Comparator;

public class Cart {
    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<Promotion> promotions = new ArrayList<Promotion>();
    private ProductComparatorDefault comparator = new ProductComparatorDefault();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Promotion> getPromotions() {
        return promotions;
    }

    double totalPriceNetto() {
        double total = 0;
        for (Product product : products) {
            total += product.getPriceNetto();
        }
        return total;
    }

    double totalDiscountPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getDiscountPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "products= \n" + products +
                "\npromotions= \n" + promotions +
                "\ntotalPrice= \n" + this.totalPriceNetto() +
                "\ntotalDiscountedPrice= \n" + this.totalDiscountPrice();
    }

    public Cart addProduct(Product product) {
        this.products.add(product);
        return this;
    }

    public void removeProduct(Product product) {
        if (this.products.contains(product))
            this.products.remove(product);
        else
            System.out.println("no such product in cart");
    }

    public Cart addPromotion(Promotion promotion) {
        if (promotion.isApplicable(this)) {
            this.promotions.add(promotion);
            promotion.applyPromotion(this);
        } else {
            System.out.println("This promotion is not applicable");
        }
        return this;
    }

    public void removePromotion(Promotion promotion) {
        if (this.promotions.contains(promotion)) {
            this.promotions.remove(promotion);
            promotion.removePromotion(this);
        } else
            System.out.println("no such promotion in cart");
    }

    public Product getCheapest() {
        if (products.size() > 0) {
            products.sort(comparator);
            return products.get(products.size() - 1);
        } else {
            System.out.println("Koszyk jest pusty");
            return null;
        }

    }

    public Product getExpensive() {
        if (products.size() > 0) {
            products.sort(comparator);
            return products.get(0);
        } else {
            System.out.println("Koszyk jest pusty");
            return null;
        }
    }

    public ArrayList<Product> getNCheapest(int n) {
        if (n > products.size()) {
            n = products.size();
        }
        products.sort(comparator);
        return new ArrayList<Product>(products.subList(products.size() - n, products.size()));
    }

    public ArrayList<Product> getNExpensive(int n) {
        if (n > products.size()) {
            n = products.size();
        }
        products.sort(comparator);
        return new ArrayList<Product>(products.subList(0, n));
    }

    public ArrayList<Product> sort(String order) {
        if (order.equals("name")) {
            Comparator<Product> comp = new ProductComparatorName();
            products.sort(comp);
        } else if (order.equals("price")) {
            Comparator<Product> comp = new ProductComparatorPrice();
            products.sort(comp);
        }
        return products;
    }
}