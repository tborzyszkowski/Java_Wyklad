package wyklad._06kolekcje;
import java.util.*;

class HashMapDemo {
	public static void main(String[] args) {

		Map<String, Double> hm = new HashMap<String, Double>();

		hm.put("Jan Kowalski", 1111.11);
		hm.put("Jan Nowak", 2222.22);
		hm.put("Anna Kos", 3333.33);
		hm.put("Hermenegilda Kociubinska", 4444.44);
		hm.put("Kubus Puchatek", 5555.55);

		Set<Map.Entry<String, Double>> set = hm.entrySet();

		for (Map.Entry<String, Double> m : set) {
			System.out.println(m.getKey() + " | " + m.getKey().hashCode() + " | " + m.getValue());
		}
		System.out.println();

		double balance = hm.get("Jan Kowalski");
		Double res = hm.put("Jan Kowalski", balance + 1000);
		System.out.println("---> Jan Kowalski: " + res + " " + hm.get("Jan Kowalski") + " " +(hm.get("Jan Kowalski") == 2111.11));
		
		for (Iterator<Map.Entry<String, Double>> i = set.iterator(); i.hasNext();) {
			Map.Entry<String, Double> m = i.next();
			System.out.println(m.getKey() + " | " + m.getKey().hashCode() + " | " + m.getValue());
		}
		System.out.println();
	}
}
