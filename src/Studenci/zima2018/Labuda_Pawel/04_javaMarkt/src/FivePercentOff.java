public class FivePercentOff implements ICanCalculateSpecialOffer {
    @Override
    public boolean CanCalculate(Cart cart) {
        return cart.totalPriceOfProducts() >= 300;
    }

    @Override
    public void CalculateOffer(Cart cart) {
        if (this.CanCalculate(cart)) {
            for (CartItem item : cart.getItems()) {
                item.setDiscountPrice(item.getProduct().getPrice() * 0.95);
            }
        }
    }

    @Override
    public String toString() {
        return "5% off";
    }
}
