package Laboratorium.kolekcje;

import org.omg.CORBA.SetOverrideType;

import javax.xml.soap.SOAPPart;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Z001Set {
	public static void main(String[] args) {
		int[] input = {1, 1, 2, 2, 3, 3};

//		Scanner sc = new Scanner(System.in);
//		int suma = 0;
//		while (sc.hasNext()){
//			suma += Integer.parseInt(sc.next());
//			System.out.println(suma);
//		}
		Set<Integer> intSet = new HashSet<Integer>();

		for(int x : input){
			intSet.add(x);
		}
		System.out.println(intSet);
	}
}
