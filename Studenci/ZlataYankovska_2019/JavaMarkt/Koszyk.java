import java.util.ArrayList;

public class Koszyk {
	ArrayList<Product> Lista;
	Product kubek;
	double suma;
	Koszyk() {
		this.Lista = new ArrayList<Product>();
		kubek = new Product("0000", "Kubek Firmowy", 0.0);
		suma = 0;
	}
	public void AddProduct(Product pro) {
		Lista.add(pro);
		this.Suma();
	}
	public void sortPrice(boolean rosnaco) {
		int len = Lista.size();
		Product[] tab = Lista.toArray(new Product[len]);
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len-1; j++) {
				if (rosnaco) {
					if(tab[j].price > tab[j+1].price) {
						Product p = tab[j+1];
						tab[j+1] = tab[j];
						tab[j] = p;
					}
				}
				else {
					if(tab[j].price < tab[j+1].price) {
						Product p = tab[j+1];
						tab[j+1] = tab[j];
						tab[j] = p;
					}
				}
			}
		}
		Lista.clear();
		for(int i = 0; i < len; i++) {
			Lista.add(tab[i]);
		}
	}
	public void sortName(boolean rosnaco) {
		int len = Lista.size();
		Product[] tab = Lista.toArray(new Product[len]);
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len-1; j++) {
				if (rosnaco) {
					if(tab[j].name.compareTo(tab[j+1].name) > 0) {
						Product p = tab[j+1];
						tab[j+1] = tab[j];
						tab[j] = p;
					}
				}
				else {
					if(tab[j].name.compareTo(tab[j+1].name) < 0) {
						Product p = tab[j+1];
						tab[j+1] = tab[j];
						tab[j] = p;
					}
				}
			}
		}
		Lista.clear();
		for(int i = 0; i < len; i++) {
			Lista.add(tab[i]);
		}
	}
	public void Suma() {
		int len = Lista.size();
		suma = 0;
		for(int i = 0; i < len; i++) {
			suma += Lista.get(i).discountPrice;
		}
	}
	public void Restore() {
		int len = Lista.size();
		for(int i = 0; i < len; i++) {
			Lista.get(i).discountPrice = Lista.get(i).price;
		}
		Suma();
	}
	public void tanszyZaDarmo() {
		int len = Lista.size();
		if(len > 2) {
			this.sortPrice(true);
			Lista.get(0).discountPrice = 0.0;
		}
		this.Suma();
	}
	public void dajKubek() {
		if(suma > 200) {
			Lista.add(kubek);
		}
	}
	public void ponad300() {
		int len = Lista.size();
		for(int i = 0; i < len; i++) {
			Lista.get(i).discountPrice = Lista.get(i).discountPrice - Lista.get(i).price*0.05;
			if(Lista.get(i).discountPrice < 0) {
				Lista.get(i).discountPrice = 0;
			}
		}
		this.Suma();
	}
	public void kupon() {
		int len = Lista.size();
		for(int i = 0; i < len; i++) {
			Lista.get(i).discountPrice = Lista.get(i).discountPrice - Lista.get(i).price*0.3;
			if(Lista.get(i).discountPrice < 0) {
				Lista.get(i).discountPrice = 0;
			}
		}
		this.Suma();
	}
	public void printList() {
		int len = Lista.size();
		Product p;
		for(int i = 0; i < len; i++) {
			p = Lista.get(i);
			System.out.println("Code: "+p.code+" name: "+p.name+" price: "+p.price + " discount price: " + p.discountPrice+".");
		}
	}
	public Product[] find(int n, boolean najtansze){
		this.sortPrice(najtansze);
		int len = Lista.size();
		return Lista.subList(0, n).toArray(new Product[len]);
	}
}