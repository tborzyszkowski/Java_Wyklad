package wyklad._08_watki;

class NewThread3 implements Runnable {
	int czas;
	String name;
	Thread t;

	NewThread3(String threadName, int c) {
		czas = c;
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Nowy watek      > " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + "      > " + i);
				Thread.sleep(1 + czas);
		}
		} catch (InterruptedException e) {
			System.out.println("Watek " + name + " przerwany");
		}
		System.out.println("Koniec watku " + name);
	}
}

class JoinThreadDemo {
	public static void main(String[] args) {
		NewThread3 ob1 = new NewThread3("Pierwszy", 10);
		NewThread3 ob2 = new NewThread3("Drugi   ", 20);
		NewThread3 ob3 = new NewThread3("Trzeci  ", 30);
		NewThread3 ob4 = new NewThread3("Czwarty ", 40);

		state(ob1, ob2, ob3, ob4);

		try {
			System.out.println("Czekamy na zakonczenie dzialania watkow");
			ob1.t.join();
			System.out.println("Pierwszy: join()");
			ob2.t.join();
			System.out.println("Drugi   : join()");
//			ob3.t.join();
//			System.out.println("Trzeci  : join()");
			ob4.t.join();
			System.out.println("Czwarty  : join()");
		} catch (InterruptedException e) {
			System.out.println("Watek glowny przerwany");
		}

		state(ob1, ob2, ob3, ob4);

		System.out.println("Koniec watku glownego");
	}

	private static void state(NewThread3 ob1, NewThread3 ob2, NewThread3 ob3, NewThread3 ob4) {
		System.out
				.println("Watek " + ob1.name + " dziala : " + ob1.t.isAlive());
		System.out
				.println("Watek " + ob2.name + " dziala : " + ob2.t.isAlive());
		System.out
				.println("Watek " + ob3.name + " dziala : " + ob3.t.isAlive());
		System.out
				.println("Watek " + ob4.name + " dziala : " + ob4.t.isAlive());
	}
}
