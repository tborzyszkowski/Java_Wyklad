package javaMarkt;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cart;

    public Cart(){
        ArrayList<Product> cart = new ArrayList<Product>();
    }
    public void discounterC(Cart cart){
        if(this.cart.size()==3){
            thirdGratis();
            }
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
    public void thirdGratis(){
        double low = findCheapest();
        for(Product p:this.cart){
            if(p.getPrice()==low)
                p.setPrice(0);
        }
    }

}
