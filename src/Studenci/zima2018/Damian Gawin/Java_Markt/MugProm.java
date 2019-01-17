package Market;

public class MugProm implements Promotions {
    @Override
    public boolean CanApply(Cart cart){
        double price = cart.getTotalPrice();
        if(price >= 200)
            return true;
        else
            return  false;
    }

    @Override
    public void Calculate(Cart cart) {
        if(this.CanApply(cart))
                cart.addProduct(new Product("Happy Mug", 0.0001));
    }

    @Override
    public String toString() {
        return "Mug Promotion";
    }
}
