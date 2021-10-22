package wyklad._02typy;

class BoolDemo {
	public static void main(String[] args) {
		boolean b;
		int x = 1, y = 2;
		b = false;

		b = x > y;
		
		System.out.println("b = " + b);
		b = true;
//		b = 1;
		System.out.println("b = " + b);

		if (b)
			System.out.println(" To zobaczymy ");

		b = false;
		if (b)
			System.out.println(" ... a tego nie  zobaczymy ");

		System.out.println("(1 > 2) == " + (1 > 2));
	}
}
