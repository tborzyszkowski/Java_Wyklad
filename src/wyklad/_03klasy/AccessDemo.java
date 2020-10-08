package wyklad._03klasy;


class Access {
	int a;
	public int b;
	private int c;

	void setC(int i) { // ustaw c
		c = i * 2;
	}

	int getC() { // pobierz c
		return c * 2;
	}
}

class AccessDemo {
	public static void main(String args[]) {
		Access ob = new Access();

		ob.a = 10;
		ob.b = 20;

//		ob.c = 100;
//		ob.d = 11;
		ob.setC(100);
		System.out
				.println("a = " + ob.a + " b = " + ob.b + " c = " + ob.getC());
	}
}
