import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Cart {
    private SortedList<Product> list;
    private ArrayList<String> voucherList;
    private double sum;
    private double discountSum;

    public ArrayList<String> getVoucherList() {
        return voucherList;
    }

    public Cart() {
        this.list = new SortedList<Product>();
        this.voucherList = new ArrayList<String>();
    }

    public SortedList<Product> getList() {
        return list;
    }

    public void addToCart(Product product) {
        this.list.add(product);
    }

    public void addVoucher(String voucher) {
        this.voucherList.add(voucher);
    }


    public Product getLowestPrice() {
        return this.list.get(0);
    }

    public Product getHighestPrice() {
        return this.list.get(list.size() - 1);
    }

    public List<Product> getNLowestPrices(int n) {
        try {
            return this.list.subList(0, n);
        } catch (Exception IndexOutOfBoundsException) {

            throw new IllegalArgumentException("Wrong index");
        }
    }
    public List<Product> getNHighestPrices(int n) {
        try {
        return this.list.subList(list.size() - n - 1, list.size() - 1);
        }
        catch (Exception IndexOutOfBoundsException)
        {
            throw new IllegalArgumentException("Wrong index");
        }
    }

    public double getSum() {
        this.countSum();
        return sum;
    }

    public void countSum() {
        for (Product p : list) {
            sum += p.getPrice();
        }
    }

    public double getDiscountSum() {
        this.countDiscountSum();
        return discountSum;
    }

    public void countDiscountSum() {
        for (Product p : list) {
            discountSum += p.getDiscountPrice();
        }
    }

    public void viewInfo() {
        for (Product p : list) {
            System.out.println(p);
        }

    }


    public void voucher(Product p, String voucher) {
        if (voucherList.contains(voucher)) {
            p.setDiscountPrice(p.getPrice() * 0.7);
            p.setDiscounted(true);
            voucherList.remove(voucher);
        }
    }

    public void discounter() {
        Product cup = new Product("2342", "SuperCup", 0);
        if (getList().size() == 3) {
            getLowestPrice().setDiscountPrice(0);
            getLowestPrice().setDiscounted(true);
        }
        if (getSum() > 200) {
            addToCart(cup);
        }
        if (getSum() > 300) {
            for (Product p : getList()) {
                if (!p.isDiscounted()) {
                    {
                        p.setDiscountPrice(p.getPrice() * 0.95);
                        p.setDiscounted(true);
                    }
                }
            }


        }
    }


    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setDiscountSum(double discountSum) {
        this.discountSum = discountSum;
    }
}