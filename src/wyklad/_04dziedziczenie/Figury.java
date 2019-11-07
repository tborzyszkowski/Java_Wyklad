package wyklad._04dziedziczenie;

import java.util.Random;

// Przyklad hierarchii klas figur geometrycznych
class Figura {
    double dim1, dim2;

    Figura(double a, double b) {
    	dim1 = a;
    	dim2 = b;
    }

    double pole() {
    	System.out.println("Pole dla figury nie jest zdefiniowane");
    	return 0;
    }
}

class Prostokat extends Figura {

    Prostokat(double a, double b) {
    	super(a, b);
    }
    
    // nadpisujemy pole
    double pole() {
    	System.out.println("Pole prostokata");
    	return dim1 * dim2;
    }
}

class Trojkat extends Figura {

    Trojkat(double a, double b) {
    	super(a, b);
    }
    
    // nadpisujemy pole
    double pole() {
    	System.out.println("Pole trojkata");
    	return dim1 * dim2 / 2;
    }
}

// Klasa testujaca
class Figury {
    public static void main (String args[]) {
    	Figura    f = new Figura(10, 10);
    	Prostokat p = new Prostokat(5, 4);
    	Trojkat   t = new Trojkat(5, 4);

    	Figura figRef;

    	figRef = p;   // prostokat
    	System.out.println("Pole = " + figRef.pole());

    	figRef = t;   // trojkat
		System.out.println("Pole = " + figRef.pole());

		figRef = f;   // figura 
		System.out.println("Pole = " + figRef.pole());
		System.out.println("-----------------");
		
		Random rand = new Random();
		
		switch (rand.nextInt(3)) {
		case 0:
			figRef = f;
			break;
		case 1:
			figRef = p;
			break;
		case 2:
			figRef = t;
			break;
		default:
			System.out.println("No Way");
			break;
		};
		System.out.println("Pole  = " + figRef.pole());
		System.out.println("Klasa = " + figRef.getClass());
    }
} 
