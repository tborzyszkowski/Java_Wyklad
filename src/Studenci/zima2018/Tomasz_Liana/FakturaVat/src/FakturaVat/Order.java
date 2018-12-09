package FakturaVat;

import java.util.ArrayList;
import java.util.List;

public class Order {
	List<OrderItem> ordersItems = new ArrayList<>();

	public void addProduct(Product p, int quantity) {
		ordersItems.add(new OrderItem(p, quantity));
	}

	public void showOrder() {

		for (OrderItem item : ordersItems) {
			System.out.println("Name: " + item.getProduct().getName() + 
					" PriceNet: " + item.getProduct().getPriceNet()+
					" Tax: " + item.getProduct().getTax()+
					" Quantity: " + item.getQuantity());
		}

	}

}
