package wyklad._06kolekcje;

import java.util.*;

class LinkedListDemoG {
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		ll.add("F");

		System.out.println("Zawartosc(1) ll: " + ll);

		ll.remove("F");
		ll.remove(2);

		System.out.println("Zawartosc(2) ll: " + ll);

		ll.removeFirst();
		ll.removeLast();

		System.out.println("Zawartosc(3) ll: " + ll);

		// pobierz i ustaw wartosc
		String val = ll.get(2);
		ll.set(2, val + " zmieniony");

		System.out.println("Zawartosc(4) ll: " + ll);
	}
}
