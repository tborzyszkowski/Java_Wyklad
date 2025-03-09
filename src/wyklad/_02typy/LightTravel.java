package wyklad._02typy;

class LightTravel {
	public static void main(String[] args) {
		int lightSpeed = 299792; // km/s
		long days = 100 * 1000 * 1000;        // badana liczba dni
		long seconds = days * 24 * 60 * 60;   // tyle to sekund
		long distance = lightSpeed * seconds; // tyle przebedzie swiatlo
		// teraz odpowiedz
		System.out.print("W ciagu " + days + " sekund: " + seconds);
		System.out.print(" dni swiatlo przebedzie okolo ");
		System.out.println("\n" + distance + " kilometrow");

		long distance2 = Math.multiplyExact(lightSpeed, seconds);
		System.out.println("\n" + distance2 + " kilometrow");

		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.abs(Integer.MIN_VALUE + 1));
		System.out.println(Math.abs(Integer.MAX_VALUE + 1));
//	double a = 1;
//	byte b = (byte)(a*a);
//	float c = a * a;
	}
}
