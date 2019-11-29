package basket;

import java.util.*;

public class ShoppingBasket {
	

	private ArrayList<Product> basket = new ArrayList<>();
	
	
	public void addToShoppingBasket(Product toAdd)
	{
		this.basket.add(toAdd);
	}
	
	
	public Product getProductFromShoppingBasketByPosition(int i)
	{
		if(this.basket.isEmpty() || i >= this.basket.size())
			return null;
		else
			return this.basket.get(i);
	}
	
	
	public int getPositionOfProductInShoppingBasket(Product toGet)
	{
		int i = -1;
		if(!this.basket.isEmpty())
		{
			for(Product product : this.basket)
			{
				if(toGet.getCode() == product.getCode())
				{
					i = this.basket.indexOf(toGet);
					return i;
				}
			}
		}
		return i;
	}
	
	
	public void removeProductFromShoppingBasketByPosition(int i)
	{
		if(!this.basket.isEmpty() && i < this.basket.size())
			this.basket.remove(i);
	}
	
	
	public void removeProductFromShoppingBasketByProduct(Product toRemove)
	{
		if(!this.basket.isEmpty() && this.basket.contains(toRemove))
			this.basket.remove(toRemove);
	}
	
	
	public Product findTheCheapestOne()
	{
		Product var = null;
		if(!this.basket.isEmpty())
		{
			var = this.basket.get(0);
			for(int i = 0; i < this.basket.size(); i++)
			{
				if(var.getPrice() > this.basket.get(i).getPrice())
				{
					var = this.basket.get(i);
				}
			}
			return var;
		}
		else
			return var;
	}
	
	
	public Product findTheMostExpensiveOne()
	{
		Product var = null;
		if(!this.basket.isEmpty())
		{
			var = this.basket.get(0);
			for(int i = 0; i < this.basket.size(); i++)
			{
				if(var.getPrice() < this.basket.get(i).getPrice())
				{
					var = this.basket.get(i);
				}
			}
			return var;
		}
		else
			return var;
	}
	
	
	public ArrayList<Product> findNTheCheapestOnes(int n)
	{
		ArrayList<Product> outcome = new ArrayList<>();
		ArrayList<Product> backup = new ArrayList<>(this.basket);
		Product var = null;
		if(n >= this.basket.size())
		{
			while(!this.basket.isEmpty())
			{
				var = findTheCheapestOne();
				outcome.add(var);
				this.basket.remove(var);
			}
		}
		else
		{
			while(n > 0)
			{
				var = findTheCheapestOne();
				outcome.add(var);
				this.basket.remove(var);
				n--;
			}
		}
		this.basket = backup;
		return outcome;
	}
	
	
	public ArrayList<Product> findNTheMostExpensiveOnes(int n)
	{
		ArrayList<Product> outcome = new ArrayList<>();
		ArrayList<Product> backup = new ArrayList<>(this.basket);
		Product var = null;
		if(n >= this.basket.size())
		{
			while(!this.basket.isEmpty())
			{
				var = findTheMostExpensiveOne();
				outcome.add(var);
				this.basket.remove(var);
			}
		}
		else
		{
			while(n > 0)
			{
				var = findTheMostExpensiveOne();
				outcome.add(var);
				this.basket.remove(var);
				n--;
			}
		}
		this.basket = backup;
		return outcome;
	}
	
	
	public void sortShoppingBasketByPriceAscending()
	{
		int n = this.basket.size();
		if(n > 0)
		{
			ArrayList<Product> outcome = findNTheCheapestOnes(n);
			this.basket = outcome;
		}
	}
	
	
	public void sortShoppingBasketByPriceDescending()
	{
		int n = this.basket.size();
		if(n > 0)
		{
			ArrayList<Product> outcome = findNTheMostExpensiveOnes(n);
			this.basket = outcome;
		}
	}
	
	
	public void sortShoppingBasketByNameAscending()
	{
		ArrayList<Product> outcome = new ArrayList<>();
		Product var = null;
		if(this.basket.size() > 0)
		{
			while(!this.basket.isEmpty())
			{
				var = this.basket.get(0);
				for(Product product : this.basket)
				{
					if(var.getName().toLowerCase().compareTo(product.getName().toLowerCase())>0)
						var = product;
				}
				outcome.add(var);
				this.basket.remove(var);
			}
		}
		this.basket = outcome;
	}
	
	
	public void sortShoppingBasketByNameDescending()
	{
		ArrayList<Product> outcome = new ArrayList<>();
		Product var = null;
		if(this.basket.size() > 0)
		{
			while(!this.basket.isEmpty())
			{
				var = this.basket.get(0);
				for(Product product : this.basket)
				{
					if(var.getName().toLowerCase().compareTo(product.getName().toLowerCase()) < 0)
						var = product;
				}
				outcome.add(var);
				this.basket.remove(var);
			}
		}
		this.basket = outcome;
	}
	
	
	public void defaultSortShoppingBasket()
	{
		sortShoppingBasketByNameAscending();
		sortShoppingBasketByPriceDescending();
	}
	
	
	public double getSummaryPriceWODiscount()
	{
		double outcome = 0.00;
		for(int i = 0; i < this.basket.size(); i++)
			outcome += this.basket.get(i).getPrice();
		return outcome;
	}
	
	
	public double getSummaryOfDiscountPrice()
	{
		double outcome = 0.00;
		for(int i = 0; i < this.basket.size(); i++)
			outcome += this.basket.get(i).getDiscountPrice();
		return outcome;
	}
	
	
	public void setThe300Discount()
	{	
		for(int i = 0; i < this.basket.size(); i++)
			this.basket.get(i).setDiscountPrice(0.95 *
					this.basket.get(i).getPrice());
	}
	
	
	public void setThe3rdFree()
	{
		Product var = findTheCheapestOne();
		int i = this.basket.indexOf(var);
		this.basket.get(i).setDiscountPrice(0.00);
	}
	
	
	public void setTheFreeMug()
	{
		Product mug = new Product("0", "The JavaMarkt Mug", 0.00, 0.00);
		addToShoppingBasket(mug);
	}
	
	
	public void setThe30PercentDiscount()
	{
		Product discount = new Product("99", "Asus Mouse", 100.00, 100.00);
		for(int i = 0; i < this.basket.size(); i++)
		{
			if(this.basket.get(i).getCode().equals(discount.getCode()))
			{
				this.basket.get(i).setDiscountPrice(this.basket.get(i).getPrice() * 0.70);
				break;
			}
		}
	}
	
	
	public void resetDiscount()
	{
		Product mug = new Product("0", "The JavaMarkt Mug", 0.00, 0.00);
		
		for(int i = this.basket.size() - 1; i >= 0; i--)
			if(this.basket.get(i).getCode().equals(mug.getCode()))
			{
				this.basket.remove(i);
				break;
			}
		
		for(int i = 0; i < this.basket.size(); i++)
			this.basket.get(i).setDiscountPrice(this.basket.get(i).getPrice());
	}
	
	
	public double setAndApplyDiscount()
	{
		resetDiscount();
		double totalPrice = getSummaryPriceWODiscount();
		if(totalPrice > 300)
			setThe300Discount();
		else if(totalPrice > 200 && this.basket.size() >= 3)
			setThe3rdFree();
		else if(totalPrice > 200 && this.basket.size() < 3)
			setTheFreeMug();
		setThe30PercentDiscount();
		
		return getSummaryOfDiscountPrice();
	}
	
	
	public String toString()
	{
		String outcome = "Total cost: " + String.format("%.2f", 
				setAndApplyDiscount()) + " PLN\n\n";
		defaultSortShoppingBasket();
		for(int i = 0; i < this.basket.size(); i++)
		{
			outcome += this.basket.get(i).toString() + "\n\n";
		}
		return outcome;
	}
}
