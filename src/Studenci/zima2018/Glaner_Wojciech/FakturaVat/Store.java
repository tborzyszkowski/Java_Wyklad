package faktura;
import java.text.ParseException;
import java.util.ArrayList;

import faktura.*;

public class Store {

	public static void main(String[] args) throws ParseException {
		
		Address adres = new Address("chrobrego","33/1","Gdañsk", "80-444");
		Company company = new Company("Lombard", adres, "555-332-32", "1202022121");
		Product prod1 = new Product("Kolczyk", 69, 2);
		Product prod2 = new Product("Pierscionek", 155, 1);
		ArrayList<Product> listaZakupow = new ArrayList<>();	
		listaZakupow.add(prod1);
		listaZakupow.add(prod2);
		Invoice inv1 = new Invoice(listaZakupow,company, "2018-11-03", "2018-10-28", "2018-11-05");
		
		
		
		ArrayList<Product> listaZakupowWarzywniak = new ArrayList<>();	
		listaZakupowWarzywniak.add(new Product("Marchew", 5, 10));
		listaZakupowWarzywniak.add(new Product("Pietruszka", 2, 12));
		listaZakupowWarzywniak.add(new Product("Pomidor", 7, 3));
		Invoice inv2 = new Invoice(listaZakupowWarzywniak, new Company("Warzywniak", new Address("Pi³sudskiego", "22", "Poznañ", "44-222"), "545-343-22-33", "230543409832"), "2018-11-03", "2018-10-28", "2018-11-05" );
		
		inv1.info();
		System.out.println("\n");
		inv2.info();
		
		
	}
	

}
