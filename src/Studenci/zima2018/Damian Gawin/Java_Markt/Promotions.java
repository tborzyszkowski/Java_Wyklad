package Market;

public interface Promotions {
    boolean CanApply(Cart cart);
    void Calculate(Cart cart);
}
