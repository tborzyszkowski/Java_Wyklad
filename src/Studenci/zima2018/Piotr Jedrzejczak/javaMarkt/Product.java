package lab2.javaMarkt;

public class Product{
	
	private String code;
	private String name;
	private double price;
	
	public Product() {
	}
	
	public Product(String code, String name, double price) {
		
		this.code = code;
		this.name = name;
		this.price = price;
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
		return " (" + code + " ," + name + " ," + price + ")\n";
	}
	
	
}
