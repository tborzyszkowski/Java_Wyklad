package JavaMarkt.Modele;

public class ProductPromotion implements IPromotion {

    public void getFromBascet(Basket basket){
        basket.products.get(2);
    }

    @Override
    public boolean CalculatePromotion(Basket basket){
        if (basket.products.size() >= 3)
            return true;
        else return false;
    }
    @Override
    public void PromotionOffert(Basket basket){
        int size = basket.products.size();
        boolean isCup = false;
        for(ProductData it : basket.products) {
            if (it.getProductName().equals("Kubek firmowy")) {
                isCup = true;
            }
        }
        if (this.CalculatePromotion(basket) && isCup)
            basket.productPrice = basket.productPrice - basket.products.get(size-2).getTotalBruttoPrice();
        if (this.CalculatePromotion(basket))
            basket.productPrice = basket.productPrice - basket.products.get(size-1).getTotalBruttoPrice();
    }

    @Override
    public String toString() {
        return "Trzeci produkt gratis";
    }
}