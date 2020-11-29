package wyklad._05pakiety;

interface Pierwszy {
	void meth1();
	void meth2();
}


interface Drugi extends Pierwszy {
	void meth1();
	void meth3();
}

class Implementacja implements Drugi {
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
		Implementacja ob = new Implementacja();
		Pierwszy pierwszy;
		Drugi drugi;
		pierwszy = ob;
		drugi = ob;

		ob.meth1();
		ob.meth2();
		ob.meth3();
//		pierwszy.meth3();
		((Drugi) pierwszy).meth3();
		drugi.meth2();
		pierwszy = drugi;
//		drugi = pierwszy;
	}
}
