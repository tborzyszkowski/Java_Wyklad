package wyklad._04dziedziczenie;

class A1 {
	private int i;

	void setA(int i) {
		this.i = i;
	}

	int getI() {
		return i;
	}

	int sumaA() {
		return i;
	}

	public String toString() {
		return "A1 { i = " + i + " }";
	}
}

class B1 extends A1 {
	int j;

	void setB(int i, int j) {
		setA(i);
		this.j = j;
	}

	int sumaB() {
		return sumaA() + j;
	}

	public String toString() {
		return "B1 { " + super.toString() + " j = " + j + " }";
	}
}

class Dziedzictwo1 {
	public static void main(String args[]) {
		A1 obA = new A1();
		B1 obB = new B1();

		obA.setA(10);
		obB.setB(1, 2);
		obB.setA(-1);

		System.out.println("Zawartosc A: " + obA);
		System.out.println("Zawartosc B: " + obB);

		System.out.println("Suma A: " + obA.sumaA());
		System.out.println("Suma B: " + obB.sumaB());
		System.out.println("Suma B: " + obB.sumaA());
	}
}
