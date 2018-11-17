package fakturaVat;

public class PozycjaFV {
	private Produkt produkt;
	private int quantity;
	private double currentPriceNetto;
	private double currentPriceBrutto;
	
	public PozycjaFV(Produkt produkt){
		this.produkt = produkt;
		this.quantity = (int) produkt.getQuantity();
		this.currentPriceNetto = produkt.getPriceNetto();
		this.currentPriceBrutto = produkt.getPriceBrutto();
	}

	public Produkt getProdukt() {
		return produkt;
	}

	public void setProdukt(Produkt product) {
		this.produkt = product;
	}

	public double getQuantity() {
		return currentPriceNetto;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCurrentPriceNetto() {
		return currentPriceNetto;
	}

	public void setCurrentPriceNetto(double currentPriceNetto) {
		this.currentPriceNetto = currentPriceNetto;
	}

	public double getCurrentPriceBrutto() {
		return currentPriceBrutto;
	}

	public void setCurrentPriceBrutto(double currentPriceBrutto) {
		this.currentPriceBrutto = currentPriceBrutto;
	}

	@Override
	public String toString() {
		return "Nazwa" + produkt.getName() 
			+ " - quantity, price Netto and Brutto: " 
			+ quantity + " " + currentPriceNetto + ", " + currentPriceBrutto;
	}

}