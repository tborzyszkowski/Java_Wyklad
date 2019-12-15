public class CartItem {
    private Product produkt;
    private double discountPrice;

    private CartItem() {
    }

    public void printAddToCart() {
        System.out.println("Add to cart " + produkt);
    }

    CartItem(Produkt produkt) {
        this();
        this.product = produkt;
        this.discountPrice = product.getPrice();

        this.printAddToCart();
    }

    public Produkt getProdukt() {
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
        if (this.getProdukt().equals(other.getProdukt())) return this.getDiscountPrice() == other.getDiscountPrice();
        else return false;
    }

    @Override
    public String toString() {
        return "\n\tCartItem{" +
                "produkt=" + produkt +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
