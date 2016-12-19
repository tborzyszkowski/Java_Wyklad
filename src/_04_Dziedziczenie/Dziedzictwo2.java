package _04_Dziedziczenie;

// Przyklad dziedziczenia ze zmiennymi prywatnymi
// Zmienne prywatne nie sa dostepne dla klas podrzednych

// Klasa nadrzedna
class A2 {
	int i;
	private int j; // tym razem j jest prywatna

	// ustawianie wartosci
	void setA(int a, int b) {
		i = a;
		j = b;
	}

	// pokaz zawartosc klasy
	String zawartoscA() {
		return ("\ti = " + i + "\tj = " + j);
	}

	// suma zawartosci
	int sumaA() {
		return i + j;
	}

	int getJ() {
		return 2 * j;
	}

	void setJ(int a) {
		j = 3 * a;
	}
}

// Klasa podrzedna
class B2 extends A2 {
	int k;

	// ustawianie wartosci
	void setB(int a, int b, int c) {
		setA(a, b);
		// j= a+ b;
		setJ(a + b);
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

	// niepoprawna definicja metody
	int sumaB2() {
		return i + getJ() + k;
	}
}

class C22 extends B2 {
	int m;

	void setC(int a, int b, int c, int d) {
		setB(a, b, c);
		m = d;
		C22 x = new C22();
		x.setB(a, b, c);
		System.out.println("C22.x.a = " + x.k);
	}

	String zawartoscC() {
		return zawartoscB() + "\tm = " + m;
	}

	int sumaC() {
		return sumaB2() + m + getJ();
	}
}

class Dziedzictwo2 {
	public static void main(String args[]) {
		A2 obA = new A2();
		B2 obB = new B2();
		C22 obC = new C22();

		// ustawiamy wartosci
		obA.setA(10, 20);
		obB.setB(1, 2, 3);
		obC.setC(-1, -2, -3, -4);
		obC.setA(-10, -100);

		// wypisujemy zawartosc
		System.out.println("Zawartosc A: " + obA.zawartoscA());
		System.out.println("Zawartosc B: " + obB.zawartoscB());
		System.out.println("Zawartosc C: " + obC.zawartoscC());

		// wypisujemy sumy
		System.out.println("Suma A: " + obA.sumaA());
		System.out.println("Suma B: " + obB.sumaB());
		System.out.println("Suma C: " + obC.sumaC());

		System.out.println("Suma C z A: " + obC.sumaA());
	}
}
