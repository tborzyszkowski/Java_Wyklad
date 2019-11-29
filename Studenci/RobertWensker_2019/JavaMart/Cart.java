import java.util.ArrayList;
import java.util.Collections;

public class Cart {

    ArrayList<Product> listOfProducts = new ArrayList<Product>();
    Double total = 0.0;
    Double discountTotal = 0.0;
    Boolean cupIncluded = false;

    public Double getDiscountTotal() {
        return discountTotal;
    }

    public void setDiscountTotal(Double discountTotal) {
        this.discountTotal = discountTotal;
    }

    public ArrayList<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(ArrayList<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void showContents(ArrayList<Product> list){
        for (Product p: list){
            p.getValues();
        }
    }
    public void  addProduct(Product product){
        listOfProducts.add(product);
    }
    public void setTotal(){
        for(Product p: listOfProducts){
            total+=p.price;
        }
    }

    public Boolean getCupIncluded() {
        return cupIncluded;
    }

    public void setCupIncluded(Boolean cupIncluded) {
        this.cupIncluded = cupIncluded;
    }

    public Double getTotal(){
        return this.total;
    }
    public void set30(Product product){
        product.setDiscountPrize(product.discountPrize * 0.70);
        this.setDiscountTotal(this.getDiscountTotal() - product.discountPrize * 0.30);
        for(Product p : listOfProducts){
            this.setDiscountTotal(this.getDiscountTotal() + p.getDiscountPrize());
        }
    }
    public void discounts(){
        setTotal();

        if(this.getTotal() > 300){
            for(Product p : listOfProducts){
                p.setDiscountPrize(p.price * 0.95);
            }
        }
        else {
            for(Product p : listOfProducts){
                p.setDiscountPrize(p.price);
            }
        }
        if(this.getTotal() > 200){
            this.setCupIncluded(true);
        }

        if(listOfProducts.size() >= 3){
            ArrayList<Product> sortedProducts = new ArrayList<Product>();
            sortedProducts = sortByDiscountPrize();
            //discountTotal = discountTotal - sortedProducts.get(0).discountPrize;
            sortedProducts.get(0).setDiscountPrize(0.0);
            listOfProducts = sortedProducts;

        }
        setDiscountTotal(0.0);
        for(Product p : listOfProducts){
            this.setDiscountTotal(this.getDiscountTotal() + p.getDiscountPrize());
        }


    }

    public ArrayList<Product> sortByDiscountPrize(){
        ArrayList<Product> sortedProducts = new ArrayList<Product>();
        sortedProducts.addAll(listOfProducts);

        Collections.sort(sortedProducts);

        for (Product p: sortedProducts){
            p.getValues();
        }
        return sortedProducts;
    }



    public ArrayList<Product> sortByName(){
        ArrayList<Product> sortedProducts = new ArrayList<Product>();
        sortedProducts.addAll(listOfProducts);

        Collections.sort(sortedProducts,new NameComparator());

        for (Product p: sortedProducts){
            p.getValues();
        }
        return sortedProducts;
    }


    public Product findCheapestProduct(ArrayList<Product> Products){
        ArrayList<Product> sortedProducts = new ArrayList<Product>();
        sortedProducts.addAll(Products);

        Collections.sort(sortedProducts);

        for (Product p: sortedProducts){
            p.getValues();
        }
        return sortedProducts.get(0);

    }

    public ArrayList<Product> findCheapestProducts(ArrayList<Product> Products , int n){
        ArrayList<Product> sortedProducts = new ArrayList<Product>();
        ArrayList<Product> sortedProducts2 = new ArrayList<Product>();
        sortedProducts.addAll(Products);

        Collections.sort(sortedProducts);
        int i;
        for(i = 0; i<n; i++){
            sortedProducts2.add(sortedProducts.get(i));
        }
        return sortedProducts2;
    }


}
