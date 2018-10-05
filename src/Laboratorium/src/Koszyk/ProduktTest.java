package Koszyk;

public class ProduktTest {

	public static void main(String[] args) {
		Produkt p = new Produkt();
		
		p.setCena(10);
		p.setNazwa("Mleko");
		
		System.out.println("Produkt: " + p);
		System.out.println("Produkt: " + p.getNazwa() + " " + p.getCena());

		Produkt p2 = new Produkt("Jab³ko", 2.5);
		
		System.out.println("Produkt: " + p2);
	}

}
