package wyklad._07wyjatki;
class Exc5 {
	public static void main(String[] args) {
		try {
			int a = 0;
			System.out.println("a = " + a);
			System.out.flush();
			System.out.println("---clean---");
			int b = 2 / a;
			int c[] = { 1, 2 };
			c[b] = 99;
		} catch (ArithmeticException e) {
			System.err.println("Dzielenie przez 0: " + e + "\n");
			System.err.println("---clean---");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Indeks tablicy poza zakresem: " + e + "\n");
			System.err.println("---clean---");
		}
		System.err.flush();
		System.out.flush();
		System.out.println("Poza try/catch");
		System.out.println("---clean---");
	}
}

