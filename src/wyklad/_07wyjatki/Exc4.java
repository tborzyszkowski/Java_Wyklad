package wyklad._07wyjatki;
import java.util.Random;

class Exc4 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, j = 0;
		Random r = new Random();

		for (int i = 0; i < 100; i++) {
			try {
				b = r.nextInt(); 
				c = r.nextInt(); 
				a = 12345 / (b / c);
				System.out.flush();
				System.err.flush();

			} catch (ArithmeticException e) {
				System.out.println("Wyjątek: " + e);
				e.printStackTrace();
				System.out.flush();
				System.err.flush();
				a = 0;
				j++;
			}
			System.out.print("a = " + a + "\t b = " + b + "\t c = " + c);
			System.out.println("\t b/c = " + b / c);
			System.out.flush();
			System.err.flush();

		}
		System.out.println("j = "+ j);
	}
}

// Skompiluj i uruchom.
