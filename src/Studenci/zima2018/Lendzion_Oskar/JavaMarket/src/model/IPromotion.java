package model;


public interface IPromotion {
	boolean CanCalculate(Cart cart);
	void CalculateOffer(Cart cart);
}