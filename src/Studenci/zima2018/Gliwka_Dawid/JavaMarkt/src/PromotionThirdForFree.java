package JavaMarkt;

public class PromotionThirdForFree implements Promotion{
    @Override
    public boolean isApplicable(Cart cart) {
        if(cart.getProducts().size() == 3){
            return true;
        }
        else return false;
    }

    @Override
    public void applyPromotion(Cart cart) {
        cart.getCheapest().setDiscountPrice(0);
    }

    @Override
    public void removePromotion(Cart cart) {
        cart.getCheapest().setDiscountPrice(cart.getCheapest().getPriceNetto());
    }
}
