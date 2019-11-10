package wyklad._03klasy;

class Static1 {
	static int a = 3;
	static int b = 1;

	static void pisz(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static void test(Integer i) {
		System.out.println("i = " + i.intValue());
	}

	static {
		System.out.println("Blok statyczny wykonany");
		b = b * 4;
	}

	public static void main(String args[]) {
		pisz(1234);
		test(new Integer(3));

		pisz(56789);
	}
}
