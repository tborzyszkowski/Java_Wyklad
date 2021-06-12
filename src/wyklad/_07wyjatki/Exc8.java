package wyklad._07wyjatki;
class Exc8 {
	static void demoproc() {
		try {
			throw new IllegalArgumentException("ArgEx: test");
//			IllegalArgumentException a = new IllegalArgumentException("ArgEx: test");
//			throw a;
		} catch (IllegalArgumentException e) {
			System.out.println("Wyjątek wewnątrz metody: " + e);
			e.printStackTrace();
			throw e; 
			//throw new ArithmeticException();
		} /*catch (ArithmeticException e) {
			System.out.println("Dzielenie przez 0 (v1): " + e);
			e.printStackTrace();
		}*/
	}

	public static void main(String[] args) {
		try {
			demoproc();
		} catch (IllegalArgumentException e) {
			System.out.println("Wyjątek w main: " + e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Dzielenie przez 0 (v2): " + e);
			e.printStackTrace();
		}
	}
}
