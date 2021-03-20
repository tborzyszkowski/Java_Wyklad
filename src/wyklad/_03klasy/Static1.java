package wyklad._03klasy;

class Static1 {
	static int a = 3;

	static void pisz(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
	}

	static void test(Integer i) {
		System.out.println("i = " + i.intValue());
	}

	static {
		System.out.println("Blok statyczny wykonany");
		a = a * 3;
	}

	public static void main(String[] args) {
		pisz(1234);
//		test(new Integer(3));

		pisz(56789);
	}
}
