package wyklad._03klasy;

// Demonstracja metod przeciazonych

class Overload {
	// metoda bez parametrow
	void test() {
		System.out.println("Brak parametrow");
	}

	// metoda z parametrem calkowitym
	int test(int a) {
		System.out.println("int a = " + a);
		return a;
	}

	long test(long a) {
		System.out.println("long a = " + a);
		return a;
	}

	short test(short a) {
		System.out.println("short a = " + a);
		return a;
	}

	// metoda z dwoma parametrami calkowitymi
	int test(int a, int b) {
		System.out.println("int a = " + a + " int b = " + b);
		return 0;
	}

	int test(int a, double b) {
		System.out.println("int a = " + a + " double b = " + b);
		return 0;
	}

	int test(double a, int b) {
		System.out.println("double a = " + a + " int b = " + b);
		return 0;
	}

	int test(float a, int b) {
		System.out.println("float a = " + a + " int b = " + b);
		return 0;
	}

	int test(double a, double b) {
		System.out.println("double a = " + a + " double b = " + b);
		return 1;
	}

	double test(double a) {
		System.out.println("double a = " + a);
		return a * a;
	}

	double test(float a) {
		System.out.println("float a = " + a);
		return a * a;
	}
}

class OverloadDemo {
	public static void main(String args[]) {
		Overload ob = new Overload();
		// wywolania wszystkich wersji metody test
		ob.test();
		ob.test(10L);
		ob.test(10, 20.0);
		ob.test(10.0, 20.0);
		ob.test(10, 20);
		ob.test(10.0, 20);
		ob.test(10.0F, 20);
		System.out.println("test = " + ob.test(123.0f));
	}
}
