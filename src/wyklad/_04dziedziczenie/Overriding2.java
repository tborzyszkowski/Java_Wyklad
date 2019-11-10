package wyklad._04dziedziczenie;

class AO2 {
	int i;

	AO2(int a, int b) {
		i = a;
	}

	void showOnConsole() {
		System.out.println((this));
	}

	public String toString() {
		return "A { i = " + i + " }";
	}
}

class BO2 extends AO2 {
	int k;

	BO2(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	void showOnConsole() {
		System.out.println(this);
	}

	public String toString() {
		return "B { " + super.toString() + " k = " + k + " }";
	}
}

class Overriding2 {
	public static void main(String args[]) {
		BO2 obB = new BO2(1, 2, 3);
//    	AO2 obA = obB;
		AO2 obA = new AO2(3, 4);

		obB.showOnConsole();
		System.out.println(obB.getClass() + " " + obB);
		obA.showOnConsole();
		System.out.println(obA.getClass() + " " + obA);
	}
}