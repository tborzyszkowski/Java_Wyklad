package wyklad._02typy;

class Scope {
	public static void main(String[] args) {
		int x = 10;
		if (x == 10) {
			int y = 20;
			System.out.println("x = " + x + " y = " + y);
//			int x = 5;
			x = y * 2;
		}
//		y = 100;

		System.out.println("x = " + x);
		fun(x + x);
	}
	
	public static void fun(int a) {
		System.out.print(a);
	}
}
