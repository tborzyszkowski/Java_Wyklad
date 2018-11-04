import java.util.ArrayList;

@SuppressWarnings("WeakerAccess")
public class Cart {
    private ArrayList<CartItem> items = new ArrayList<>();
    private ArrayList<ICanCalculateSpecialOffer> promotions = new ArrayList<>();
    public double totalPrice;

    Cart() {
    }

    public Cart addProduct(Product product) {
        items.add(new CartItem(product));
        totalPrice += product.getPrice();
        sortCart();
        return this;
    }

    public void removeProduct(Product product) {
        items.remove(new CartItem(product));
        totalPrice -= product.getPrice();
    }

    public Cart addPromotion(ICanCalculateSpecialOffer offer) {
        this.promotions.add(offer);
        return this;
    }

    public Cart removePromotion(ICanCalculateSpecialOffer offer) {
        for (int i = 0; i < promotions.size(); i++) {
            if (promotions.get(i).toString().equals(offer.toString())) {
                promotions.remove(i);
                return this;
            }
        }

        return this;
    }

    public void applyPromotions() {
        for (ICanCalculateSpecialOffer promotion : promotions){
            promotion.CalculateOffer(this);
        }
    }

    public double totalPriceOfProducts() {
        double sum = 0;

        for (CartItem item : items) {
            sum += item.getProduct().getPrice();
        }

        return Math.round(sum * 100.0) / 100.0;
    }

    public double totalPriceOfDiscountedProducts(){
        double sum = 0;
        for(CartItem item : items)
            sum += item.getDiscountPrice();

        return Math.round(sum * 100.0) / 100.0;
    }

    public void sortCart() {
        items.sort((CartItem items1, CartItem items2) -> {
            if (items1.getProduct().getPrice() == items2.getProduct().getPrice()) {
                return items1.getProduct().getName().compareTo(items2.getProduct().getName());
            } else if (items1.getProduct().getPrice() > items2.getProduct().getPrice()) {
                return -1;
            } else {
                return 1;
            }
        });
    }

    public void printTheCheapest() {
        System.out.println("\nThe cheapest product is ");
        items.get(items.size() - 1).printProductName();
    }

    public void printTheMostExpensive() {
        System.out.println("\nThe most expensive product is ");
        items.get(0).printProductName();
    }

    public void printTheCheapestN(int n) {
        System.out.println("\nList of the cheapest " + n + " products");
        for (int i = 0; i < n; i++) items.get(items.size() - 1 - i).printProductName();
    }

    public void printTheMostExpensiveN(int n) {
        System.out.println("\nList of the most expensive " + n + " products");
        for (int i = 0; i < n; i++) items.get(i).printProductName();
    }

    boolean cupAdded(Cart cart) {
        boolean isAdded = false;
        for(CartItem item : cart.getItems()) {
            if (item.getProduct().getName().equals("Free cup")) {
                isAdded = true;
            }
        }
        return isAdded;
    }

    public int getQtyOfProducts() {
        if (cupAdded(this)) return this.items.size() - 1;
        else return this.items.size();
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "\nCart{" +
                "items=" + items +
                ", promotions=" + promotions +
                ", totalPrice=" + totalPriceOfProducts() +
                ", totalDiscountedPrice=" + totalPriceOfDiscountedProducts() +
                '}';
    }
}