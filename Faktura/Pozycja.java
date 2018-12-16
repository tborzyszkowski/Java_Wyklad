
public class Pozycja {
	private String name;
	private	int quantity;
	private double priceUnit;
	private double priceNet;
	private double tax;
	private double priceGross;

	public Pozycja(String name, int quantity, int priceUnit) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.priceUnit = priceUnit;
		this.priceNet = priceUnit*quantity;
		this.tax = priceNet*0.23;
		this.priceGross = priceNet+tax;
	}

	public String printPosition() {
		return name + ", ilość: " + quantity + ", cena jedn.: " + priceUnit + ", cena netto: "
				+ priceNet + ", podatek: " + tax + ", cena brutto: " + priceGross;
	}

	public double getPriceGross() {
		return this.priceGross;
	}
}
