package wyklad._02typy;

// Demonstracja promocji wyrazen
class Promote {
	public static void main(String args[]) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f; // f na koncu oznacza liczbe float
		double d = .1234;
		double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println((f * b) +  (i / c) + " - " + (d * s));
		System.out.println((double)((f * b) +  (i / c)) + " - " + (d * s));
		System.out.println( (f * b) +  (i / c) -  (d * s) );
		System.out.println("result = " + result);
		// (f * b): b jest promowane do float i wynik wyrazenia jest float
		// (i / c): c jest promowane do int i wynik jest int
		// (d * s): s jest promowane do double i wynik jest double
		// (f * b) + (i / c): (i / c) jest promowana do float
		// i wynik jest float
		// (f * b) + (i / c) - (d * s): (f * b) + (i / c) jest promowane do
		// double i wynik jest double
		System.out.println(1.1234500007 - 0.1234500006);
	}
}
