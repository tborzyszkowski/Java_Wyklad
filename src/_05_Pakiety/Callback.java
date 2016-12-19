package _05_Pakiety;

// przyklad definicji i implementacji interfejsu

interface Callback {
	void callback(int param);
}

// klasa implementujaca interfejs
class Client implements Callback {
	// metoda interfejsu musi byl publiczna
	public void callback(int p) {
		System.out.println("callback wywolana z: " + p);
	}

	// metoda dodatkowa, nie z interfejsu
	void nonIfaceMeth() {
		System.out.println("Klasa implementujaca interfejs moze takze " + "implementowac metody spoza interfejsu");
	}
}

// klasa testowa
class TestIface {
	public static void main(String args[]) {
		// interfejs jako typ obiektu
		Callback c = new Client();

		c.callback(42);
		// c.nonIfaceMeth();
		((Client) c).nonIfaceMeth();
	}
}

// inna impementacja interfejsu
class AnotherClient implements Callback {
	// metoda interfejsu musi byl publiczna
	public void callback(int p) {
		System.out.println("Inna wersja callback");
		System.out.println("p kwadrat wynosi: " + p * p);
	}
}

// inna klasa testowa
class TestIface2 {
	public static void main(String args[]) {
		// interfejs jako typ obiektu
		Callback c = new Client();
		// tu klasa jako typ obiektu
		AnotherClient ob = new AnotherClient();

		c.callback(33);
		// zmieniamy referencje
		c = ob;
		c.callback(5);
	}
}
