package _04_Dziedziczenie;

// Demonstracja nadpisania metody

class AO3 {
	int i, j;

	AO3(int a, int b) {
		i = a;
		j = b;
	}

	// wyswietl i oraz j
	void show() {
		System.out.println(" i = " + i + " j = " + j);
	}
}

class BO3 extends AO3 {
	int k;

	BO3(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// wyswietl k - metoda ta nadpisuje metode show z A
	void show(String msg) {
		System.out.println(msg + k);
	}
}

// klasa testujaca
class Overriding3 {
	public static void main(String args[]) {
		BO3 obB = new BO3(1, 2, 3);
		AO3 obA = obB;

		obB.show(); // wywolanie show() z A
		obB.show("To jest k: "); // wywolanie show() z B
		obA.show();
//		obA.show("aaa")
		((BO3)obA).show("aaa");
	}
}
