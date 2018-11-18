
public class Product {
	private String name;
	private double price;
	private String code;

	public Product(String name, double price, String code) {
		this.name = name;
		this.price = price;
		this.code = code;

	}

	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {

		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", code=" + code + "]";
	}

}
