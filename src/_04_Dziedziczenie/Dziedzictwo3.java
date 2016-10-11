package _04_Dziedziczenie;

// Przyklad wskazywania klasy podrzednej 
// przez zmienna  klasy nadrzednej 
// Klasa nadrzedna
class A3 {
    int i, j;
    // ustawianie wartosci
    void setA(int a, int b) {
    	i = a;
    	j = b;
    }
}
// Klasa podrzedna
class B3 extends A3 {
    int k;
    // ustawianie wartosci
    void setB(int a, int b, int c) {
    	setA(a,b);
    	k = c;
    }
}
class B33 extends A3{
	int k;
    void setB(int a, int b, int c) {
    	setA(a,b);
    	k = c;
    }
}

class Dziedzictwo3 {
    public static void main(String args[]) {
    	A3 obA = new A3();
    	B3 obB = new B3();
    	B33 obB33 = new B33();

	// ustawiamy wartosci
    	obA.setA(10,20);
    	obB.setB(1,2,3);
    	obB33.setB(-1, -2, -3);

	// wypisujemy zawartosc
    	System.out.println("Zawartosc A: ");
    	System.out.println(" i = " + obA.i + " j = " + obA.j);
    	System.out.println("Zawartosc B: ");
    	System.out.println(" i = " + obB.i + " j = " + obB.j + 
    			" k = " + obB.k + "\n");
	
    // obA bedzie wskazywal na obB
    	obA = obB;
    //	obB = obA;
	// wypisujemy zawartosc
    	System.out.println("Zawartosc A: ");
    	System.out.println(" i = " + obA.i + " j = " + obA.j);
    	//System.out.println(" k = " + obA.k );
        // czy dostepne bedzie k
    	//System.out.println(" k = " + ((B3)obA).k);
    	System.out.println(obA.getClass());
    	if(obA instanceof B3)
    		System.out.println(" k = " + ((B33)obA).k);
    	else
    		System.out.println("Zly typ");
   }
}
