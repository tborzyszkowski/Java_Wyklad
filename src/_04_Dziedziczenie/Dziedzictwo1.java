package _04_Dziedziczenie;

// Prosty przyklad dziedziczenia
// Klasa nadrzedna
class A1 {
    int i, j;
    // ustawianie wartosci
    void setA(int a, int b) {
    	i = a;
    	j = b;
    }
    // pokaz zawartosc klasy
    String zawartoscA() {
    	return "\ti = " + i + "\tj = " +j;
    } 
    // suma zawartosci
    int sumaA() {
    	return i + j;
    }
}
// Klasa podrzedna
class B1 extends A1 {
    int k;
    // ustawianie wartosci
    void setB(int a, int b, int c) {
    	setA(a,b);
    	k = c;
    }
    // pokaz zawartosc klasy
    String zawartoscB() {
    	return zawartoscA() + "\tk = " + k;
    }
    // suma zawartosci
    int sumaB() {
    	return sumaA() + k;
    }
}

class Dziedzictwo1 {
    public static void main(String args[]) {
    	A1 obA = new A1();
    	B1 obB = new B1();

	// ustawiamy wartosci
    	obA.setA(10,20);
    	obB.setB(1,2,3);
    	obB.setA(-1, -2);
	// wypisujemy zawartosc
    	System.out.println("Zawartosc A: " + obA.zawartoscA());
    	System.out.println("Zawartosc B: " + obB.zawartoscB() + "\n");
	
 	// wypisujemy sumy
    	System.out.println("Suma A: " + obA.sumaA());
    	System.out.println("Suma B: " + obB.sumaB());
    	System.out.println("Suma B: " + obB.sumaA() + "\n");
   }
}
