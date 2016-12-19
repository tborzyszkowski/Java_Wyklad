package _04_Dziedziczenie;

// Figury geometryczne raz jeszcze 
// z zastosowaniem klas abstrakcyjnych
abstract class FiguraAbs {
	double dim1, dim2;

	FiguraAbs(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	// pole jest teraz metoda abstrakcyjna
	abstract double pole();

}

class Prostokat2 extends FiguraAbs {

	Prostokat2(double a, double b) {
		super(a, b);
	}

	// ukonkretniamy metode pole
	double pole() {
		System.out.println("Pole prostokata");
		return dim1 * dim2;
	}
}

class Trojkat2 extends FiguraAbs {

	Trojkat2(double a, double b) {
		super(a, b);
	}

	// ukonkretniamy metode pole
	double pole() {
		System.out.println("Pole trojkata");
		return dim1 * dim2 / 2;
	}
}

// Klasa testujaca
class FiguryDemo2 {
	public static void main(String args[]) {
		// Ponizsza linia spowoduje blad: instancja klasy abstrakcyjnej
		// FiguraAbs f = new FiguraAbs(10, 10);
		Prostokat2 p = new Prostokat2(5, 4);
		Trojkat2 t = new Trojkat2(5, 4);
		// Mozemy za to deklarowac zmienne referencyjne klas abstrakcyjnych
		// poniewaz nie powoduje to tworzenia obiektu
		FiguraAbs figRef;

		figRef = p; // prostokat
		System.out.println("Pole = " + figRef.pole());

		figRef = t; // trojkat
		System.out.println("Pole = " + figRef.pole());
	}
}
