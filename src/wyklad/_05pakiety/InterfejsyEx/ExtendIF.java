package wyklad._05pakiety.InterfejsyEx;
// przyklad rozszerzania interfejsow

interface Aaa {
	void meth1();

	void meth2();
}

// interfejs Bbb rozszerza interfejs Aaa
// zawiera wiec meth1 i meth2
interface Bbb extends Aaa {
	void meth1();

	void meth3();
}

// ta klasa musi implementowac wszystkie metody z A i z B
// abstract
class MyClass implements Bbb {
	public void meth1() {
		System.out.println("Implementacja metody 1");
	}

	public void meth2() {
		System.out.println("Implementacja metody 2");
	}

	public void meth3() {
		System.out.println("Implementacja metody 3");
	}
}

// klasa testujaca
class TestExtendIF {
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		Aaa a;
		Bbb b;
		a = ob;
		b = ob;

		ob.meth1();
		ob.meth2();
		ob.meth3();
		// a.meth3();
		((Bbb) a).meth3();
		b.meth3();
		a = b;
		// b=a;
	}
}
