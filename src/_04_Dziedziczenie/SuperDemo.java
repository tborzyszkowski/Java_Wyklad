package _04_Dziedziczenie;

// Przyklad uzycia super do odslaniania nazw

class A {
	int i;

	A() {
		i = 5;
	}

	A(int i) {
		super();
		this.i = i;
	}
	public String toString() {
		return "A.i = " + i;
	}
}

class B extends A {
	int i; // to i przykrywa i z klasy A

	// konstruktor
	B(int a, int b) {
		//super();
//		i = 1;
		super(a);
		super.i = a; // odwolania do i w A
		this.i = b;
	}

	// reprezentacja napisowa
	public String toString() {
		return super.toString() + " B.i = " + i;// +super.super.toString();
	}
}

class SuperDemo {
	public static void main(String args[]) {
		B obB = new B(1, 2);

		System.out.println(obB);
	}
}
