package wyklad._02typy;

// Demonstracja przeslaniania zmiennych
// !!! BLAD: Java nie pozwala przeslaniac zmiennych !!!
class ScopeErr {
	public static void main(String args[]) {
//		int x = 1;
		{ // tutaj zaczynamy nowy zakres
			int y = 1;
			int x = 2;
			// przesloniecie zmiennej x
			// BLAD: kompilator zglosi, ze zmienna x juz jest zdefiniowana
		}
		int y = 2;
		// int x = 5;
	}
}
