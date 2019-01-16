package systemKadrowy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Umiejetnosc um1 = new Umiejetnosc("Prawo jazdy kat. B");
		Umiejetnosc um2 = new Umiejetnosc("Uprawienia na wózek wid³owy");
		Umiejetnosc um3 = new Umiejetnosc("Kurs spawacza");
		
		List<Umiejetnosc> umLista = new ArrayList<Umiejetnosc>();
		umLista.add(um1); umLista.add(um2); umLista.add(um3);
		
		Kierownik kierownik1 = new Kierownik("Tomasz", "Kowalski", 1988, 3000, 10, 500, "+48 788334556", "767885667", 110, "Dzia³ marketingu");
		PracownikFizyczny pracFiz1 = new PracownikFizyczny("Rafa³", "Nowak", 1990, 14, 160, 22, kierownik1, umLista);
		PracownikUmyslowy pracUmysl1 = new PracownikUmyslowy("Micha³", "Malinowski", 1996, 2444, 4, kierownik1, "+48 656478646", 45);
		Praktykant praktykant1 = new Praktykant("Cezary", "Kapuœciñski", 1992, pracUmysl1, true);
		CzlonekZarzadu zarzad1 = new CzlonekZarzadu("Henryk", "Bagnowski", 1960, 6240, pracUmysl1, 12);
		
		System.out.println(pracFiz1.toString());
		System.out.println(pracUmysl1.toString());
		System.out.println(praktykant1.toString());
		System.out.println(zarzad1.toString());
	}

}
