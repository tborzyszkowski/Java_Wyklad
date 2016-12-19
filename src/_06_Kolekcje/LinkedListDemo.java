package _06_Kolekcje;
import java.util.*;

class LinkedListDemo{
    public static void main(String args[]) {

	LinkedList ll = new LinkedList();

	ll.add("F");
	ll.add("B");
	ll.add("D");
	ll.add("E");
	ll.add("C");
	ll.addLast("Z");
	ll.addFirst("A");
	ll.add(1,"A2");
	ll.add("F");
	ll.add(13);

	System.out.println("Zawartosc(1) ll: " + ll);

	ll.remove("F");
	ll.remove(2);

	System.out.println("Zawartosc(2) ll: " + ll);

	ll.removeFirst();
	ll.removeLast();

	System.out.println("Zawartosc(3) ll: " + ll);

	// pobierz i ustaw wartosc
	Object val = ll.get(2);
	ll.set(2, (String) val + " zmieniony");

	System.out.println("Zawartosc(4) ll: " + ll);	
    }
}
