package wyklad._06kolekcje;
import java.util.ArrayList;
import java.util.TreeSet;

class ForLoop {
	public static void main(String[] args) {
		long[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		long result = 0;

		// normalna petla for
		for (int i = 0; i < a.length; ++i)
			result += a[i];
		System.out.println(result);

		// inna forma petli for
		result = 0;
		for (long x : a)
			result += x;
		System.out.println(result);

		ArrayList<String> al = new ArrayList<String>();

		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		
		for (String v : al)
			System.out.print(v+ " ");
		System.out.println();

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("C");
		ts.add("A");
		ts.add("E");
		ts.add("B");
		ts.add("D");
		ts.add("F");
//		ts.add(1, "A2");

		for (String v : ts)
			System.out.print(v+ " ");
		System.out.println();
		// while() ???
	}
	
}
