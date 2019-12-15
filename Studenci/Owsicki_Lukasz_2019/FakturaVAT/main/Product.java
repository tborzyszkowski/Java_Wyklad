package main;

public class Product {

	private String productName;
	private double netPrice = 0;
	private double vat = 0;
	private int quantity = 0;
	private double quantityNetPrice = 0;
	private double sumGross = 0;

	// Produkt nazwa, cena netto, vat
	public Product(String productName, double netPrice, double vat, int quantity) {
		this.productName = productName;
		this.netPrice = netPrice;
		this.vat = vat;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getQuantityNETPrice() {
		return quantityNetPrice;
	}

	public void setQuantityNETPrice() {
		this.quantityNetPrice = getQuantity() * getNetPrice();
	}

	public double getSumGross() {
		return sumGross;
	}
	
	// cena brutto pozycji
	public void setSumGross() {
		this.sumGross = getQuantity() * getVat();
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", netPrice=" + netPrice + ", vat=" + vat + ", quantity="
				+ quantity + ", quantityNetPrice=" + quantityNetPrice + ", sumGross=" + sumGross + "]";
	}

}