
public class Product {
	String code;
	String name;
	double price;
	double discountPrice;
	Product(String code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.discountPrice = price;
	}
}
