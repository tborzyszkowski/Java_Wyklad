package Laboratorium.JavaMarkt;

public class ProduktTest {

	public static void main(String[] args) {
		Produkt p = new Produkt();
		
		p.setCena(10);
		p.setNazwa("Mleko");
		
		System.out.println("Produkt: " + p);
		System.out.println("Produkt: " + p.getNazwa() + " " + p.getCena());
		
		p.setCena(20);
		p.setNazwa("Aabbb");
		
		System.out.println("Produkt: " + p);

		Produkt p2 = new Produkt("Jabłko", 2.5);
		
		System.out.println("Produkt: " + p2);
	}

}
