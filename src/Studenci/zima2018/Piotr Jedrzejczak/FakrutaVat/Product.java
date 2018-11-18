package lab3.FakrutaVat;

public class Product{
	
	
	private String name;
	private double net_price = 0;
	private double vat_percent = 1.23;
	
	public Product(String name, double price, double vat_percent) {
		
		this.name = name;
		this.net_price = price;
		this.vat_percent = vat_percent;
		
	}
	public double getVat_percent() {
		return vat_percent;
	}

	public void setVat_percent(double vat_percent) {
		this.vat_percent = vat_percent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetPrice() {
		return net_price;
	}

	public void setPrice(double price) {
		this.net_price = price;
	}

	@Override
	public String toString() {
		return " (" + name + " ," + net_price + ")\n";
	}
	
	
}

