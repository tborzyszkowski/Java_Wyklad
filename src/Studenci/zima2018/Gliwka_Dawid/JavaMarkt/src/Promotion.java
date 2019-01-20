package JavaMarkt;

public interface Promotion {
    boolean isApplicable(Cart cart);

    void applyPromotion(Cart cart);

    void removePromotion(Cart cart);
}
