package VAT;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
	public static void main(String[] args) {
		Klient a = new Klient();
		a.setCompanyName("Random Company");
		a.setAddress("Gdańska 1");
		a.setNIP(123456789);
		a.setBankAccount(1234567890);
		System.out.println("-1- \n" + a);
		
		Product b = new Product();
		b.setProductName("TV");
		b.setQuantity(2);
		b.setBrutto(1780);
		b.getNetto();
		b.getTotalNetto();
		b.getTax();
		b.getTotalBrutto();
		System.out.println(b);
		
		Product b1 = new Product();
		b1.setProductName("Microwave");
		b1.setQuantity(1);
		b1.setBrutto(450);
		b1.getNetto();
		b1.getTotalNetto();
		b1.getTax();
		b1.getTotalBrutto();
		System.out.println(b1);
		int totalBrutto = (int) (b.getTotalBrutto() + b1.getTotalBrutto());
		System.out.println("Wartość całkowita faktury(brutto): " + totalBrutto);
		
		
		
		Random c = new Random();
		int invoiceNumber = c.nextInt(10000);
		System.out.println("Numer faktury: " + invoiceNumber);
		
		
		LocalDate startDate = LocalDate.of(2019, 1, 1); 
	    long start = startDate.toEpochDay();
	    LocalDate endDate = LocalDate.now(); 
	    long end = endDate.toEpochDay();
	    long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
	    System.out.println("Data wystawienia dokumentu: " + LocalDate.ofEpochDay(randomEpochDay)); 		
			
		}
		
		
	}
