package wyklad._04dziedziczenie;

class AO2 {
	int i;
	AO2(int i) {
		this.i = i;
	}
	public String toString() {
		return "A { i = " + i + " }";
	}
}
class BO2 extends AO2 {
	int k;
	BO2(int i, int k) {
		super(i);
		this.k = k;
	}
	public String toString() {
		return "B { " + super.toString() + " k = " + k + " }";
	}
}

class View {
	private final AO2 businessLogic;

	public View(AO2 businessLogic) {
		this.businessLogic = businessLogic;
	}
	void showOnConsole() {
		System.out.println(this.businessLogic);
	}
}

class Overriding2 {
	public static void main(String[] args) {
		BO2 obB = new BO2(1, 2);
//		AO2 obA = obB;
		AO2 obA = new AO2(3);

		View viewA = new View(obA);
		viewA.showOnConsole();

		View viewB = new View(obB);
		viewB.showOnConsole();

	}
}