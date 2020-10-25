package wyklad._03klasy;

class Static21 {
	static int a = 10;
	int b = 30;

	static void callMe() {
		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		System.out.println("this = " + this.b);
	}
}

class Static2 {
	public static void main(String args[]) {

		Static21.callMe();

		System.out.println("a = " + Static21.a);

		Static21 ob1 = new Static21();
		Static21 ob2 = new Static21();
		ob1.a = 17;
		ob1.b = 3;
		System.out.println("ob2.a = " + ob2.a);
		System.out.println("ob2.b = " + ob2.b);
		Static21.a = 27;
		System.out.println("Static21.a = " + Static21.a);
		System.out.println("ob1.a = " + ob1.a + " ob2.a = " + ob2.a);
	}
}
