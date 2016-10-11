package _04_Dziedziczenie;

import java.util.*;

// Demonstracja nadpisania metody
class AO1 {
    int i, j;
    
    AO1(int a, int b) {
    	i = a;
    	j = b;
    }
    // wyswietl i oraz j
    void show() {
    	System.out.println("A: i = " + i + " j = " + j);
    }
}

class BO1 extends AO1 {
    int k;
    
    BO1(int a, int b, int c) {
    	super(a, b);
    	k = c;
    }
    // wyswietl k - metoda ta nadpisuje metode show z A
    void show() {
    	System.out.println("B: k = " + k);
    }
}
// klasa testujaca
class Overriding1 {
    public static void main (String args[]) {
    	BO1 obB = new BO1(1, 2, 3);
    	//AO1 obA = obB;
    	AO1 obA = new AO1(4,5);

    	obB.show(); // wywolanie show() z B
    	boolean b = (new Random()).nextBoolean();
		System.out.println("b = "+ b);
    	if(b){
    		obA = obB;
    	}
    	obA.show();
    }
}
