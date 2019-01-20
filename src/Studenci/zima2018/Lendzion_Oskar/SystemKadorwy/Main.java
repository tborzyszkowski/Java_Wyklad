public class Main {
	
	public static void main(String[] args) {
		
	
		Kierownik kierownik_produkcji = new Kierownik("Piotr", "Nowak", 1968, 2800.00, 0.2, 250.00, "123 456 789", "128B", "Dzaia³ produkcji");
		Kierownik kierownik_dzialIT = new Kierownik("Janusz", "Glik", 1974, 3500.00, 0.2, 300.00, "123 456 789", "222A", "Dzaia³ IT");
		Pracownik_fizyczny JanKowalski = new Pracownik_fizyczny("Jan", "Kowalski", 1976, 15, 70, 6, kierownik_produkcji, "uprawnienia wozka widlowego");
		Pracownik_umyslowy PawelBoruc = new Pracownik_umyslowy("Pawel", "Boruc", 1984, 2850.00, 0.05, kierownik_dzialIT, "123 456 789", "222A");
		Zarzad JarekPeszko = new Zarzad("Jaroslaw", "Peszko", 1972, 1950.00, PawelBoruc, 4);
		Praktykant DarekBozek = new Praktykant("Dariusz", "Bozek", 1994, JanKowalski, false);
		Praktykant RomanCygan = new Praktykant("Roman", "Cygan", 1996, JanKowalski, true);
		
		
		
		System.out.println("-1-\n" + JanKowalski + "\n" + kierownik_produkcji.wypisz() + "\n");
		System.out.println("-2-\n" + JanKowalski.pensja() + "\n" + kierownik_produkcji.wypisz() + "\n");
		System.out.println("-3-\n" + PawelBoruc.pensja() + "\n" + kierownik_dzialIT.wypisz() + "\n");
		System.out.println("-4-\n" + JarekPeszko.pensja() + "\n" + JarekPeszko + "\n");
		System.out.println("-5-\n" + DarekBozek.pensja() + "\n" + DarekBozek + "\n");
		System.out.println("-5-\n" + RomanCygan.pensja() + "\n" + RomanCygan + "\n");
	}
}