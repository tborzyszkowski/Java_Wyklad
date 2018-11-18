package invoice;

import java.time.Instant;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("cos1", 1.1, 0.08);
		Product p2 = new Product("cos2", 100.1, 0.13);

		Order order1 = new Order();
		order1.addProduct(p1, 2);
		order1.addProduct(p2, 4);

		Customer c1 = new Customer("AZ", "a", "a", "a");
		Customer c2 = new Customer("BZ", "b", "b", "b");

		Invoice invoice1 = new Invoice(1, c1, order1, Instant.now());

		showAllData(invoice1);

	}

	public static void showAllData(Invoice invoice) {
		invoice.showInvoice();
		invoice.getCustomer().showCustomer();
		invoice.getOrder().showOrder();
	}

}
