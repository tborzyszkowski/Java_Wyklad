package wyklad._06kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class ArrayListDemoG {
	public static void main(String[] args) {

		final int NumberOfElements = 5 * 1000 * 1000;

		ArrayList<Number> a1 = new ArrayList<Number>();
//		TreeSet<Number> a1 = new TreeSet<Number>();
		// 10^12 log 2(10^3^4) = 4 * log 2(10^3) ~ 4 * log 2 (2^10) = 40
//		HashSet<Number> a1 = new HashSet<Number>(NumberOfElements);
//
//		System.out.println("Poczatkowy rozmiar a1: " + a1.size());
//
//		a1.add(1);
//		a1.add(2);
//		a1.add(3);
//		a1.add(4);
//		a1.add(4);
//		a1.set(1, 4.0);
////		a1.add(11, 4);
//
//		a1.add(3, 3.14);
////		a1.add(4, "Ala ma kota");
//		System.out.println(a1.contains(42));
//
//		System.out.println("Rozmiar po dodaniu   : " + a1.size());
//		System.out.println("Zawartosc a1         : " + a1);
//
//		// a1.remove(4);
//		Integer iii = new Integer(4);
//		a1.remove(iii);
//		System.out.println("Zawartosc a1(1.4)    : " + a1);
//		a1.remove(iii);
//		System.out.println("Zawartosc a1 (2.4)   : " + a1);
//		a1.remove(iii);
//
//		System.out.println("Po usunieciu         : " + a1.size());
//		System.out.println("Zawartosc a1         : " + a1);

		a1.clear();
		long time1 = System.currentTimeMillis(),
				time2;
		for (int i = 0; i < NumberOfElements; i++) {
			a1.add(i);
		}
		time2 = System.currentTimeMillis();
		System.out.println("a1.size(): " + a1.size() + " czas tworzenia: " + " [" + (time2 - time1) + "]");
		boolean result;
//		System.out.println("Search:");
		for (int i = NumberOfElements / 2; i < NumberOfElements; i++)
//			for (int i = 0; i < NumberOfElements / 2; i++)
			result = a1.contains(i);
//			System.out.println("Nie");
//		for (int i = -1; i > -50001; i--)
//			result = a1.contains(i);
		long time3 = System.currentTimeMillis();

		System.out.println(" czas szukania: " + " [" + (time3 - time2) + "]");

	}
}
