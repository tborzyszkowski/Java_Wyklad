public class FreeProduct implements ICanCalculateSpecialOffer {
    @Override
    public boolean CanCalculate(Cart cart) {
        return cart.getQtyOfProducts() > 2;
    }

    @Override
    public void CalculateOffer(Cart cart) {
        if (this.CanCalculate(cart)) {
            int qtyOfFreeProducts = cart.getQtyOfProducts() / 3;
            for (int i = 0; i < qtyOfFreeProducts; i++) cart.getItems().get(cart.getQtyOfProducts() - 1 - i).setDiscountPrice(0);
        }
    }

    @Override
    public String toString() {
        return "Free product/products";
    }
}
