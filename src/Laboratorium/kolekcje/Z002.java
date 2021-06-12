package Laboratorium.kolekcje;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Z002 {
	public static void main(String[] args) {
		Integer[] set1 = {1, 3, 4, 6, 7, 9};
		Integer[] set2 = {3, 5, 6, 7, 8, 9};
		List<Integer> setA = Arrays.asList(set1);
		List<Integer> setB = Arrays.asList(set2);

		Set<Integer> result = new HashSet<Integer>();

		for(Integer x : setA)
			if (!setB.contains(x))
				result.add(x);
		for(Integer x : setB)
			if (!setA.contains(x))
				result.add(x);
		System.out.println(result);
	}
}
