package Laboratorium.kolekcje;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Z003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> result = new TreeMap<String, Integer>();
		String element;
		Integer number;

		while (sc.hasNext()) {
			element = sc.next();
			number = result.get(element);
			if(number == null)
				result.put(element, 1);
			else
				result.put(element, number+1);
		}
		System.out.println(result);
	}
}
