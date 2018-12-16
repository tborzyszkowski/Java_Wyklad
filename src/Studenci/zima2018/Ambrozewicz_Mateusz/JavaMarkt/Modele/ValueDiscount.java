package JavaMarkt.Modele;

public class ValueDiscount implements IPromotion {
    @Override
    public boolean CalculatePromotion(Basket basket){
        if (basket.totalBruttoPrice() >= 300)
            return true;
        else return false;
    }

    @Override
    public void PromotionOffert(Basket basket){
        if (CalculatePromotion(basket))
            basket.productPrice = basket.totalBruttoPrice() * 0.95;
    }

    @Override
    public String toString() {
        return "Promocja - 5%";
    }
}
