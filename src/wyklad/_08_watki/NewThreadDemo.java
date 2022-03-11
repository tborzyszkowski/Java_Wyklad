package wyklad._08_watki;

class NewThread4 implements Runnable {
	Thread t;

	NewThread4() {
		t = new Thread(this, "Nowy watek");
		System.out.println("Nowy watek      > " + t);
		t.start();
	}

	public void run() {
		long time1 = System.currentTimeMillis(), 
				time2;
		int a = 0;
		try {
			
			for (int i = 100 * 1000 * 1000; i > 0; i--) {
//				Thread.sleep(1);
//				a++;
//				a = a + 1;
				a = (int)Math.sin(a + 1) + 1;
				//System.out.println("Nowy watek      > " + i);
			}
		} catch (//InterruptedException e
				Exception e) {
			System.out.println("Watek potomny przerwany");
		}
		time2 = System.currentTimeMillis();
		System.out.println("Koniec nowego watku: "+ a 
				+" ["+(time2-time1)+"]");
	}
}

class NewThreadDemo {
	public static void main(String[] args) {
		new NewThread4();
		Thread t = Thread.currentThread();
		long time1 = System.currentTimeMillis(), 
				time2, a = 0;
		t.setName("Watek glowny");
		System.out.println("Watek glowny    : " + t);
		try {
			for (int i = 100 * 1000 * 1000; i > 0; i--) {
				//System.out.println("Watek glowny    : " + i);
//				a++;
//				a = a + 1;
				a = (int)Math.sin(a + 1) + 1;
				//Thread.sleep(0);
			}
		} catch (Exception e) {
			System.out.println("Watek glowny przerwany");
		}
		time2 = System.currentTimeMillis();
		System.out.println("Koniec watku glownego:"+"<"+(time2-time1)+">");
	}
}
