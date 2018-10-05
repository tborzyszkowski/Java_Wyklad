package _06_Kolekcje;
import java.util.*;

class ArrayListDemo{
    public static void main(String args[]) {

	ArrayList a1 = new ArrayList();

	System.out.println("Poczatkowy rozmiar a1: " + a1.size());

	a1.add("C");
	a1.add("A");
	a1.add("E");
	a1.add("B");
	a1.add("D");
	a1.add("F");
	a1.add(1,"A2");
	a1.add(1,"A3");
	//a1.set(1,"A3");
	a1.add(3,new Integer(3));

	System.out.println("Rozmiar po dodaniu   : " + a1.size());
	System.out.println("Zawartosc a1         : " + a1);

	a1.remove("F");a1.remove("F");
	a1.remove(2);

	System.out.println("Po usunieciu         : " + a1.size());
	System.out.println("Zawartosc a1         : " + a1);
    }
}
