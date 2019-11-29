import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Koszyk {
    private List<Product> list = new ArrayList<Product>();

    public Koszyk(Product prod) {
        list.add(prod);
    }

    public Koszyk(List<Product> fList) {
        list.addAll(fList);
    }

    public Koszyk() { }

    public void addProduct(Product prod) {
        list.add(prod);
    }

    public List<Product> getList() {
        return list;
    }

    public Product getLastProduct() {
        return list.get(list.size()-1);
    }

    public Product getXproduct(int x) {
        return list.get(x-1);
    }

    public Product getCheapest() {
        sortKoszykAscending();
        return list.get(0);
    }

    public List<Product> getCheapest(int n) {
        sortKoszykAscending();
        return list.subList(0,n);
    }

    public Product getMexpensive() {
        sortKoszykDescending();
        return list.get(0);
    }

    public List<Product> getMexpensive(int n) {
        sortKoszykDescending();
        return list.subList(0, n);
    }

    public void sortKoszykDescending() {
        Collections.sort(list, new SorterDescending());
    }

    public void sortKoszykAscending() {
        Collections.sort(list, new SorterAscending());
    }

    public double sumPrice() {
        double sum = 0;
        for (Product x : list)
            sum += x.getPrice();
        return sum;
    }

     public double sumDiscountedPrice() {
        double sum = 0;
        for (Product x : list)
            sum += x.getDiscountPrice();
        return sum;
     }

     public void discount300() {
        if (sumPrice() > 300)
            for(Product x : list)
                x.setDiscountPrice(x.getDiscountPrice() * 0.95);
     }

     public void discount3for2() {
        sortKoszykAscending();
        int s = list.size() % 3;
        for (int x = 0; x < s; x++)
            list.get(x).setDiscountPrice(0);
     }

     public void kubekGratis() {
        if (sumPrice() > 200)
            addProduct(new Product("FFFF1111","Firmowy Kubek",0));
     }

     public void kuponRabatowy(Product prod) {
        for (int x = 0; x < list.size(); x++)
            if(list.get(x) == prod) {
                list.get(x).setDiscountPrice(list.get(x).getPrice() * 0.7);
            }
     }

    public void showList() {
        for (Product x : list) {
            System.out.println(x.getCode() + "   " + x.getName() + "   " + x.getPrice() + "   " + x.getDiscountPrice());
        }
    }

}
