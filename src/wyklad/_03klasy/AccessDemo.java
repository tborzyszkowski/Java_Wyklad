package wyklad._03klasy;

// Przyklad roznic miedzy elementami public i private
class Access {
	int a; // dostep domyslny
	public int b; // dostep dla wszystkich
	private int c; // dostep tylko dla klasy

	// metody dostepu do c
	void setC(int i) { // ustaw c
		c = i * 2;
	}
	int getC() { // pobierz c
		return c * 2;
	}
}

// Klasa testujaca
class AccessDemo {
	public static void main(String args[]) {
		Access ob = new Access();

		// OK, a i b moga byc wykorzystywane bezposrednio
		ob.a = 10;
		ob.b = 20;

		// Natomiast tu bedzie blad
//		 ob.c = 100;
//		 ob.d = 11;
		// Do c mamy dostep tylko za pomoca metod
		ob.setC(100);
		System.out
				.println("a = " + ob.a + " b = " + ob.b + " c = " + ob.getC());
	}
}
