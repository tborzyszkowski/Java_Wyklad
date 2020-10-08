package wyklad._02typy;

// Demonstracja rzutowan typow niezgodnych
class Conversion {
	public static void main(String args[]) {
		byte b;
		int i = 257;
		double d = 323.942;

		System.out.println("\nKonwersja int do byte:");
		b = (byte) i;
		System.out.println("i = " + i + " b = " + b + " " + Byte.MAX_VALUE+" " + Byte.MIN_VALUE);

		System.out.println("\nKonwersja double do int:");
		i = (int) d;
		System.out.println("d = " + d + " i = " + i+ " " + Integer.MAX_VALUE);

		System.out.println("\nKonwersja double do byte:");
		b = (byte) d;
		System.out.println("d = " + d + " b = " + b);
		
		System.out.println((Integer.MAX_VALUE ) + " " + Integer.MIN_VALUE);
		
		long ll = 1234567890123456789L;
		double dd = ll;
		float ff = ll;
		ll = (long)ff;
		
	}
}
