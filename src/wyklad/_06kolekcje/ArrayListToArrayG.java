package wyklad._06kolekcje;
import java.util.*;
import java.util.stream.*;

class ArrayListToArrayG {
	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
//		a1.add(5.0);
//		 a1.addAll("AAAA");

		System.out.println("Zawartosc a1: " + a1);

		Integer ia[] = {0, 0, 0, 0};
		ia = a1.toArray(ia);

		int sum1 = 0;

		for (int i = 0; i < ia.length; i++)
			sum1 += ia[i];
		System.out.println("Suma = " + sum1);

		int sum2= 0;
		for(Integer element : ia)
			sum2 += element;
		System.out.println("Suma = " + sum2);

		a1.stream().forEach(e -> System.out.println(e));
		System.out.println("a1 = " + a1);
	}
}
