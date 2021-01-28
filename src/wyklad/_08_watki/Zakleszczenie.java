package wyklad._08_watki;

class AX {
	synchronized void pierwsza(BX b) {
		String name = Thread.currentThread().getName();

		System.out.println(name + ": wykonuje A.pierwsza");

		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			System.out.println("A.pierwsza przerwana");
		}
		System.out.println(name + ": próbuje B.druga");
		b.druga();
	}

	synchronized void druga() {
		System.out.println("Wewnątrz A.druga");
	}
}

class BX {
	synchronized void pierwsza(AX a) {
		String name = Thread.currentThread().getName();

		System.out.println(name + ": wykonuje B.pierwsza");

		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			System.out.println("B.pierwsza przerwana");
		}
		System.out.println(name + ": próbuje A.druga");
		a.druga();
	}

	synchronized void druga() {
		System.out.println("Wewnątrz B.druga");
	}
}

class Zakleszczenie implements Runnable {
	AX a = new AX();
	BX b = new BX();

	Zakleszczenie() {
		Thread.currentThread().setName("Glowny     ");
		Thread t = new Thread(this, "Uruchamiacz");
		t.start();

		a.pierwsza(b);
		System.out.println("Znow w watku glownym");
	}

	public void run() {
		b.pierwsza(a);
		System.out.println("Znow w innym watku");
	}

	public static void main(String[] args) {
		new Zakleszczenie();
	}
}
