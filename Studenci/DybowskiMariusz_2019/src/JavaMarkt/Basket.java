package JavaMarkt;

import java.util.ArrayList;
import java.util.Collections;

public class Basket {
    private ArrayList<Product> items;
    private Product promoItem = new Product("PromoCup", "Promotional Cup", 0);
    private boolean isPromoItemFlag = false;
    private int discount30; //-1 jeśli nie wybrano produktu do rabatu. W przeciwnym razie indeks produktu


    Basket(){
        this.items = new ArrayList<>();
        this.discount30 = -1;
    }

    private void sortItems(){
        this.items.sort(Product::comparePrice);
        Collections.sort(this.items, Collections.reverseOrder(Product::compareTo));
    }

    public void addItem(Product item){
        this.items.add(item);
        this.checkPromoItem();
        this.checkDiscounts();
        this.sortItems();
    }

    private void checkPromoItem(){
        if (this.getTotalPrice() > 200 && !this.isPromoItemFlag()) {
            this.items.add(promoItem);
            this.isPromoItemFlag = true;
        }
        else if (this.isPromoItemFlag() && this.getTotalPrice() <=200){
            this.items.remove(promoItem);
            this.isPromoItemFlag = false;
        }

    }

    public void removeItem(Product item){
        while(this.items.remove(item));
        this.checkPromoItem();
        this.checkDiscounts();

    }

    public void removeItem(int index){
        this.items.remove(index);
        this.checkPromoItem();
        if (this.getDiscount30() == index)
            this.removeDiscount30();
        this.checkDiscounts();

    }

    public void removeItems(String code){
        for(Product item:this.getItems()){
            if (item.getCode().equals(code)) {
                if(this.items.indexOf(item) == this.getDiscount30())
                    this.removeDiscount30();
                this.removeItem(item);
            }
        }
    }

    public ArrayList<Product> findNMax(int n){
        ArrayList<Product> temporary = this.getItems();
        ArrayList<Product> result = new ArrayList<>();

        for(int i = 0; i<n; i++) {
            result.add(temporary.get(i));
        }
        return result;
    }

    public ArrayList<Product> findNMin(int n){
        ArrayList<Product> temporary = this.getItems();
        ArrayList<Product> result = new ArrayList<>();

        for(int i = temporary.size()-1; i>= temporary.size() - n - 1 ; i--) {
            result.add(temporary.get(i));
        }
        return result;
    }

    public Product findMin(){
        return this.findNMin(1).get(0);
    }

    public Product findMax(){
        return this.findNMax(1).get(0);
    }

    public double getTotalPrice(){
        double result = 0.0;
        for(Product item:this.getItems())
            result += item.getDiscountedPrice();
        return result;
    }

    public double getTotalDiscountedPrice(){
        double result = 0.0;
        for(Product item:this.getItems())
            result += item.getDiscountPrice();
        return result;
    }

    public void setDiscount30(int index){
        if(index < this.items.size()) {
            this.discount30 = index;
            this.items.get(index).setDiscountPrice(30);
        }
    }

    public void removeDiscount30(){
        if(discount30 >=0) {
            this.items.get(discount30).setDiscountPrice(100);
            discount30 = -1;
        }
        checkDiscounts();
    }




    private void checkDiscounts() {
        //dodanie 5% zniżki
        if (getTotalPrice() > 300)
            for (Product item : this.items) {
                if (this.getDiscount30() != items.indexOf(item)) {
                    item.setDiscountPrice(5);
                }

            }
        //odjęcie 5% zniżki
        if (getTotalPrice() <= 300)
            for (Product item : this.items) {
                if (this.getDiscount30() != items.indexOf(item)) {
                    item.setDiscountPrice(0);
                }

            }

    }


    public void print(){
        System.out.println(String.format("%12s | %20s | %7s | %7s ", "Code", "Name", "Price", "Discount"));
        System.out.println("--------------------------------------------------------");
        for(Product item:this.getItems())
            System.out.println(item.toString());

    }



    public boolean isPromoItemFlag() {
        return this.isPromoItemFlag;
    }

    public Product getPromoItem() {
        return this.promoItem;
    }

/**
 * zwraca kopię koszyka
 * */
    public ArrayList<Product> getItems() {
        return new ArrayList<>(this.items);
    }

    public int getDiscount30() {
        return this.discount30;
    }


}
