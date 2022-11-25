package wyklad._04dziedziczenie;

class A2 {
	int i;
	private int j;
	A2(){}
	A2(int i, int j) {
		this.i = i;
		this.setJ(j);
	}
	public String toString() {
		return "\ti = " + i + "\tj = " + j;
	}
	int suma() {
		return i + j;
	}

	public int getJ() {
		return 2 * j;
	}
	public void setJ(int j) {
		if (valid(j))
			this.j = 3 * j;
		else
			this.j = -1;
	}

	private boolean valid(int j) {
		return j < 10 ;
	}
}

class B2 extends A2 {
	int k;

	B2(int i, int j, int k) {
		//super();
		super(i, j);
		i = 1;
//		this.j = i + j;
//		setJ(i + j);
		this.k = k;
	}

	public String toString() {
		return super.toString() + "\tk = " + k;
	}
	int suma() {
		return super.suma() + k;
	}
}

class C22 extends B2 {
	int m;

	C22(int i, int j, int k, int m) {
		super(i, j, k);
		this.m = m;
	}

	public String toString() {
		return super.toString() + "\tm = " + m;
	}
	int suma() {
		return super.suma() + m;
	}
}

class Dziedzictwo2 {
	public static void main(String[] args) {
		A2 obA = new A2(10, 20);
		B2 obB = new B2(1, 2, 3);
		C22 obC = new C22(-1, -2, -3, -4);

		System.out.println("Zawartosc A: " + obA);
		System.out.println("Zawartosc B: " + obB);
		System.out.println("Zawartosc C: " + obC);

		System.out.println("Suma A: " + obA.suma());
		System.out.println("Suma B: " + obB.suma());
		System.out.println("Suma C: " + obC.suma());

		System.out.println("Suma C z A: " + obC.suma());
	}
}
