package wyklad._07wyjatki;

import java.util.Random;

class Exc3 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, j = 0;
		Random r = new Random();
		long time1 = System.currentTimeMillis(),
				time2;
		for (int i = 0; i < 1000 * 1000 * 100; i++) {
			try {
				b = r.nextInt(); // zwraca jedną z 2^32 wartości
				//Thread.sleep(1);
				//if(i % 100000 == 0)
				// System.out.print(".");
				c = r.nextInt(); // całkowitych z jednakowym
				//Thread.sleep(1);
				a = 12345 / (b / c); // prawdopodobieństwem
			} catch (ArithmeticException e) {
				//System.out.println("Dzielenie przez zero");
				a = 0; // ustawiamy a i kontynuujemy pętlę
				j++;
			}
	    /* catch (InterruptedException e) {
				System.out.println("Watek glowny przerwany");
			}*/
			//System.out.print  ("a = " + a + "\t b = " + b + "\t c = " + c);
			//System.out.println("\t b/c = " + b/c);
		}
		time2 = System.currentTimeMillis();
		System.out.println("\nj = " + j);
		System.out.println("Time: " + (time2 - time1));
	}
}

// Skompiluj i uruchom. 
// Jaki bedzie efekt obslugi bledu i jak zachowa sie petla?
