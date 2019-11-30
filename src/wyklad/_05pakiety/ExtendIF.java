package wyklad._05pakiety;

interface Aaaaa {
	void meth1();

	void meth2();
}


interface Bbb extends Aaaaa {
	void meth1();

	void meth3();
}

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

class TestExtendIF {
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		Aaaaa a;
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
//		b = a;
	}
}
