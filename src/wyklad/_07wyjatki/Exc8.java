package wyklad._07wyjatki;
class Exc8 {
	static void demoproc() throws NullPointerException {
		try {
			NullPointerException a = new NullPointerException("To tylko test");
			throw a;
		} catch (NullPointerException e) {
			System.out.println("Wyjątek wewnętrz metody: " + e);
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
		} catch (NullPointerException e) {
			System.out.println("Wyjątek w main: " + e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Dzielenie przez 0 (v2): " + e);
			e.printStackTrace();
		}
	}
}
