package _06_Kolekcje;
import java.util.*;

public class ArraysDemo{
    public static void main(String args[]) {
	
	// tworzenie i inicjalizacja tablicy
	int array[] = new int[10];
	for(int i=0; i<10; i++)
	    array[i] = -3 * i;

	System.out.println("Oryginalna tablica ");
	for(int a : array)
	    System.out.print(a + "\t");
	System.out.println();

	// sortowanie
	Arrays.sort(array);
	System.out.println("Posortowana tablica ");
	for(int a : array)
	    System.out.print(a + "\t");
	System.out.println();

	// wype�nianie
	Arrays.fill(array, 2, 6, -1);
	System.out.println("Po wypelnieniu tablica ");
	for(int a : array)
	    System.out.print(a + "\t");
	System.out.println();

	// znow sortowanie
	Arrays.sort(array);
	System.out.println("Posortowana tablica ");
	for(int a : array)
	    System.out.print(a + "\t");
	System.out.println();

	// szukamy -9: poszukiwanie binarne
	System.out.println("-9 jest na pozycji tablica  ");
	System.out.println(Arrays.binarySearch(array, -1));
    }
}
