package FakturaVat;

import java.time.Instant;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("Telefon", 1000, 0.08);
		Product p2 = new Product("Ksiazka", 100.1, 0.13);

		Order order1 = new Order();
		Order order2 = new Order();
		order1.addProduct(p1, 2);
		order1.addProduct(p2, 4);

		Customer c1 = new Customer("AZ", "Gdansk", "Lema 6"," 80-126 ","555555555", "34123412312312");
		

		Invoice invoice1 = new Invoice(1, c1, order1, Instant.now());
		invoice1.setDatePayment(Instant.parse("2017-11-10T10:42:55.034Z"));
		invoice1.setDateSale(Instant.parse("2017-11-10T10:42:55.034Z"));

		
		showAllData(invoice1);
	}

	public static void showAllData(Invoice invoice) {
		invoice.showInvoice();
		invoice.getCustomer().showCustomer();
		invoice.getOrder().showOrder();

	}

}