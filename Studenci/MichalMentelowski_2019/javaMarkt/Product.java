package javaMarkt;

import java.util.ArrayList;

public class Product {
    private String code;
    private String name;
    private double price;
    private double discountPrice;
    private double discount;

    public Product(String code,String name,double price){
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price * discount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
    public double getDiscount() {
        return discountPrice;
    }

    public void setDiscount(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    /*public void discounterP(Product product){
        if(price>300){
            this.discount = 0.95;
        }
        if(price>200){
            this.accesory = "kubek";
        }
        if(price<200){
            this.accesory = "kubek";
        }

    }*/
}
