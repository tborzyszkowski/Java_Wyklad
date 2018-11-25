package Invoice.Models;

import JavaMarkt.Modele.Product;
import JavaMarkt.Modele.ProductData;

import java.util.ArrayList;

public class InvoicePosition {
    ArrayList<ProductData> productList = new ArrayList<>();
    double productPrice = 0;
    double productVAT = 0;

    public double invoiceBruttoPrice(){
        double sum = 0;
        for (ProductData it : productList)
            sum += it.getTotalBruttoPrice();
        return sum;
    }

    public InvoicePosition addProduct(Product p, int quantum){
        productList.add(new ProductData(p, quantum));
        productPrice += p.getProductNettoPrice();
        productVAT += p.getProductVat();
        return this;
    }

    @Override
    public String toString() {
        return "Lista produktow:" + productList;
    }
}
