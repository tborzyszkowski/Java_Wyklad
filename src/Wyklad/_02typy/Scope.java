package wyklad._02typy;

// Demonstracja zakresow zmiennych
class Scope {
	public static void main(String args[]) {
		int x; // zmienna x rozpoznawalna w calej metodzie main

		x = 10;
		if (x == 10) { // tu zaczynamy nowy zakres
			int y = 20; // zmienna y dostepna tylko w tym zakresie
			// tu mozemy korzystac z x i y
			System.out.println("x = " + x + " y = " + y);
//			int x = 5;
			x = y * 2;
		}
//		y = 100; // BLAD: tutaj y nie jest znany

		// natomiast x jest
		System.out.println("x = " + x);
		fun(x + x);
	}
	
	public static void fun(int a) {
		System.out.print(a);
	}
}
