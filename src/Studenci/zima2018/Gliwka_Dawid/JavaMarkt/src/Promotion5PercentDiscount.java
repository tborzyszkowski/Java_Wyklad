package JavaMarkt;

public class Promotion5PercentDiscount implements Promotion {
    @Override
    public boolean isApplicable(Cart cart) {
        if (cart.totalPriceNetto() > 300) {
            return true;
        } else return false;
    }

    @Override
    public void applyPromotion(Cart cart) {
        for (Product product : cart.getProducts()) {
            product.setDiscountPrice(product.getDiscountPrice() * 0.95);
        }
    }
    @Override
    public void removePromotion(Cart cart) {
        for (Product product : cart.getProducts()) {
            product.setDiscountPrice(product.getDiscountPrice() / 0.95);
        }
    }

}

