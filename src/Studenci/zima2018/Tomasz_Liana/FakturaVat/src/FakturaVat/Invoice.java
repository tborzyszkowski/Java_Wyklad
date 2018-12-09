package FakturaVat;

import java.time.Instant;

public class Invoice {
	private Instant dateOfInvoice;
	private Instant dateSale;
	private Instant datePayment;
	private Customer customer;
	private Order order;
	private int numberInvoice;

	public Invoice(int numberInvoice, Customer customer, Order order, Instant dateOfInvoice) {
		this.dateOfInvoice = dateOfInvoice;
		this.customer = customer;
		this.order = order;
		this.numberInvoice = numberInvoice;

	}

	public Instant getDateOfInvoice() {
		return dateOfInvoice;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Order getOrder() {
		return order;
	}

	public Instant getDateSale() {
		return dateSale;
	}

	public void setDateSale(Instant dateSale) {
		this.dateSale = dateSale;
	}

	public Instant getDatePayment() {
		return datePayment;
	}

	public void setDatePayment(Instant datePayment) {
		this.datePayment = datePayment;
	}

	public double totalPrice() {
		double suma = 0;
		for (OrderItem item : order.ordersItems) {
			suma += item.priceGross();

		}
		return suma;
	}

	public void showInvoice() {
		System.out.println("dateOfInvoice: " + dateOfInvoice + ", dateSale : " + dateSale + ", datePayment: "
				+ datePayment + ", numberInvoice: " + numberInvoice);
	}

}