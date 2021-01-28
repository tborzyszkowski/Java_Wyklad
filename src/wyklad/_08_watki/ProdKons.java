package wyklad._08_watki;

class Bufor1 {
	int n;
	boolean jest = false;

	synchronized int get() {
		if (!jest)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Przerwane");
			}
		System.out.println("Konsumpcja: " + n);
		jest = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		if (jest)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Przerwane");
			}
		this.n = n;
		jest = true;
		System.out.println("Produkcja:  " + n);
		notify();
	}
}

class Producent1 implements Runnable {
	Bufor1 b;

	Producent1(Bufor1 b) {
		this.b = b;
		new Thread(this, "Producent").start();
	}

	public void run() {
		int i = 0;

		while (true) {
			b.put(i++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("....");
			}
		}
	}
}

class Konsument1 implements Runnable {
	Bufor1 b;

	Konsument1(Bufor1 b) {
		this.b = b;
		new Thread(this, "Konsument").start();
	}

	public void run() {
		while (true) {
			b.get();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("....");
			}
		}
	}
}

class ProdKons {
	public static void main(String[] args) {
		Bufor1 b = new Bufor1();
		new Producent1(b);
		new Konsument1(b);

		System.out.println("Nacisnij Ctrl-C by zakonczyc");
	}
}
