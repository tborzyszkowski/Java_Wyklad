package wyklad._04dziedziczenie;

abstract class FiguraAbs {
	double dim1, dim2;

	FiguraAbs(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	abstract double pole();
}

class Prostokat2 extends FiguraAbs {

	Prostokat2(double a, double b) {
		super(a, b);
	}

	double pole() {
		return dim1 * dim2;
	}
}

class Trojkat2 extends FiguraAbs {

	Trojkat2(double a, double b) {
		super(a, b);
	}

	double pole() {
		return dim1 * dim2 / 2;
	}
}

class FiguryDemo2 {
	public static void main(String args[]) {
		// FiguraAbs f = new FiguraAbs(10, 10);
		Prostokat2 p = new Prostokat2(5, 4);
		Trojkat2 t = new Trojkat2(5, 4);

		FiguraAbs figRef;

		figRef = p; // prostokat
		System.out.println("Pole = " + figRef.pole());

		figRef = t; // trojkat
		System.out.println("Pole = " + figRef.pole());
	}
}
