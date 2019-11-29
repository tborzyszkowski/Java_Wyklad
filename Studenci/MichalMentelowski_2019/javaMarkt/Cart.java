package javaMarkt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cart {
    private ArrayList<Product> cart;
    private String accesory;

    public Cart(){
         this.cart = new ArrayList<Product>();
    }
    public void discounterC(Cart cart){
        if(this.cart.size()==3){
            thirdGratis();
        }
        else{
            blackFriday();
        }
        double sum = 0;
        for (Product p : this.cart) {
            sum += p.getPrice();
        }
        if(sum>200)
            cart.accesory ="kubek";
        if(sum>300)
            for (Product p : this.cart) {
                p.setDiscount(0.95);
            }
    }



    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public String getAccesory() {
        return accesory;
    }
    public void addProduct(Product product){
        this.cart.add(product);
    }

    public void setAccesory(String accesory) {
        this.accesory = accesory;
    }
    public ArrayList<Product> getProductlist() {
        return cart;
    }

    public double findCheapest() {
        double low = 99999999;
        for (Product p : this.cart) {
            if (p.getPrice() < low)
                low = p.getPrice();
        }
        return low;
    }
    public double findMostExpensive(){
        double high = 0;
        for(Product p:this.cart){
            if(p.getPrice()>high)
                high = p.getPrice();
        }
        return high;
    }
    public ArrayList<Product> sortAlfabetic(){
        this.cart.sort(Comparator.comparing(Product::getName));
        return this.cart;
    }
    public ArrayList<Product> sortPrice(){
        this.cart.sort(Comparator.comparing(Product::getPrice));
        return this.cart;
    }
    public List<Product> findCheapestN(int n) {
        sortPrice();
        return this.cart.subList(this.cart.size()-n,this.cart.size()-1);

    }
    public List<Product> findMostExpensiveN(int n) {
        Collections.reverse(sortPrice());
        return this.cart.subList(this.cart.size()-n,this.cart.size()-2);
    }
    public double sum() {
        double sum = 0;
        for(Product p:this.cart){
            sum += p.getPrice();
        }
        return sum;
    }

    //DISCOUNTS
    public void thirdGratis(){
        double low = findCheapest();
        for(Product p:this.cart){
            if(p.getPrice()==low)
                p.setPrice(0);
        }
    }
    public void blackFriday(){
        double low = findCheapest();
        for(Product p:this.cart){
            if(p.getPrice()==low)
                p.setDiscount(0.70);
        }
    }
    public void printCart(){
        for (Product product : cart) {
            System.out.println(product);
        }
    }


}