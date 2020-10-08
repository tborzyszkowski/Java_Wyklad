package wyklad._03klasy;

// Demonstracja klas wewnetrznych

class Outer1 {
	int outer_x = 100;
	Inner1 inner = new Inner1();

	void test() {
		Inner1 inner = new Inner1();
		inner.x = 2;
		inner.display();
		this.inner.x = 3;
		System.out.println("this.inner.x = " + this.inner.x + " inner.x = " + inner.x);
//    	Inner1.x = 11;
//    	x = 12;
	}

	void printInner() {
		System.out.println("x = " + inner.x);
		inner.display();
	}

	// definicja klasy wewnetrznej
	class Inner1 {
		int x = 10;

		//    	int outer_x = 101;
		void display() {
			inner.x = 1001;
			System.out.println("\ndisplay: outer_x = " + outer_x + "\ninner x = " + x + "\ninner.x = " + inner.x);
		}
	}
}

class Inner1 {
	public static void main(String args[]) {
		Outer1 outer = new Outer1();

		outer.test();
		outer.inner.display();
		Object o = outer.inner;
		//outer.printInner();
	}
}
// UWAGA: Klasy wewnetrzne nie byly dostepne w SDK 1.0
//        Zostaly dodane dopiero do SDK 1.1. Wrocimy jeszcze do klas 
//        wewnerznych podczas omawiania obslugo zdarzen.
