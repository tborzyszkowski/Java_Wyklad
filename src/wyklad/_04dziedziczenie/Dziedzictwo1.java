package wyklad._04dziedziczenie;

class A1 {
	private int i;
	A1(){
		this.i = 0;
	}
	A1(int i) {
		this.i = i;
	}
	public int getI() {
		return i+1;
	}
	public void setI(int i) {
		if (i > 0)
			this.i = i;
		else
			this.i = -i;
	}
	public int suma() {
		return i;
	}
	public String toString() {
		return "A1 { i = " + i + " }";
	}
}
class B1 extends A1 {
	private int j;
	//B1(){}
	B1(int i, int j) {
		//super();
		super(i);
		this.j = j;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int suma() {
		return super.suma() + j;
	}
	public String toString() {
		return "B1 { " + super.toString() + " j = " + j + " }";
	}
}
class Dziedzictwo1 {
	public static void main(String[] args) {
		A1 obA = new A1(1);
		B1 obB = new B1(11, 22);

		System.out.println("Zawartosc A: " + obA);
		System.out.println("Zawartosc B: " + obB);

		System.out.println("Suma A: " + obA.suma());
		System.out.println("Suma B: " + obB.suma());
		obA = obB;
		System.out.println("Suma A: " + obA.suma());
	}
}
