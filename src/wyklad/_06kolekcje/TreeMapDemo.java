package wyklad._06kolekcje;
import java.util.*;
import java.util.Set;
import java.util.Iterator;

class TreeMapDemo {
	public static void main(String args[]) {

		TreeMap<String, Double> tm = new TreeMap<String, Double>();

		tm.put("Jan Kowalski", new Double(1111.11));
		tm.put("Jan Nowak", new Double(2222.22));
		tm.put("Anna Kos", new Double(3333.33));
		tm.put("Hermenegilda Kociubinska", new Double(4444.44));
		tm.put("Kubus Puchatek", new Double(5555.55));

		// zbior danych
		Set<Map.Entry<String, Double>> set = tm.entrySet();

		// wyswietlanie zbioru danych
		for (Map.Entry<String, Double> m : set) {
			System.out.print(m.getKey() + ": ");
			System.out.println(m.getValue());
		}
		System.out.println();

		// zwiekszamy zarobki Jana Kowalskiego o 1000
		double balance = tm.get("Jan Kowalski").doubleValue();
		tm.put("Jan Kowalski", new Double(balance + 1000));
		Double res = tm.put("Jan Kowalski", new Double(balance + 1000));
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
