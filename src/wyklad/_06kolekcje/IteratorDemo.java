package wyklad._06kolekcje;
import java.util.*;
import java.util.Iterator;
import java.util.ListIterator;

class IteratorDemo {
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
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// modyfikowanie iterowanych elementow
		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
		}
		// raz jeszcze wypelniamy zwykly iterator
		System.out.print("Zmodyfikowana lista :");
		itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// wyswietlarnie listy od konca
		System.out.print("Lista od konca:");
		while (litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
