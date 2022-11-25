package wyklad._05pakiety;
import java.util.Random;

interface Callback {
	void callback(int param);
}

class Client implements Callback {
	public void callback(int p) {
		System.out.println("callback wywolana z: " + p);
	}
	void nonIfaceMeth() {
		System.out.println("Klasa implementujaca interfejs moze takze " + "implementowac metody spoza interfejsu");
	}
}

class TestIface {
	public static void main(String[] args) {
		Callback c = new Client();

		c.callback(42);
//		c.nonIfaceMeth();
		((Client) c).nonIfaceMeth();
	}
}

class AnotherClient implements Callback {
	public void callback(int p) {
		System.out.println("Inna wersja callback");
		System.out.println("p kwadrat wynosi: " + p * p);
	}
}

class TestIface2 {
	public static void main(String[] args) {
		Callback c = new Client();
		AnotherClient ob = new AnotherClient();
		Random rand = new Random();

		c.callback(33);
		boolean resBool = rand.nextBoolean();
		System.out.println(resBool);
		if (resBool)
			c = ob;
		c.callback(5);
	}
}
