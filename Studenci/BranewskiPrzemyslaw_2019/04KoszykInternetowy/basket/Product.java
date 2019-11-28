package basket;

public class Product {

	private String code;
	private String name;
	private double price;
	private double discountPrice;
	
	
	public Product(String code, String name, double price, double discountPrice)
	{
		setProduct(code, name, price, discountPrice);
	}
	
	public Product(Product product)
	{
		this(product.getCode(), product.getName(), product.getPrice(), product.getDiscountPrice());
	}
	
	
	public String getCode()
	{
		return this.code;
	}
	
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getDiscountPrice()
	{
		return this.discountPrice;
	}
	
	public void setDiscountPrice(double discountPrice)
	{
		this.discountPrice = discountPrice;
	}
	
	public void setProduct(String code, String name, double price, double discountPrice)
	{
		setCode(code);
		setName(name);
		setPrice(price);
		setDiscountPrice(discountPrice);
	}
	
	@Override
	public String toString()
	{
		return "------------------------------------------" +
				"\n\tKod: " + getCode() + "\t|\tNazwa: " + getName() +
				"\n-----------------------------------------" +
				"\n\tCena: " + getPrice() + "\t|\tCena po rabacie: " + 
				getDiscountPrice() + "\n";
	}
}
