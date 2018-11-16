package faktura;

public class Product {

	private String name;
	private double netPrize;
	public double tax;
	private int quantity;
	
	public Product(String name, double netPrize, int quantity) {
		this.name = name;
		this.netPrize = netPrize;
		this.tax = netPrize * 0.23;
		this.quantity = quantity;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetPrize() {
		return netPrize;
	}

	public void setNetPrize(double netPrize) {
		this.netPrize = netPrize;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public double calcTotalGross() {
		return (netPrize + tax) * quantity;
	}
	
	
	
	
	

	
	
}
