package wyklad._03klasy;

class Absolute {
	int abs(int a) {
		return (a > 0) ? a : -a;
	}

	long abs(long a) {
		return (a > 0) ? a : -a;
	}

	float abs(float a) {
		return (a > 0) ? a : -a;
	}

	double abs(double a) {
		return (a > 0) ? a : -a;
	}
}

class AbsDemo {
	public static void main(String args[]) {
		Absolute ob = new Absolute();
		System.out.println("int    abs = " + ob.abs((short) -100));
		System.out.println("int    abs = " + ob.abs(-100));
		System.out.println("long   abs = " + ob.abs(-100000000000000000L));
		System.out.println("float  abs = " + ob.abs(-123456789.123456789f));
		System.out.println("float  abs = " + 123456789.123456789f);
		System.out.println("double abs = " + ob.abs(-123456789.123456789));
		System.out.println("double abs = "
				+ ob.abs(-123456789.123456789123456789));
	}
}
