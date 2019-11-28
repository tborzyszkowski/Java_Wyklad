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
	
	
	public double getSummaryPrice()
	{
		double outcome = 0.00;
		for(int i = 0; i < this.basket.size(); i++)
			outcome += this.basket.get(i).getPrice();
		return outcome;
	}
	
	
	public double setAndApplyThe300Discount()
	{
		double outcome = getSummaryPrice();
		if(outcome > 300.00)	
			outcome = outcome - outcome * 0.05;
		return outcome;
	}
	
	
	public double setAndApplyThe3rdFree()
	{
		double outcome = getSummaryPrice();
		Product var = null;
		if(this.basket.size() >= 3 && outcome <= 300.00)
		{
			var = findTheCheapestOne();
			outcome = outcome - var.getPrice();
		}
		return outcome;
	}
	
	public void setAndApplyTheFreeMug()
	{
		double outcome = getSummaryPrice();
		Product mug = new Product("0", "The JavaMarkt Mug", 0.00, 0.00);
		if(outcome > 200.00 && outcome <= 300 && this.basket.size() < 3)
			this.basket.add(mug);
	}
	
	
	public double setAndApplyThe30PercentDiscount(Product discount)
	{
		double outcome = getSummaryPrice();
		if(this.basket.contains(discount))
			outcome -= discount.getPrice() * 0.3;
		return outcome;
	}
	
	
	public String toString()
	{
		String outcome = "Total cost: " + getSummaryPrice() + " PLN\n\n";
		for(int i = 0; i < this.basket.size(); i++)
		{
			outcome += this.basket.get(i).toString() + "\n\n";
		}
		return outcome;
	}
}
