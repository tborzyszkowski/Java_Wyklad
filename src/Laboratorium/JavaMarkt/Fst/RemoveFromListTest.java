package Laboratorium.JavaMarkt.Fst;

import java.util.*;

public class RemoveFromListTest {

	public static void main(String[] args) {
		List<Produkt> lista = new ArrayList<>();
		
		lista.add(new Produkt("Jabłko", 1));
		lista.add(new Produkt("Gruszka", 2));
		lista.add(new Produkt("Śliwka", 3));
		
		// pierwszy sposób
		// wymaga Java ver.>= 8
		lista.removeIf(p -> p.getNazwa().contains("sz"));
		
		System.out.println(lista);
		
		// drugi sposób 
		Iterator<Produkt> iter = lista.iterator();
		while (iter.hasNext()) {
		    if (iter.next().getNazwa().contains("li")) {
		        iter.remove();
		    }
		}
		System.out.println(lista);

	}

}
