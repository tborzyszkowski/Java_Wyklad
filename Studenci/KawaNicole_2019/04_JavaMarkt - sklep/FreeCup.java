public class FreeCup implements ICanCalculateSpecialOffer {
    @Override
    public boolean CanCalculate(Cart cart) {
        return cart.totalPriceOfProducts() > 200;
    }

    private boolean cupAdded(Cart cart) {
        boolean isAdded = false;
        for(CartItem item : cart.getItems()) {
            if (item.getProdukt().getName().equals("Free cup")) {
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public void CalculateOffer(Cart cart) {
        if (this.CanCalculate(cart) && !this.cupAdded(cart))
            cart.addProdukt(new Produkt("999","Free cup", 0.01));
        else if (this.cupAdded(cart)) {
            cart.removeProdukt(new Produkt("999","Free cup", 0.01));
        }
    }

    @Override
    public String toString() {
         return "Free cup";
    }
}
