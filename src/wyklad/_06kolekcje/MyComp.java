package wyklad._06kolekcje;

import java.util.*;

// TU definiujemy nowy Comparator
class MyComparator<E extends Comparable<E>> implements Comparator<E> {
	public int compare(E a, E b) {
//		 odwracamy porzadek
//		 return b.compareTo(a);
//		 return a.compareTo(b);
//		return (a.toString().length() < b.toString().length() ? -1 :
//					(a.toString().length() > b.toString().length() ? 1 : 
//						a.compareTo(b) ));
	return 0;
	}
}


class MyComp {
	public static void main(String args[]) {
		// tworzymy obiekt klasy TreeSet z nowym porzadkiem
		TreeSet<String> ts = new TreeSet<String>(new MyComparator<String>());

		ts.add("AAAA");
		ts.add("HH");
		ts.add("OO");
		ts.add("BBBB");
		ts.add("II");
		ts.add("P");
		ts.add("C");
		ts.add("J");
		ts.add("Q");
		ts.add("D");
		ts.add("K");
		ts.add("R");
		ts.add("E");
		ts.add("L");
		ts.add("S");
		ts.add("F");
		ts.add("M");
		ts.add("T");
		ts.add("G");
		ts.add("N");
		ts.add("U");
		ts.add("W");
		ts.add("V");
		ts.add("X");
		ts.add("Y");
		ts.add("Z");

		// wypisujemy elementy
		for (String s : ts)
			System.out.print(s + " ");

		System.out.println();
		System.out.println(ts);
	}
}
