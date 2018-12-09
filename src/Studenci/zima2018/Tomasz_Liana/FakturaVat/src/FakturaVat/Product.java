package FakturaVat;



public class Product {

	private String name;
	private double priceNet;
	private double tax;

	public Product(String name, double priceNet, double tax) {
		super();
		this.name = name;
		this.priceNet = priceNet;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPriceNet() {
		return priceNet;
	}

	public void setPriceNet(double priceNet) {
		this.priceNet = priceNet;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}