package wyklad._08_watki;

class Bufor {
	int n;

	synchronized int get() {
		System.out.println("Konsumpcja: " + n);
		return n;
	}

	synchronized void put(int n) {
		this.n = n;
		System.out.println("Produkcja:  " + n);
	}

}

class Producent implements Runnable {
	Bufor b;

	Producent(Bufor b) {
		this.b = b;
		new Thread(this, "Producent").start();
	}

	public void run() {
		int i = 0;

		while (true) {
			b.put(i++);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Konsument implements Runnable {
	Bufor b;

	Konsument(Bufor b) {
		this.b = b;
		new Thread(this, "Konsument").start();
	}

	public void run() {
		while (true) {
			b.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class ProdKonsErr {
	public static void main(String[] args) {
		Bufor b = new Bufor();
		new Producent(b);
		new Konsument(b);

		System.out.println("Nacisnij Ctrl-C by zakonczyc");
	}
}
