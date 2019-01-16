package _04_Dziedziczenie;

class AO2 {
    int i, j;    
    AO2(int a, int b) {
    	i = a;
    	j = b;
    }
    void show() {
    	System.out.println(" i = " + i + " j = " + j);
    }
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
    void show() {
    	System.out.println(" k = " + k);
    }
    public String toString() {
    	return "B: " + super.toString() + " k = " + k;
    }
}
class Overriding2 {
    public static void main (String args[]) {
    	BO2 obB = new BO2(1, 2, 3);
//    	AO2 obA = obB;
    	AO2 obA = new AO2(3,4);
	
    	obB.show();  // wywolanie show() z B
    	// wywolanie metody toString z B,
    	// ktora wywoluje toString z A
    	System.out.println(obB.getClass() + " " + obB); 
    	obA.show();
    	System.out.println(obA.getClass() + " " + obA);
    }
}