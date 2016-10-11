package _06_Kolekcje;
import java.util.*;

public class VectorDemo {
	public static void main(String args[]) {
		// wektor o rozmiarze 3 powiekszany o 2
		Vector<Number> v = new Vector<Number>(3, 2);

		System.out.println("Pocz. rozmiar   : " + v.size());
		System.out.println("Pocz. pojemnosc : " + v.capacity());

		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		v.addElement(new Integer(5));

		System.out.println("Pojemnosc po add Integer : " + v.capacity());

		v.addElement(new Double(5.45));

		System.out.println("Pojemnosc po add Double  : " + v.capacity());

		v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		v.addElement(new Float(9.4));
		v.addElement(new Integer(10));
		v.addElement(new Integer(12));
		v.addElement(new Integer(11));

		System.out.println("Pierwszy element : " + v.firstElement());
		System.out.println("Ostatni element  : " + v.lastElement());

		if (v.contains(new Integer(3)))
			System.out.println("Wektor zawiera 3");

		// Enumeration - podobna do Iterator
		Enumeration vEnum = v.elements();
		System.out.println("Elementy wektora : " + v.lastElement());
		while (vEnum.hasMoreElements())
			System.out.print(vEnum.nextElement() + "  ");
		System.out.println();

		// ale mozna i tak
		for (Number a : v)
			System.out.print(a + "  ");
		System.out.println();
	}
}
