package _04_Dziedziczenie;

// Demonstracja nadpisania metody

class AO2 {
    int i, j;
    
    AO2(int a, int b) {
    	i = a;
    	j = b;
    }
    // wyswietl i oraz j
    void show() {
    	System.out.println(" i = " + i + " j = " + j);
    }
    // reprezentacja napisowa
    public String toString() {
    	return "A: i = " + i + " j = " + j;
    }
}

class BO2 extends AO2 {
    int k;
    
    BO2(int a, int b, int c) {
    	super(a, b);
    	k = c;
    }
    // wyswietl k - metoda ta nadpisuje metode show z A
    void show() {
    	System.out.println(" k = " + k);
    }
    // reprezentacja napisowa
    // metoda ta takze nadpisuje metode toString z A 
    // ale wywoluje metode z A przez super
    public String toString() {
    	return "B: " + super.toString() + " k = " + k;
    }
}
// klasa testujaca
class Overriding2 {
    public static void main (String args[]) {
    	BO2 obB = new BO2(1, 2, 3);
    	//AO2 obA = obB;
    	AO2 obA = new AO2(3,4);
	
    	obB.show();  // wywolanie show() z B
    	// wywolanie metody toString z B,
    	// ktora wywoluje toString z A
    	System.out.println(obB); 
    	obA.show();
    	System.out.println(obA);
    }
}