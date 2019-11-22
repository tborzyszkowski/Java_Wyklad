import java.util.*;

public class ShoppingCart {
    private List<Product> productsList = new ArrayList<>();
    private double sumCart=0;
    private boolean bonusCup;       //sumCart above 200
    private boolean above300Disc;   //sumCart above 300 5% discount
    private boolean bonusProduct;   //atleast 3 products, cheaper one for free
    private Product coupon;         //30% discount coupon on single product


    void calculateSumCart(){
        sumCart = 0;
        double sumOrigCart = 0;
        for (int i=0; i<productsList.size(); i++){
            sumOrigCart += productsList.get(i).getProductPrice();
        }
        if (sumOrigCart > 300.0){
            useAbove300disc();
            above300Disc = true;
        }
        else { above300Disc = false; }
        calculateAllDiscPrice();

        for (int i=0; i<productsList.size(); i++){
            sumCart += productsList.get(i).getProductDiscPrice();
        }
    }
    void useAbove300disc(){
        for(int i=0; i<productsList.size(); i++){
            productsList.get(i).setProductDiscPrice(productsList.get(i).getProductDiscPrice()*0.95);
        }
    }

    void addCup(){
        bonusCup = true;
    }

    void useCoupon(Product product){
        if (coupon == null) {
            product.setProductDiscPrice(product.getProductDiscPrice() * 0.7);
            coupon = product;
            calculateSumCart();
        }
        if (productsList.size() > 1) { sortedList(); }
    }

    void addProduct(Product product){
        productsList.add(product);
        if (above300Disc == true) {
            product.setProductDiscPrice(product.getProductDiscPrice() * 0.95);
        }
        checkBonuses();
        if (productsList.size() > 1) { sortedList(); }
    }

    void removeProduct(Product product) {
        if (coupon == product){ coupon = null; }
        productsList.remove(product);
        checkBonuses();
    }

    void removeBonusProduct(){
        for (int i=0; i< productsList.size(); i++){
            if(productsList.get(i).getProductDiscPrice() == 0.0){
                calculateDiscPrice(productsList.get(i));
            }
        }
        bonusProduct = false;
    }

    void useBonusProduct(){
        int min=0;
        int oldDisc = -1;
        for(int i=0; i<productsList.size(); i++){
            if(productsList.get(i).getProductPrice() < productsList.get(min).getProductPrice()){
                min = i;
            }
            if(productsList.get(i).getProductDiscPrice() == 0.0){
                oldDisc = i;
            }
        }
        if (oldDisc != min && oldDisc != -1) {
            bonusProduct = false;
            calculateDiscPrice(productsList.get(oldDisc));
        }
        productsList.get(min).setProductDiscPrice(0.0);
        bonusProduct = true;
    }

    void checkBonuses(){
        if (productsList.size() < 3 && bonusProduct == true){
            removeBonusProduct();
            calculateAllDiscPrice();
        }
        else if (productsList.size() >= 3){
            useBonusProduct();
        }
        if (sumCart > 300.0){ calculateAllDiscPrice(); }
        calculateSumCart();

        if (sumCart > 200.0) { addCup(); }
        else if (bonusCup == true){ bonusCup = false; }

    }

    void calculateDiscPrice(Product product){
        double temp = product.getProductPrice();
        if (above300Disc)            { temp *= 0.95; }
        if (coupon == product)       { temp *= 0.7; }
        if (product.getProductDiscPrice() == 0.0 && bonusProduct == true) { temp = 0.0; }
        product.setProductDiscPrice(temp);
    }

    void calculateAllDiscPrice(){
        for (int i=0; i<productsList.size(); i++){
            calculateDiscPrice(productsList.get(i));
        }
    }

    public String toString(){
        return "Zawartość koszyka: \n" + listAllProducts();
    }

    String listAllProducts(){
        String products = new String();
        for (int i=0; i<productsList.size(); i++){
            products += productsList.get(i).toString();
        }
        if (bonusCup){
            products += "GRATIS Kubek firmowy :)\n";
        }
        products += "\nDo zapłaty: " + String.format("%.2f" ,sumCart) + " PLN\n";
        return products;
    }

    double getSumCart(){
        return sumCart;
    }

    void sortedList(){
        for (int i=0; i<productsList.size()-1; i++){
            for (int j=i; j<productsList.size(); j++){
                if(productsList.get(i).getProductDiscPrice() < productsList.get(j).getProductDiscPrice()) {
                    Product temp = productsList.get(i);
                    productsList.set(i, productsList.get(j));
                    productsList.set(j, temp);
                }
            }
        }
        int len = productsList.size()-1;
        while (len > 0) {
            if (productsList.get(len).getProductDiscPrice() == productsList.get(len-1).getProductDiscPrice()){
                int varCompareTo = productsList.get(len).getProductName().compareTo(productsList.get(len-1).getProductName());
                    if (varCompareTo < 0){
                        Product temp = productsList.get(len);
                        productsList.set(len, productsList.get(len-1));
                        productsList.set(len-1, temp);
                    }
            }
            len--;
        }
    }

    String cheapestProduct(){
        double maxPrice=0;
        int index=0;
        for (int i=0; i< productsList.size(); i++){
            if (productsList.get(i).getProductDiscPrice() > maxPrice){
                index=i;
                maxPrice = productsList.get(i).getProductDiscPrice();
            }
        }
        return productsList.get(index).toString();
    }

    String mostExpensiveProduct(){
        double minPrice= productsList.get(0).getProductDiscPrice();
        int index=0;
        for (int i=1; i< productsList.size(); i++){
            if (productsList.get(i).getProductDiscPrice() <= minPrice){
                index=i;
                minPrice = productsList.get(i).getProductDiscPrice();
            }
        }
        return productsList.get(index).toString();
    }

    public String listCheapestProducts(int n){
        String result = new String();
        int i=productsList.size()-1;
        while(n-->0){
            result += productsList.get(i).toString();
            i--;
        }
        return result;
    }

    public String listMostExpensiveProducts(int n){
        String result = new String();
        int i=0;
        while(n-->0){
            result += productsList.get(i).toString();
            i++;
        }
        return result;
    }
}