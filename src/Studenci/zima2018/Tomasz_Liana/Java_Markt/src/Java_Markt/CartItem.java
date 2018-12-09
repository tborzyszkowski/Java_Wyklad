package Java_Markt;

public class CartItem {
	private Product product;
	private double currentPrice;
	
	public CartItem(Product product){
		this.product = product;
		this.currentPrice = product.getPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		if (! (obj instanceof CartItem))
			return false;
		
		CartItem other = (CartItem) obj;
		if (this.getProduct().equals(other.getProduct()))
			if (this.getCurrentPrice() == other.getCurrentPrice())
				return true;
			else
				return false;
		else
			return false;
	}


	@Override
	public String toString() {
		return product + "";
	}
	
	

	
	
}
