package kadra;

public class Main {
	
	public static void main (String[] args ) {
		
		Praktykant praktykant = new Praktykant("Andrzej", "Kowalki", "10/05/1990", "Janusz Tracz", 1500);
		
		System.out.println(praktykant);
		
		CzlonekZarz a = new CzlonekZarz("Maciej", "Kopytko", "01/02/1987", 2200, "Marek Asystent", 3, 350);
		
		System.out.println(a);
		
		
	}

}
