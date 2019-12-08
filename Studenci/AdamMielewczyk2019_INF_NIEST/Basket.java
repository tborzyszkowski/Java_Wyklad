import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {
    List<Product> products = new ArrayList<>();

    Basket() {
    }

    public void add(Product newProduct) {
        products.add(newProduct);
        sortProductsByPriceAndName();
    }

    void delete(Product product) {
        products.remove(product);
    }

    private void promos() {
        //powrót do normalnych cen
        for(Product product : products) {
            product.setDiscountPrice(product.getPrice());
        }


        //promo

        //trzeci gratis
        if(products.size()==3)
            find( false).setDiscountPrice(0);

        double sum=0;
        for(Product product : products) {
            sum+=product.getPrice();
        }

        //kubek za ponad 200
        if(sum>200) {
            add(new Product("3748592857384", "firmowy kubek", 0));

            //rabat przy zakupach za ponad 300zl
            if (sum > 300)
                for (Product product : products) {
                    product.setDiscountPrice(product.getPrice() * 0.95);
                }
        }else
        {
            //wycofanie kubka lub uaktywnienie kuponu
            Product toRemove = null;
            for(Product product : products) {
                if(product.getCode()=="3748592857384")
                    toRemove=product;
                else if(product.getCode()=="3333333333333")
                    products.get(0).setDiscountPrice(products.get(0).getDiscountPrice() * 0.7);
            }
            if(toRemove!=null)
                products.remove(toRemove);
        }
    }

    double sum()
    {
        double finalSum=0;
        for(Product product : products) {
            finalSum+=product.getDiscountPrice();
        }
        return finalSum;
    }

    void sortProductsByPriceAndName() {
        products.sort(new SortByPriceAndName());
    }

    void sortProductsByPrice(boolean ASC) {
        if(ASC)products.sort(new SortByPriceAsc());
        else products.sort(new SortByPriceDsc());
    }

    Product find(boolean expensive) {
        return find(1, expensive).get(0);
    }

    List<Product> find(int quantity, boolean expensive) {
        sortProductsByPrice(!expensive);
        List<Product> result = new ArrayList<>();
        for(int i=0; i<quantity && i<products.size() ; i++)
            result.add(products.get(i));
        sortProductsByPriceAndName();
        return result;
    }

    @Override
    public String toString() {
        promos();
        StringBuilder temp=new StringBuilder(Product.toStringHeader());
        for(Product product : products) {
            temp.append("\n");
            String temp2=product.toString();
            temp.append(temp2);
        }
        temp.append("\nSUMMARRY: "+sum());
        return temp.toString();
    }
}
