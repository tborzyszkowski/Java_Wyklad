package wyklad._08_watki;

class CallMe2 {
	void call(String msg, String par1, String par2) {
		System.out.print(par1 + msg);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("Przerwane");
		}
		System.out.println(par2);
	}
}

class Caller2 implements Runnable {
	String msg, p1, p2;   // komunikat
	CallMe2 target;// obiekt wykorzystany w ciele metody run()
	Thread t;     // watek powolywany w konstruktorze

	public Caller2(CallMe2 targ, String s, String par1, String par2) {
		target = targ;
		p1 = par1;
		p2 = par2;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		target.call(msg, p1, p2);
	}
}

class NoSynch {
	public static void main(String[] args) {
		CallMe2 target = new CallMe2();
		long time1 = System.currentTimeMillis();
		Caller2 ob1 = new Caller2(target, "Witaj", "{", "}");
		Caller2 ob2 = new Caller2(target, "Synchronizowany", "[", "]");
		Caller2 ob3 = new Caller2(target, "Swiecie", "(", ")");

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
