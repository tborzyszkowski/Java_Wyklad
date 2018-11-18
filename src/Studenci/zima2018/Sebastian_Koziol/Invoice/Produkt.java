package fakturaVat;

public class Produkt {
	private String name;
	private int quantity;
	private double priceNetto;
	private double priceBrutto;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPriceNetto() {
		return priceNetto;
	}
	
	public void setPriceNetto(double priceNetto) {
		this.priceNetto = priceNetto;
	}
	
	public double getPriceBrutto() {
		return priceBrutto;
	}
	
	public void setPriceBrutto(double priceBrutto) {
		this.priceBrutto = priceBrutto;
	}
	
	public Produkt(String name, int quantity, double priceNetto) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.priceNetto = priceNetto * quantity;
		this.priceBrutto = this.priceNetto * 1.23;
		this.priceBrutto = Math.ceil(this.priceBrutto * 100.0)/100.0;
	}
	
	@Override
	public String toString() {
		return name + ", price Net = " + priceNetto 
				+ ", price Gross = " + priceBrutto
				+ ", quantity: " + quantity 
				+ ", per quantity - " + priceNetto/quantity;
	}
	
}