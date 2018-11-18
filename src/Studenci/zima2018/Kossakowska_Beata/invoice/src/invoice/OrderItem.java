package invoice;

public class OrderItem {
	private int quantity;
	private Product product;

	public OrderItem(Product product, int quantity) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double netPrice() {
		return product.getPriceNet() * quantity;
	}

	public double priceGross() {
		double grossPrice = netPrice() * product.getTax();
		return grossPrice;
	}

}
