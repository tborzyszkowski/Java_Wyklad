package _03_Klasy;

// Demonstracja uzycia zmiennej statycznej i metody statycznej poza klasa

class Static21 {
	static int a = 10;
	static int b = 20;
	int c = 30;

	static void callMe() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		// System.out.println ("c = " + c);
	}
}

// Klasa testujaca
class Static2 {
	public static void main(String args[]) {
		// dostep do metody statycznej
		Static21.callMe();
		// dostep do zmiennej statycznej
		System.out.println("b = " + Static21.b);

		Static21 ob1 = new Static21();
		Static21 ob2 = new Static21();
		System.out.println("-----------------");
		ob1.a = 17;
		ob1.c = 3;
		System.out.println("ob2.a = " + ob2.a);
		System.out.println("ob2.c = " + ob2.c);
		System.out.println("-----------------");
		Static21.a = 27;
		System.out.println("Static21.a = " + Static21.a);
		System.out.println("ob1.a = " + ob1.a+" ob2.a = " + ob2.a);
	}
}
