package wyklad._07wyjatki;
class Exc8 {
	static void demoproc(int cnt) {
		int counter = cnt;
		try {
//			throw new IllegalArgumentException("ArgEx: test");
			IllegalArgumentException a = new IllegalArgumentException("ArgEx: test " + counter);

			throw a;
		} catch (IllegalArgumentException e) {
			System.out.println(counter  +" Wyjątek wewnątrz metody: " + e);
			System.out.flush();
			counter++;
			System.err.println(counter + " catch-1" + "hash: " + e.hashCode());
			System.err.flush();
			counter++;
			e.printStackTrace();
			System.err.flush();
			throw e; 
			//throw new ArithmeticException();
		} /*catch (ArithmeticException e) {
			System.out.println("Dzielenie przez 0 (v1): " + e);
			e.printStackTrace();
		}*/
//		finally{
//			return counter;
//		}
	}

	public static void main(String[] args) {
		int cnt = 0;
		try {
			demoproc(cnt++);
		} catch (IllegalArgumentException e) {
			System.out.println(cnt + " Wyjątek w main: " + e.getMessage());
			System.out.flush();
			cnt++;
			System.err.println(cnt + " catch-2"+ "hash: " + e.hashCode());
			System.err.flush();
			cnt++;
			e.printStackTrace();
			System.err.flush();
		} catch (ArithmeticException e) {
			System.out.println("Dzielenie przez 0 (v2): " + e);
			e.printStackTrace();
		}
	}
}
