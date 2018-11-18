package fakturaVat;

import java.util.ArrayList;

public class Faktura {

	private ArrayList<PozycjaFV> items = new ArrayList<>();
	double totalPriceOfNetto = 0;
	double totalPriceOfBrutto = 0;
	int id = 0;
	static int licz =0;
	
	public Faktura() {
		licz++;
		id = licz;
	}
	
	public Faktura addProduct(Produkt p) {
		items.add(new PozycjaFV(p));
		totalPriceOfNetto += p.getPriceNetto();
		totalPriceOfBrutto += p.getPriceBrutto();
		return this;
		}
	
	public int getId() {
		return this.id;
	}

	public double totalPriceOfNetto(){
		double sum = 0;
		for(PozycjaFV it : items)
			sum += it.getProdukt().getPriceNetto();
		return sum;
	}
	
	public double totalPriceOfBrutto(){
		
		double sum = 0;
		for(PozycjaFV it : items)
			sum += it.getProdukt().getPriceBrutto();
		return sum;
	}
	
	public ArrayList<PozycjaFV> getItems() {
		return items;
	}
	
	public void ReturnListOfBoughtProducts() {
		int i = 0;
		for(PozycjaFV cos : items) {
			System.out.print("Position " + ++i + ": ");
			System.out.println(cos.getProdukt());
		}
		System.out.println("Net amount: " + totalPriceOfNetto + " Gross amount: " + totalPriceOfBrutto);
		System.out.println("Invoice number: " + getId());
	}

	@Override
	public String toString() {
		return "Items: " + items + "\n" + ", totalPriceOfNetto=" + totalPriceOfNetto + ", totalPriceOfBrutto="
				+ totalPriceOfBrutto;
	}
}
