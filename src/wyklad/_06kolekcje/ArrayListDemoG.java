package wyklad._06kolekcje;

import java.util.*;

class ArrayListDemoG {
	public static void main(String[] args) {

		ArrayList<Number> a1 = new ArrayList<Number>();

		System.out.println("Poczatkowy rozmiar a1: " + a1.size());

		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(4);
		a1.set(1, 4);
//		a1.add(11, 4);

		a1.add(3, new Double(3));
//		a1.add(4, "Ala ma kota");
		System.out.println(a1.contains(new Integer(42)));

		System.out.println("Rozmiar po dodaniu   : " + a1.size());
		System.out.println("Zawartosc a1         : " + a1);

		// a1.remove(4);
		Integer iii = new Integer(4);
		a1.remove(iii);
		System.out.println("Zawartosc a1(1.4)    : " + a1);
		a1.remove(iii);
		System.out.println("Zawartosc a1 (2.4)   : " + a1);
		a1.remove(iii);

		System.out.println("Po usunieciu         : " + a1.size());
		System.out.println("Zawartosc a1         : " + a1);
		
		a1.clear();
		long time1 = System.currentTimeMillis(),
				time2;
		for (int i = 0; i < 1000 * 1000; i++) {
			a1.add(i);
		}
		time2 = System.currentTimeMillis();

		System.out.println("a1.size(): "+ a1.size() + " czas: " + " ["+(time2-time1)+"]");
		
	}
}
