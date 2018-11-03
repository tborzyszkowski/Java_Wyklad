package Laboratorium.JavaMarkt.model;

import Laboratorium.Geometria.Punkt;

public class Product {
	private String name;
	private double price;
	
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

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		if (! (obj instanceof Product))
			return false;
		
		Product other = (Product) obj;
		if (this.getName() == other.getName())
			if (this.getPrice() == other.getPrice())
				return true;
			else
				return false;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Product( " + name + ", " + price + " )";
	}
	
}
