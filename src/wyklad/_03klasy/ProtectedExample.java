package wyklad._03klasy;

class Base {
	private int a;
	protected int b;
	public int c;
}

class Derived extends Base {
	void F(Base b) {
//		System.out.println("a = " + b.a);
		System.out.println("b = " + b.b);
		System.out.println("c = " + b.c);
	}

	void G(Derived d) {
//		System.out.println("a = " + d.a);
		System.out.println("b = " + d.b);
		System.out.println("c = " + d.c);
	}
}

public class ProtectedExample {
	public static void main(String[] args) {
		Base b = new Base();
		Derived d = new Derived();
		
		d.F(b);
		d.G(d);
	}
}
