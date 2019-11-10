package wyklad._04dziedziczenie;

class AO3 {
	int i;
	AO3(int a) {
		i = a;
	}
	void showOnConsole() {
		System.out.println((this));
	}
	public String toString() {
		return "A { i = " + i + " }";
	}
}
class BO3 extends AO3 {
	int k;
	BO3(int a, int b, int c) {
		super(a);
		k = c;
	}
	void showOnConsole(String msg) {
		System.out.println(msg + this);
	}
	public String toString() {
		return "B { " + super.toString() + " k = " + k + " }";
	}
}
class Overriding3 {
	public static void main(String args[]) {
		BO3 obB = new BO3(1, 2, 3);
		AO3 obA = obB;

		obB.showOnConsole();
		obB.showOnConsole("To jest k: ");
		obA.showOnConsole();
//		obA.showOnConsole("aaa");
		((BO3)obA).showOnConsole("aaa");
	}
}
