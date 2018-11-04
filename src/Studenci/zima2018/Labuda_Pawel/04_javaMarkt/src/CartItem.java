@SuppressWarnings("WeakerAccess")
public class CartItem {
    private Product product;
    private double discountPrice;

    private CartItem() {
    }

    public void printAddToCart() {
        System.out.println("Add to cart " + product);
    }

    CartItem(Product product) {
        this();
        this.product = product;
        this.discountPrice = product.getPrice();

        this.printAddToCart();
    }

    public Product getProduct() {
        return product;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = Math.round(discountPrice * 100.0) / 100.0;
    }

    public void printProductName() {
        System.out.println(product.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        if (! (obj instanceof CartItem)) return false;

        CartItem other = (CartItem) obj;
        if (this.getProduct().equals(other.getProduct())) return this.getDiscountPrice() == other.getDiscountPrice();
        else return false;
    }

    @Override
    public String toString() {
        return "\n\tCartItem{" +
                "product=" + product +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
