package wyklad._06kolekcje;
import java.util.*;
import java.util.Set;
import java.util.Iterator;

class TComp<E> implements Comparator<E> {
	public int compare(E a, E b) {
		int i, j, k;
		
		String aStr = a.toString();
		String bStr = b.toString();

		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');

		k = aStr.substring(i).compareTo(bStr.substring(j));
		if (k == 0)
			return aStr.compareTo(bStr);
		else
			return k;
	}
}

class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<String, Double> tm = new TreeMap<String, Double>(
				new TComp<String>());

		tm.put("Jan Kowalski", 1111.11);
		tm.put("Janusz Kowalski", 1111.11);
		tm.put("Janusz Kowalski", 1111.12);
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

		for (Iterator<Map.Entry<String, Double>> i = set.iterator(); i
				.hasNext();) {
			Map.Entry<String, Double> m = i.next();
			System.out.println(m.getKey() + " | " + m.getKey().hashCode() + " | " + m.getValue());
		}
		System.out.println();
		
		System.out.println(set);
	}
}
