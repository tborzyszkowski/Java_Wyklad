package wyklad._08_watki;

class CallMe {
	void call(String msg, String par1, String par2) {
		System.out.print(par1 + msg);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("Przerwane");
		}
		System.out.println(par2);
	}
}

class Caller implements Runnable {
	String msg, p1, p2;   // komunikat
	CallMe target;// obiekt wykorzystany w ciele metody run()
	Thread t;     // watek powolywany w konstruktorze

	public Caller(CallMe targ, String s, String par1, String par2) {
		target = targ;
		p1 = par1;
		p2 = par2;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		synchronized (target) {
			target.call(msg, p1, p2);
		}
	}
}

public class Synchronized {
	public static void main(String[] args) {
		CallMe target = new CallMe();
		long time1 = System.currentTimeMillis();
		Caller ob1 = new Caller(target, "Witaj", "{", "}");
		Caller ob2 = new Caller(target, "Synchronizowany", "[", "]");
		Caller ob3 = new Caller(target, "Swiecie", "(", ")");

		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Przerwane");
		}
		long time2 = System.currentTimeMillis();
		System.out.println("[" + (time2 - time1) + "]");
	}
}
