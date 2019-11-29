package javaMarkt;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cart;
    private String accesory;

    public Cart(){
        ArrayList<Product> cart = new ArrayList<Product>();
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

    public void setAccesory(String accesory) {
        this.accesory = accesory;
    }

    public double findCheapest() {
        double low = 99999999;
        for (Product p : this.cart) {
            if (p.getPrice() < low)
                low = p.getPrice();
        }
            return low;
    }
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

    public double findMostExpensive(){
        double high = 0;
        for(Product p:this.cart){
           if(p.getPrice()>high)
                high = p.getPrice();
            }
            return high;
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


}
