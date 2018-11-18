package lab3.FakrutaVat;

public class InvoiceItem {
	
	private int quantity;
	private double net_value;
	private double net_price;
	private double gross_value;
	private double tax;
	private String name;
	
	public InvoiceItem(Product p, int quantity) {
		
		this.quantity = quantity;
		this.name = p.getName();
		this.net_price = p.getNetPrice();
		this.net_value = p.getNetPrice() * quantity;
		this.gross_value = net_value * p.getVat_percent();
		this.tax = gross_value - net_value;
				
	}
	
	public double getGrossValue() {
		return gross_value;
	}

	@Override
	public String toString() {
		return String.format("|  %11s  |  %6d szt.  |  %10.2f,-  |  %10.2f,-  |  %7.2f,-  |  %10.2f,-  |", name, quantity, net_value, net_price, tax, gross_value);
	}
	
	
		
}
