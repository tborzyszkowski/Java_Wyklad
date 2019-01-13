package Market;

public class thirdFreeProm implements Promotions{
    @Override
    public boolean CanApply(Cart cart){
        if(cart.items.size() > 2)
            return true;
        else
            return false;
    }

    @Override
    public void Calculate(Cart cart) {
        if(this.CanApply(cart)){
            cart.mostCheap().setDiscountPrice(0);
            cart.getTotalPriceDiscount();
        }
    }

    @Override
    public String toString() {
        return "Promotion 3rd Free";
    }
}
