package wyklad._06kolekcje;
import java.util.*;
//import java.util.Set;
//import java.util.Iterator;

class TreeMapDemo {
	public static void main(String[] args) {

		Map<String, Double> tm = new TreeMap<String, Double>();

		tm.put("Jan Kowalski", 1111.11);
		tm.put("Jan Nowak", 2222.22);
		tm.put("Anna Kos", 3333.33);
		tm.put("Hermenegilda Kociubinska", 4444.44);
		tm.put("Kubus Puchatek", 5555.55);

		Set<Map.Entry<String, Double>> set = tm.entrySet();

		for (Map.Entry<String, Double> m : set) {
			System.out.println(m.getKey() + " | " + m.getKey().hashCode() + " | " + m.getValue());
		}
		System.out.println();

		double balance = tm.get("Jan Kowalski");
		tm.put("Jan Kowalski", balance + 1000);
		Double res = tm.put("Jan Kowalski", balance + 1000);
		System.out.println("---> Jan Kowalski: " + res);

		for (Iterator<Map.Entry<String, Double>> i = set.iterator(); i.hasNext();) {
			Map.Entry<String, Double> m = i.next();
			System.out.println(m.getKey() + " | " + m.getKey().hashCode() + " | " + m.getValue());
		}
		System.out.println();
	}
}
