package _06_Kolekcje;
import java.util.*;

class ArrayListToArray {
	public static void main(String args[]) {

		ArrayList a1 = new ArrayList();

		a1.add(new Integer(1));
		a1.add(new Integer(2));
		a1.add(new Integer(3));
		a1.add(new Integer(4));
		a1.add(5.5);
//		a1.add("AAAA");
		System.out.println("Zawartosc a1: " + a1);

		Object ia[] = a1.toArray();
		
		
		int sum = 0;
		
//		for (int i = 0; i < ia.length; i++)
//			sum += ((Integer) ia[i]).intValue();
//
//		System.out.println("Suma = " + sum);
		
		System.out.println(a1.get(4).getClass().getName());
	}
}
