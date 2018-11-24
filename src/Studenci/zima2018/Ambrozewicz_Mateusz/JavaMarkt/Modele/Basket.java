package JavaMarkt.Modele;

import java.util.*;

public class Basket {

    ArrayList<ProductData> products = new ArrayList<>();
    double productPrice = 0;
    String productsName;
    
    public Basket addProduct(Product p, int quantum){
        products.add(new ProductData(p, quantum));
        productsName += p.getProductName();
        productPrice += p.getProductNettoPrice();
        return this;
    }

    public String names(){
        return productsName;
    }

    @Override
    public String toString() {
        return "Produkty w koszyku:" + products + "\n";
    }
}
