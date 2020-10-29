package wyklad._04dziedziczenie;

class A {
	int i;
	A() { i = 5; }
	A(int i) {
		this.i = i;
	}
	public String toString() {
		return "A.i = " + i;
	}
}

class B extends A {
	int i;
	B(int a, int b) {
		super(a);
		super.i = a;
		this.i = b;
	}
	public String toString() {
		return super.toString() + " B.i = " + i;
	}
}

class SuperDemo {
	public static void main(String args[]) {
		B obB = new B(1, 2);

		System.out.println(obB);
	}
}
