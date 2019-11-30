import java.util.ArrayList;
import java.util.Collections;

public class Koszyk {


    private ArrayList<Product> itemList;
    private double totalPrice;
    private boolean isKubek = false;
    private boolean isDiscountUsed = false;


    public Koszyk() {
        this.itemList = new ArrayList<Product>();
    }

    public void addItem(Product product) {

        this.itemList.add(product);
        Collections.sort(this.itemList);

    }

    public void checkDiscounts() {

        if (this.itemList.size() == 3) {
            Product gratis = findMinPrice();
            gratis.setPrice(0.00);
        }

        if (this.countTotalPrice() >= 200) {
            this.isKubek = true;

            if (this.countTotalPrice() >= 300) {
                this.totalPrice = this.totalPrice * 0.95;
            }
        }
    }

    public Product findMaxPrice() {
        double max = 0;
        Product maxItem = this.itemList.get(0);
        for(Product i : this.itemList) {
            if (i.getPrice() > max) {
                max = i.getPrice();
                maxItem = i;
            }
        }
        return maxItem;
    }


    public Product findMaxPrice(ArrayList<Product> list) {
        double max = 0;
        Product maxItem = this.itemList.get(0);
        for(Product i : list) {
            if (i.getPrice() > max) {
                max = i.getPrice();
                maxItem = i;
            }
        }
        return maxItem;
    }

    public ArrayList<Product> findMaxPrice(int n) {

        ArrayList<Product> itemListCopy = (ArrayList<Product>) this.itemList.clone();
        ArrayList<Product> nMaxPrices = new ArrayList<>();

        if (n > itemListCopy.size()) {
            return this.itemList;
        } else {
            while (nMaxPrices.size() < n) {
                Product item = findMaxPrice(itemListCopy);
                nMaxPrices.add(item);
                itemListCopy.remove(item);
            }
            return nMaxPrices;
        }
    }

    public Product findMinPrice() {

        double min = this.itemList.get(0).getPrice();
        Product minItem = this.itemList.get(0);

        for (Product i : this.itemList) {
            if (i.getPrice() < min) {
                min = i.getPrice();
                minItem = i;
            }
        }
        return minItem;
    }

    public Product findMinPrice(ArrayList<Product> list) {

        double min = list.get(0).getPrice();
        Product minItem = list.get(0);

        for(Product i : list) {
            if (i.getPrice() < min) {
                min = i.getPrice();
                minItem = i;
            }
        }
        return minItem;
    }

    public ArrayList<Product> findMinPrice(int n) {

        ArrayList<Product> itemListCopy = (ArrayList<Product>) this.itemList.clone();
        ArrayList<Product> nMinPrices = new ArrayList<>();

        if (n > itemListCopy.size()) {
            return this.itemList;
        } else {
            while (nMinPrices.size() < n) {
                Product item = findMinPrice(itemListCopy);
                nMinPrices.add(item);
                itemListCopy.remove(item);
            }
            return nMinPrices;
        }

    }

    public void sortByName() {
        Collections.sort(this.itemList, new NameComparator());
    }

    public void sortByPrice() {
        Collections.sort(this.itemList, new NameComparator());
    }

    public double countTotalPrice() {

        this.totalPrice = 0;

        for (Product i : this.itemList) {
            this.totalPrice += i.getPrice();
        }

        return this.totalPrice;
    }

    public void useDiscount(Product p) {

        if (this.isDiscountUsed) {
            System.out.println("Nie można użyć ponownie wykorzystanego rabatu!");
        } else {
            this.isDiscountUsed = true;
            p.addDiscount(30);
            System.out.println("30% zniżki na produkt " + p.getName());
            countTotalPrice();
        }
    }

    @Override
    public String toString() {

        StringBuilder lista = new StringBuilder();

        for (Product produkt : this.itemList) {
            System.out.println(produkt.toString());
        }

        lista.append("Razem: " + String.format("%.2f", countTotalPrice()) +
                " zł\n");

        if (this.isKubek == true) {
            lista.append("Kubek GRATIS!\n");
        }

        return lista.toString();
    }

}


