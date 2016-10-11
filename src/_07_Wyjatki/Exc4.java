package _07_Wyjatki;
import java.util.Random;

class Exc4 {
	public static void main(String args[]) {
		int a = 0, b = 0, c = 0, j = 0;
		Random r = new Random();

		for (int i = 0; i < 20; i++) {
			try {
				b = r.nextInt(); 
				c = r.nextInt(); 
				a = 12345 / (b / c); 
			} catch (ArithmeticException e) {
				System.out.println("Wyjątek: " + e);
				e.printStackTrace();
				a = 0; 
				j++;
			}
			System.out.print("a = " + a + "\t b = " + b + "\t c = " + c);
			System.out.println("\t b/c = " + b / c);
		}
		System.out.println("j = "+ j);
	}
}

// Skompiluj i uruchom.
// Jaki b�dzie efekt obs�ugi b��du i jak zachowa si� p�tla?
