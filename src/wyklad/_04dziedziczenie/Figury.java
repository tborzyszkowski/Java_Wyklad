package wyklad._04dziedziczenie;

import java.util.Random;

class Figura {
	double dim1, dim2;

	Figura(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	double pole() {
		return 0;
	}
}

class Prostokat extends Figura {

	Prostokat(double a, double b) {
		super(a, b);
	}

	double pole() {
		return dim1 * dim2;
	}
}

class Trojkat extends Figura {

	Trojkat(double a, double b) {
		super(a, b);
	}

	double pole() {
		return dim1 * dim2 / 2;
	}
}

// Klasa testujaca
class Figury {
	public static void main(String args[]) {
		Figura f;
		Prostokat p = new Prostokat(5, 4);
		Trojkat t = new Trojkat(5, 4);

		Figura figRef;

		figRef = p;
		System.out.println("Pole = " + figRef.pole());

		figRef = t;
		System.out.println("Pole = " + figRef.pole());

		System.out.println("-----------------");

		Random rand = new Random();

		switch (rand.nextInt(2)) {
			case 0:
				figRef = p;
				break;
			case 1:
				figRef = t;
				break;
			default:
				System.out.println("No Way");
				break;
		}
		;
		System.out.println("Pole  = " + figRef.pole());
		System.out.println("Klasa = " + figRef.getClass());
	}
} 
