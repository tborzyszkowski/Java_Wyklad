package JavaMarkt;

public class PromotionFreeMug implements Promotion {

    public Product mug = new Product("0", "Free MUG", 0);

    @Override
    public boolean isApplicable(Cart cart) {
        if (cart.totalPriceNetto() > 200) {
            return true;
        } else return false;
    }

    @Override
    public void applyPromotion(Cart cart) {
        cart.addProduct(mug);
    }

    @Override
    public void removePromotion(Cart cart) {
        cart.removeProduct(mug);
    }
}
