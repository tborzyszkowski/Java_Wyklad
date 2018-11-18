package JavaMarkt.JavaMarkt2;

public interface IPromotion {
	boolean CanCalculate(Cart cart);
	void CalculateOffer(Cart cart);
}