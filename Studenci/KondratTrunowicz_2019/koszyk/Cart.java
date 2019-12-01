import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    private ArrayList<Product> productlist;
    private double suma;
    private double sumaRabat;
    public Cart()
    {
        this.productlist = new ArrayList<>();
        this.suma=0;
        this.sumaRabat=0;
    }
    public void sorting(){
        this.productlist.sort(Comparator.comparing(Product::getName));
        Collections.reverse(productlist);
        this.productlist.sort(Comparator.comparing(Product::getPrice));
        Collections.reverse(productlist);
    }

    public void sortbyName(){
        this.productlist.sort(Comparator.comparing(Product::getName));
    }
    public void sortbyPrice(){
        this.productlist.sort(Comparator.comparing(Product::getPrice));
    }
    public Product lowcost(){
       sorting();
        return this.productlist.get(productlist.size()-1);
    }
    public Product highcost(){
        sorting();
        return this.productlist.get(0);
    }
    public ArrayList<Product> lowcostN(int n){
        sorting();
        productlist = getProductlist();
        ArrayList<Product> lowcosts = new ArrayList<>();
        for (int i =productlist.size()-1; i>=productlist.size()-n; i--) {
            lowcosts.add(productlist.get(i));
        }
        return lowcosts;
    }
    public ArrayList<Product> highcostN(int n){
        sorting();
        productlist = getProductlist();
        ArrayList<Product> highcosts = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            highcosts.add(productlist.get(i));
        }
        return highcosts;
    }

    public void addProduct(Product product){
        this.productlist.add(product);
    }
    public void printCart()
    {
        productlist = getProductlist();
        for (Product product : productlist) {
            product.printProduct();
        }
    }

    public void sumPrice() {
        productlist = getProductlist();
        for (Product product : productlist) suma = suma + product.getPrice();
    }
    public void SumaRabat() {
        productlist = getProductlist();
        for (Product product : productlist) sumaRabat = sumaRabat + product.getDiscountPrice();
    }
    public void conclusion() {
        if (suma > 300) {
            productlist = getProductlist();
            for (Product product : productlist) {
                product.setDiscountPrice(product.getPrice() * 0.95);
            }
        }
        if (productlist.size()>2)
        {
            productlist.get(productlist.size()-1).setDiscountPrice(0);
        }
        if (suma > 200){
            Product FreeKubek = new Product ("1001","Kubek",0);
            productlist.add(FreeKubek);
        }
    }
    public void conclusionWithRabat(String przedmiot) {
        productlist = getProductlist();
        for (Product value : productlist) {
            if (value.getName().equals(przedmiot)) {
                value.setDiscountPrice(value.getPrice() * 0.7);
            }
        }

        if (suma > 300) {
            productlist = getProductlist();
            for (Product product : productlist) {
                product.setDiscountPrice(product.getPrice() * 0.95);
            }
        }
        if (productlist.size()>2)
        {
            productlist.get(productlist.size()-1).setDiscountPrice(0);
        }
        if (suma > 200){
            Product FreeKubek = (getFreekubek());
            productlist.add(FreeKubek);
        }
    }

    public double getSuma() {
        return suma;
    }
    public double getSumaRabat() {
        return sumaRabat;
    }

    public ArrayList<Product> getProductlist() {
        return productlist;
    }

    public Product getFreekubek() {
        return new Product ("1001","Kubek",0);
    }
}
