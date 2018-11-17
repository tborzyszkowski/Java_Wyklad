package fakturaVat;

public class Main {	
	public static void main (String[] args ) {
		Comp comp = new Comp("ABC", "Gdansk", "12312312323", "0000100010001000100011");
		Client client = new Client("Janusz", "Kowalski", "Sopot", "111011101110111011100");
		
		Faktura faktura = new Faktura();
		Faktura faktura2 = new Faktura();

		System.out.println("\n\tInvoice:");
	
		faktura.addProduct(new Produkt("Cos", 9, 100.01));
		faktura.addProduct(new Produkt("Inne_Cos", 2,  200.02));
		faktura2.addProduct(new Produkt("Bla BLA bla", 1,  1100.55));
		faktura2.addProduct(new Produkt("Pizza", 5, 25.99));
	
		
		System.out.println(comp);
		faktura.ReturnListOfBoughtProducts();
		System.out.println("Buyer: " + client + "\n");
		
		faktura2.ReturnListOfBoughtProducts();


		
	}	
}
