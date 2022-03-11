package wyklad._08_watki;

class Clicker implements Runnable {
	long click = 0;
	Thread t;
	private volatile boolean running = true;

	public Clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}
	public void run() {
		while (running) {
			click++;
		}
	}
	public void stop() {
		running = false;
	}
	public void start() {
		t.start();
	}
}

class PriorityDemo {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		int n = 6;

		Clicker[] hi = new Clicker[n];
		for (int i = 0; i < n; i++)
			hi[i] = new Clicker(Thread.NORM_PRIORITY + 4);
		Clicker[] m = new Clicker[n];
		for (int i = 0; i < n; i++)
			m[i] = new Clicker(Thread.NORM_PRIORITY + 0);
		Clicker[] lo = new Clicker[n];
		for (int i = 0; i < n; i++)
			lo[i] = new Clicker(Thread.NORM_PRIORITY - 4);

		for (int i = 0; i < n; i++) {
			lo[i].start();
			m[i].start();
			hi[i].start();
		}
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(1000);
				System.out.print(".");
			}
			System.out.println();
		} catch (InterruptedException e) {
			System.out.println("Watek glowny przerwany");
		}

		for (int i = 0; i < n; i++) {
			lo[i].stop();
			m[i].stop();
			hi[i].stop();
		}

		try {
			for (int i = 0; i < n; i++) {
				hi[i].t.join();
				m[i].t.join();
				lo[i].t.join();
			}
		} catch (InterruptedException e) {
			System.out.println("Przerwane oczekiwanie");
		}
		long loSredniaNum = 0;
		for (Clicker x : lo) {
			loSredniaNum += x.click;
		}
		long loSrednia = loSredniaNum / n;

		long mSredniaNum = 0;
		for (Clicker x : m) {
			mSredniaNum += x.click;
		}
		long mSrednia = mSredniaNum / n;

		long hiSredniaNum = 0;
		for (Clicker x : hi) {
			hiSredniaNum += x.click;
		}
		long hiSrednia = hiSredniaNum / n;

		System.out.println("Watek lo : " + loSrednia + " %:"+(100.0*loSredniaNum/(loSredniaNum+mSredniaNum+hiSredniaNum)));
		System.out.println("Watek m  : " + mSrednia + " %:"+(100.0*mSredniaNum/(loSredniaNum+mSredniaNum+hiSredniaNum)));
		System.out.println("Watek hi : " + hiSrednia + " %:"+(100.0*hiSredniaNum/(loSredniaNum+mSredniaNum+hiSredniaNum)));
		
	}
}
