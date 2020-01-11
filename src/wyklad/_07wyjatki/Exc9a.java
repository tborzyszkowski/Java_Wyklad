package wyklad._07wyjatki;

import java.util.Random;

class Exc9a {
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("Wewnątrz metody");
		Random rand = new Random();

		if (rand.nextBoolean()) {
			throw new IllegalAccessException("To tylko test");
//			throw new ArithmeticException("To tylko test");
		}
		else
//			throw new IllegalAccessException("To tylko test");
			throw new ArithmeticException("To tylko test");
	}

	public static void main(String args[]) throws IllegalAccessException 
	{
		throwOne();
	}
}
