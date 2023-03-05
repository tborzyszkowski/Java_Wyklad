package wyklad._08_watki;

class NewThread11 implements Runnable {
	String name;
	Thread t;

	NewThread11(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Nowy watek ("+ name +")    > " + t);
		t.start();
	}

	final double f(double x){
		return Math.sin(Math.E * x) -1.5;
	}

	public void run() {
		long time1 = System.currentTimeMillis(), 
				time2;
		double a = 1.0;
		try {
			for (int i = 10 * 1000 * 1000; i > 0; i--) {
				//System.out.println(name + "      > " + i);
				//Thread.sleep(10);
				a+= Math.sin(Math.E * i) +1.5 ;//f(i);//1 ;//Math.sin(Math.E * i) +1 ;
			}
		} catch (Exception e)//InterruptedException e) 
				{
			System.out.println("Watek " + name + " przerwany");
		}
		time2 = System.currentTimeMillis();
		System.out.println("Koniec watku " + name + a 
				+" ["+(time2-time1)+"]");
	}
}

class MultiThreadDemo {
	public static void main(String[] args) {
		new NewThread11("---1--- ");
		new NewThread11("---2--- ");
		new NewThread11("---3--- ");
		new NewThread11("---4--- ");
		new NewThread11("---5--- ");
		new NewThread11("---6--- ");
		new NewThread11("---7--- ");
		new NewThread11("---8--- ");
		new NewThread11("---9--- ");
		new NewThread11("---10--- ");
		new NewThread11("---11--- ");
		new NewThread11("---12--- ");
		new NewThread11("---13---");
		new NewThread11("---14---");
		new NewThread11("---15---");
		new NewThread11("---16---");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Watek glowny przerwany");
		}
		System.out.println("Koniec watku glownego");
	}
}
