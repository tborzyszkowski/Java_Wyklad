package JavaMarkt.Modele;

public class CupPromotion implements IPromotion{
    @Override
    public boolean CalculatePromotion(Basket basket){
        if (basket.totalBruttoPrice() >= 50)
            return true;
        else return false;
    }

    @Override
    public void PromotionOffert(Basket basket){
        if(this.CalculatePromotion(basket))
            basket.addProduct((new Product("Kubek firmowy",0.1, 0)),1);
    }

    @Override
    public String toString() {
        return "Kubek promocyjny";
    }
}
