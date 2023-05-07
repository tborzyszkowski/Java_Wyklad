package wyklad._04dziedziczenie;

class AO3 {
	int i;
	AO3(int i) {
		this.i = i;
	}
	void showOnConsole() {
		System.out.println((this));
	}
	public String toString() {
		return "A { i = " + i + " }";
	}
}

class BO3 extends AO3 {
	int j;
	BO3(int i, int j) {
		super(i);
		this.j = j;
	}
	void showOnConsole(String msg) {
		System.out.println(msg + this);
	}
	public String toString() {
		return "B { " + super.toString() + " j = " + j + " }";
	}
}

class Overriding3 {
	public static void main(String[] args) {
		BO3 obB = new BO3(1, 2);
		AO3 obA = obB;

		obB.showOnConsole();
		obB.showOnConsole("To jest k: ");
		obA.showOnConsole();
//		obA.showOnConsole("aaa");
		((BO3) obA).showOnConsole("aaa");
	}
}
