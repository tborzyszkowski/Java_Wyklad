package lab3.FakrutaVat;

public class Main {
	
	public static void main(String[] args) {
		
		Client c = new Client();
		c.setClientInfo("Jan Kowalski", "Woronicza 17", "99-666", "Warszawa");
		Vendor v = new Vendor();
		v.setVendorInfo("CzarnoCzerwoni", "Platynowa 41", "76-983", "Gdynia", 1234563218, "99111122223333444455556666");
		
		Product p0 = new Product("Kartofle", 1.69, 1.08);
		Product p1 = new Product("Pralka", 699.67, 1.14);
		Product p2 = new Product("Dywan", 91.29, 1.05);
		Product p3 = new Product("Herbata", 23.12, 1.25);
		
		InvoiceItem i0 = new InvoiceItem(p0, 10);
		InvoiceItem i1 = new InvoiceItem(p1, 1);
		InvoiceItem i2 = new InvoiceItem(p2, 3);
		InvoiceItem i3 = new InvoiceItem(p3, 2);
		
		Invoice inv = new Invoice(c, v);
		
		inv.addToProductsPurchased(i0);
		inv.addToProductsPurchased(i1);
		inv.addToProductsPurchased(i2);
		inv.addToProductsPurchased(i3);
		
		System.out.println(inv);
		
		Invoice inv1 = new Invoice(c, v);
		
		inv1.addToProductsPurchased(i3);
		inv1.addToProductsPurchased(i2);
		
		System.out.println(inv1);
		
		
	}

}
