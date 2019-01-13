package Market;

public class FivePercentPromotion implements Promotions{

    @Override
    public boolean CanApply(Cart cart){
        double price;
        if(cart.getTotalPriceDiscount() == 0)
            price = cart.getTotalPrice();
        else
            price = cart.getTotalPriceDiscount();
        if(price >= 300)
            return true;
        else
            return  false;
    }

    @Override
    public void Calculate(Cart cart) {
        if(this.CanApply(cart)){
            for(Product p: cart.items)
                p.setDiscountPrice(p.getPrice() * 0.95);
        }
    }

    @Override
    public String toString() {
        return "Promotion 5%";
    }
}
