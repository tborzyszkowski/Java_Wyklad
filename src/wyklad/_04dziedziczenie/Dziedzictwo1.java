package wyklad._04dziedziczenie;

class A1 {
	private int i;

	void initA(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int sumaA() {
		return i;
	}
	public String toString() {
		return "A1 { i = " + i + " }";
	}
}
class B1 extends A1 {
	private int j;
	public void initB(int i, int j) {
		initA(i);
		this.j = j;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
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
	public static void main(String[] args) {
		A1 obA = new A1();
		B1 obB = new B1();

		obA.initA(10);
		obB.initB(1, 2);
		obB.initA(-1);

		System.out.println("Zawartosc A: " + obA);
		System.out.println("Zawartosc B: " + obB);

		System.out.println("Suma A: " + obA.sumaA());
		System.out.println("Suma B: " + obB.sumaB());
		System.out.println("Suma B: " + obB.sumaA());
	}
}
