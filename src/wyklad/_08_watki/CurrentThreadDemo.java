package wyklad._08_watki;

class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();

		System.out.println("Biezacy watek    : " + t);

		t.setName("Glowny");
		System.out.println("Po zmianie nazwy : " + t);

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Watek glowny przerwany");
		}
		System.out.print("KONIEC");
	}
}
