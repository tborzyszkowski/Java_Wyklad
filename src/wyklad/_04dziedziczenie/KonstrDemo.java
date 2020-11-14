package wyklad._04dziedziczenie;

class AK {
	AK(int i) {
		//super();
		int x = i + 1;
		//super();
		System.out.println("Konstruktor z A: " + x);
	}
	AK() {
		//super();
		System.out.println("Konstruktor z A()");
	}
}
class BK extends AK {
	BK(int i) {
		super(i + 1);
		System.out.println("Konstruktor z B: " + i);
	}
	BK() {//super();
		System.out.println("Konstruktor z B()");
	}
}
class CK extends BK {
	CK() {
//		super();
//		super(2);
		System.out.println("Konstruktor z C()");
	}
}
class KonstrDemo {
	public static void main(String[] args) {
		new CK();
	}
}
