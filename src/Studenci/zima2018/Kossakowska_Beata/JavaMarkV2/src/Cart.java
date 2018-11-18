import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Cart {
	private List<CartItem> items = new ArrayList<>();

	public static Comparator<Product> productPriceNameComparator = new Comparator<Product>() {
		public int compare(Product prod1, Product prod2) {
			if (prod1.getPrice() == prod2.getPrice()) {
				return prod1.getName().compareTo(prod2.getName());
			}
			return (prod1.getPrice() < prod2.getPrice() ? -1 : 1);
		}

	};

	public Product maxPriceProduct() {
		Product maxprod = null;
		for (int i = 0; i < items.size(); i++) {
			if (maxprod == null) {
				maxprod = items.get(i).getProduct();
			} else {
				if (items.get(i).getProduct().getPrice() > maxprod.getPrice()) {
					maxprod = items.get(i).getProduct();
				}
			}
		}
		return maxprod;
	}

	public float totalPriceProducts() {
		float total = 0;
		for (int i = 0; i < items.size(); i++) {
			total += items.get(i).getProduct().getPrice();
		}
		return total;
	}

	public float totalDiscountedPrice() {
		float total = 0;
		for (int i = 0; i < items.size(); i++) {
			total += items.get(i).getCurrentPrice();
		}
		return total;
	}

	public Cart addProduct(Product p) {
		items.add(new CartItem(p));
		return this;
	}

	public List<CartItem> getItems() {
		return items;
	}

	public void showProducts() {
		System.out.println(totalPriceProducts());
		System.out.println(totalDiscountedPrice());
		for (CartItem item : items) {
			System.out.println(item);
		}

	}

	public Product minPriceProducts() {
		Product minprod = null;

		for (int i = 0; i < items.size(); i++) {
			if (minprod == null) {
				minprod = items.get(i).getProduct();
			} else {
				if (items.get(i).getProduct().getPrice() < minprod.getPrice()
						&& items.get(i).getProduct().getPrice() != 0.0) {
					minprod = items.get(i).getProduct();
				}
			}

		}
		return minprod;
	}

	private static Product[] nMinPriceProducts(Product[] products, int n) {
		Product[] nMinPriceProducts = new Product[n];
		Arrays.sort(products, productPriceNameComparator);
		for (int i = 0; i < n; i++) {
			nMinPriceProducts[i] = products[i];
		}
		return nMinPriceProducts;

	}

	private static Product[] nMaxPriceProducts(Product[] products, int n) {
		Product[] nMaxPriceProducts = new Product[n];
		Arrays.sort(products, productPriceNameComparator);
		int j = 0;
		for (int i = products.length - 1; i > n; i--) {
			nMaxPriceProducts[j++] = products[i];
		}
		return nMaxPriceProducts;

	}
}
