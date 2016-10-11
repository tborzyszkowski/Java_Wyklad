package _06_Kolekcje;
import java.util.*;
import java.util.Set;
import java.util.Iterator;

class HashMapDemo {
	public static void main(String args[]) {

		HashMap<String, Double> hm = new HashMap<String, Double>();

		hm.put("Jan Kowalski", new Double(1111.11));
		hm.put("Jan Nowak", new Double(2222.22));
		hm.put("Anna Kos", new Double(3333.33));
		hm.put("Hermenegilda Kociubinska", new Double(4444.44));
		hm.put("Kubus Puchatek", new Double(5555.55));

		// zbior danych
		Set<Map.Entry<String, Double>> set = hm.entrySet();

		// wyswietlanie zbioru danych
		for (Map.Entry<String, Double> m : set) {
			System.out.print(m.getKey() + ": ");
			System.out.println(m.getValue());
		}
		System.out.println();

		// zwiekszamy zarobki Jana Kowalskiego o 1000
		double balance = hm.get("Jan Kowalski").doubleValue();
		Double res = hm.put("Jan Kowalski", new Double(balance + 1000));
		System.out.println("---> Jan Kowalski: " + res);
		
		// wyswietlanie tradycyjne
		for (Iterator<Map.Entry<String, Double>> i = set.iterator(); i
				.hasNext();) {
			Map.Entry<String, Double> me = i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
	}
}
