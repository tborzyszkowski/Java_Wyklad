package wyklad._05pakiety;

import java.util.Random;

interface SharedConstants {
	int NO = 0;
	int YES = 1;
	int MAYBE = 2;
	int LATER = 3;
	int SOON = 4;
	int NEVER = 5;
}

class Question implements SharedConstants {
	Random rand = new Random();

	int ask() {
		// liczby z zakresu 0.0 do 1.0
		int prob = (int) (100 * rand.nextDouble());
		if (prob < 30)
			return NO; // 30 %
		else if (prob < 60)
			return YES; // 30%
		else if (prob < 75)
			return LATER; // 15%
		else if (prob < 85)
			return MAYBE; // 10%
		else if (prob < 98)
			return SOON; // 13%
		else
			return NEVER; // 2%

	}
}

class AskMe implements SharedConstants {
	static String answer(int result) {
		String wynik = "";
		switch (result) {
			case NO:
				wynik = "No";
				break;
			case YES:
				wynik = "Yes";
				break;
			case MAYBE:
				wynik = "Maybe";
				break;
			case LATER:
				wynik = "Later";
				break;
			case SOON:
				wynik = "Soon";
				break;
			case NEVER:
				wynik = "Never";
				break;
		}
		return wynik;
	}

	public static void main(String[] args) {

		Question q = new Question();
		long[] wyniki = {0, 0, 0, 0, 0, 0};
		long n = 100; // * 1000;// * 1000;
		for (long i = 0; i < n; i++) {
			wyniki[q.ask()]++;
		}
		for (int i = 0; i < wyniki.length; i++) {
			System.out.print(answer(i) + "\t");
		}
		System.out.println();
		for (int i = 0; i < wyniki.length; i++) {
			System.out.print(((100.0 * wyniki[i]) / n) + "\t");
		}
		System.out.println();
		System.out.println("30.0\t30.0\t10.0\t15.0\t13.0\t2.0");
	}
}
