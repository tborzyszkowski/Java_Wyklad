package wyklad._04dziedziczenie;

class BaseA {
	 static void method() {
		System.out.println("Base");
	}
}

public class StaticInheritance extends BaseA {
	 static void method() {
		System.out.println("StaticInh");
	}

	public static void main(String args[]) {
		BaseA.method();
		StaticInheritance.method();

		BaseA b = new BaseA();
		StaticInheritance c = new StaticInheritance();

		b.method();
		c.method();

		b = c;

		b.method();
		c.method();
	}
}
