package wyklad._07wyjatki;

class Exc7 {
	static void nesttry(int a) {
		try { 
			if( a==1 ) a = a/(a-a); 
			if( a==2 ) {
				int c[] = { 1 };
				c[42] = 99; 
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indeks tablicy poza zakresem: " + e);
		}
	}
	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 42 / a; 
			System.out.println("a = " + a);
			nesttry(a); 
			System.out.println("AQQ");
		} 
		catch (ArithmeticException e) {
			System.out.println("Dzielenie przez 0: " + e);
		}
	}
}
