package Market;

import java.util.ArrayList;
import java.util.*;

public class Cart{
    private double totalPrice = 0;
    double totalPriceDiscount = 0;
    List<Product> items = new ArrayList<>();
    List<Promotions> promotions = new ArrayList<>();

    public double getTotalPrice() {
        totalPrice = 0;
        for(Product p : items)
            totalPrice += p.getPrice();
        return totalPrice;
    }

    public double getTotalPriceDiscount(){
        for(Product p: items)
            totalPriceDiscount += p.getDiscountPrice();
        return totalPriceDiscount;
    }

    public List<Product> getItems() {
        return items;
    }

    public List<Product> getPriceSortedItems(){
        Collections.sort(items, Product.PriceComparator);
        return items;
    }

    public List<Product> getNameSortedItems(){
        Collections.sort(items, Product.NameComparator);
        return items;
    }

    public Product mostExpensive(){
        this.getPriceSortedItems();
        return items.get(0);
    }

    public Product mostCheap(){
        this.getPriceSortedItems();
        return items.get(items.size() - 1);
    }

    public List<Promotions> getPromotions() {
        return promotions;
    }

    public Cart addProduct(Product p){
        items.add(p);
        return this;
    }

    public Cart removeProduct(Product p){
        items.remove(p);
        return this;
    }

    public Cart addPromotion(Promotions p){
        promotions.add(p);
        return this;
    }

    public Cart removePromotion(Promotions p){
        promotions.remove(p);
        return this;
    }

    public Cart apllyPromotions(){
        for(Promotions p: promotions){
            p.Calculate(this);
        }
        return this;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "totalPrice=" + totalPrice +
                ", totalPriceDiscount=" + totalPriceDiscount +
                ", items=" + items +
                ", promotions=" + promotions +
                '}';
    }
}
