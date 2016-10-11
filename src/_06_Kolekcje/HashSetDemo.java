package _06_Kolekcje;
import java.util.*;

class HashSetDemo{
    public static void main(String args[]) {

	HashSet<String> hs = new HashSet<String>(13);

	hs.add("AA"); hs.add("HH"); hs.add("O");
	hs.add("B"); hs.add("I"); hs.add("P");
	hs.add("C"); hs.add("J"); hs.add("Q");
	hs.add("D"); hs.add("K"); hs.add("R");
	hs.add("E"); hs.add("L"); hs.add("S");
	hs.add("F"); hs.add("M"); hs.add("T");
	hs.add("G"); hs.add("N"); hs.add("U");

	// w jakiej kolejnosci otrzymamy dane
		System.out.println(hs);

	hs.add("W"); hs.add("V"); hs.add("X");
	hs.add("B"); hs.add("I"); hs.add("P");
	hs.add("Y"); hs.add("Z");
	hs.add("1"); hs.add("2"); hs.add("3");
	hs.add("4"); hs.add("5");
	hs.add("aW"); hs.add("aV"); hs.add("aX");
	hs.add("aY"); hs.add("aZ");
	hs.add("a1"); hs.add("a2"); hs.add("a3");
	hs.add("a4"); hs.add("a5");
	hs.add("BB"); hs.add("BBBB");
	// a jakiej teraz
	System.out.println(hs);
    }
}
