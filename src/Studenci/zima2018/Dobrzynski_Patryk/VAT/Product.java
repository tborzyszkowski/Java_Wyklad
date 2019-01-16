package VAT;

public class Product {
	
	public String productName;
	public int quantity;
	public double tax = 0.23;
	public double brutto;
	public double netto;
	public double totalNetto;
	public double totalBrutto;
	
	public double getTotalBrutto() {
		totalBrutto = brutto * quantity;
		return totalBrutto;
	}
	public double totalBrutto(double totalBrutto) {
		totalBrutto =+ totalBrutto;
		return totalBrutto;
	}
	public void setTotalBrutto(double totalBrutto) {
		this.totalBrutto = totalBrutto;
	}	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getNetto() {
		netto = brutto - (tax * brutto);
		return netto;
	}
	public void setNetto(int netto) {
		this.netto = netto;
	}
	public double getTotalNetto() {
		totalNetto = netto * quantity;
		return totalNetto;
	}
	public void setTotalNetto(double totalNetto) {
		this.totalNetto = totalNetto;
	}
	public double getTax() {
		return tax;
	}
	public void setTax() {
		this.tax = tax;
	}
	public double getBrutto() {
		return brutto;
	}
	public void setBrutto(int brutto) {
		this.brutto = brutto;
	}
	
	
	@Override
	public String toString() {
		return "Dane do faktury: [productName= " + productName + ", quantity= " + quantity + ", netto= " + netto + ", totalNetto= "
				+ totalNetto + ", tax= " + tax + ", brutto= " + brutto + ", totalBrutto= " + totalBrutto + "]";
	}
	
}
