package _08_Watki;
// przyklad wplywu na watek glowny programu
class CurrentThreadDemo {
	public static void main(String args[]) {
		Thread t = Thread.currentThread();

		// metoda toString() watku oddaje:
		// nazwe watku, jego priorytet i nazwe grupy watkow, do ktorej nalezy
		System.out.println("Biezacy watek    : " + t);
		
		// zmieniamy nazwe watku
		t.setName("Glowny");
		// pobranie nazwy watku metoda getName()
		System.out.println("Po zmianie nazwy : " + t);

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(1000); // zatrzymanie wykonania na 1000 milisekund
			}
		}
		// sprawdzanie czy inny watek nie chce przerwac snu
		catch (InterruptedException e) {
			System.out.println("Watek glowny przerwany");
		}
		System.out.print("KONIEC");
	}
}
