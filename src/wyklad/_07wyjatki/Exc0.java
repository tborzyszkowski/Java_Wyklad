package wyklad._07wyjatki;

class Exc0 {
	public static void main(String[] args) {
		int d = 0;
		int a = 42 / d;
		System.out.print(a);
		System.err.println("Hello ERROR");
	}
}

// Skompiluj i uruchom.
// Jakie informacje otrzymujemy wraz z błędem?
