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
<<<<<<< HEAD
        }
        else{
            blackFriday();
        }
=======
            }
        else{
            blackFriday();
        }
>>>>>>> fe1ce42d3ee20b0f4c55367d5a608090417802ee
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
<<<<<<< HEAD
    }
=======
        }
>>>>>>> fe1ce42d3ee20b0f4c55367d5a608090417802ee



    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public String getAccesory() {
        return accesory;
    }
<<<<<<< HEAD
    public void addProduct(Product product){
        this.cart.add(product);
    }
=======
>>>>>>> fe1ce42d3ee20b0f4c55367d5a608090417802ee

    public void setAccesory(String accesory) {
        this.accesory = accesory;
    }
<<<<<<< HEAD
    public ArrayList<Product> getProductlist() {
        return cart;
    }
=======
>>>>>>> fe1ce42d3ee20b0f4c55367d5a608090417802ee

    public double findCheapest() {
        double low = 99999999;
        for (Product p : this.cart) {
            if (p.getPrice() < low)
                low = p.getPrice();
        }
        return low;
    }
<<<<<<< HEAD
=======
    public ArrayList<Product> findCheapestN(int n) {
        double low = 99999999;
        ArrayList<Product> tab = new ArrayList<>();
        for (int i = n;i>0;i--) {
            for (Product p : this.cart) {
                if (p.getPrice() < low) {
                    low = p.getPrice();
                    tab.add()
                }
            }
        }
        return tab;
    }

>>>>>>> fe1ce42d3ee20b0f4c55367d5a608090417802ee
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
<<<<<<< HEAD

    //DISCOUNTS
=======
   //DISCOUNTS
>>>>>>> fe1ce42d3ee20b0f4c55367d5a608090417802ee
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
<<<<<<< HEAD
    public void printCart(){
        for (Product product : cart) {
            System.out.println(product);
        }
    }
=======
>>>>>>> fe1ce42d3ee20b0f4c55367d5a608090417802ee


}