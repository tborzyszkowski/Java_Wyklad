package _08_Watki;
// przyklad tworzenia nowego watku 
// przez rozszerzenie klasy Thread
class NewThread2 extends Thread {

	NewThread2() {
		// tworzenie nowego watku
		super("Nowy watek");
		System.out.println("Nowy watek      > " + this);
		// uruchom watek
		start();
	}

	// kod nowego watku
	public void run() {
		long time1 = System.currentTimeMillis(), time2;
		int a = 0;
		try {

			for (int i = 1000; i > 0; i--) {
				Thread.sleep(1);
				a++;
				System.out.println("Nowy watek      > " + i);
			}
		} catch (// InterruptedException e
		Exception e) {
			System.out.println("Watek potomny przerwany");
		}
		time2 = System.currentTimeMillis();
		System.out.println("Koniec nowego watku: " + a + " [" + (time2 - time1)
				+ "]");
	}
}

class ExtendThreadDemo {
	public static void main(String args[]) {
		new NewThread2(); // utworz nowy watek
		Thread t = Thread.currentThread();
		long time1 = System.currentTimeMillis(), 
				time2;

		t.setName("Watek glowny");
		System.out.println("Watek glowny    : " + t);
		try {
			for (int i = 100; i > 0; i--) {
				System.out.println("Watek glowny    : " + i);
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			System.out.println("Watek glowny przerwany");
		}
		time2 = System.currentTimeMillis();
		System.out.println("Koniec watku glownego:"+"<"+(time2-time1)+">");
	}
}
