package wyklad._06kolekcje;
import java.util.*;
import java.util.Iterator;

class IteratorDemo_2 {
	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("Zawartosc a1: " + al);

		// iterowanie po elementach
		for (Iterator<String> itr = al.iterator(); itr.hasNext();)
			System.out.print(itr.next() + " ");
			
		System.out.println();

		// inna wersja tego samego
		for (String t : al)
			System.out.print(t + " ");
		System.out.println();
	}
}
