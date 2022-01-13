package wyklad._06kolekcje;

import java.util.TreeSet;

class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("B");
		ts.add("H");
		ts.add("O");
		ts.add("A");
		ts.add("I");
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
		ts.add("N");
		ts.add("T");
		ts.add("G");
		ts.add("M");
		ts.add("U");

		// w jakiej kolejnosci otrzymamy dane
		System.out.println(ts);

		ts.add("W");
		ts.add("V");
		ts.add("X");
		ts.add("Y");
		ts.add("Z");
		System.out.println(ts.contains("A"));
		//log_2(1000) = 10, log_2(10^6) = log_2((10^3) * (10^3)) = 10 + 10 = 20
		System.out.println(ts.contains("AA"));
		// a jakiej teraz
		System.out.println(ts);
	}
}
