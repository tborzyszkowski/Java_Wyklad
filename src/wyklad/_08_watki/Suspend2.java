package wyklad._08_watki;
// Przyklad uzycia wstrzymywania i wznawiania w stylu Java 2

class NewThread implements Runnable {
    String name; // nazwa watku
    Thread t;
    // flaga: czy wstrzymac watek
    boolean suspendFlag;

    NewThread(String threadName) {
    	name = threadName;
    	t = new Thread(this, name);
    	System.out.println("NewThread: " + t);
    	suspendFlag = false;
    	t.start(); 
    }
    
    public void run() {
	try {
	    for( int i = 15; i > 0; i-- ) {
		System.out.println(name + ": " + i);
		Thread.sleep(200);
		// wstrzymujemy jesli trzeba
		synchronized(this) {
		    while(suspendFlag) {
			wait();
		    }
		}
	    }
		} catch (InterruptedException e) {
	    System.out.println(name + " przerwany");
		}
		System.out.println(name + " zkonczony");
    }

    // do wstrzymania
    void mySuspend() {
    	suspendFlag = true;
    }

    // wznawiamy
    synchronized void myResume() {
    	suspendFlag = false;
    	notify();
    }
}

class SuspendResume2 {
    public static void main(String []args) {
    	NewThread ob1 = new NewThread("Jeden");	
    	NewThread ob2 = new NewThread("Dwa  ");

    	try {
    		// tu poprawiamy suspend() i resume()
    		Thread.sleep(1000);
    		ob1.mySuspend();
    		System.out.println("Jeden: wstrzymany");
    		Thread.sleep(1000);
    		ob1.myResume();
    		System.out.println("Jeden: wznowiony");
    		Thread.sleep(1000);
    		ob2.mySuspend();
    		System.out.println("Dwa  : wstrzymany");
    		Thread.sleep(1000);
    		ob2.myResume();
    		System.out.println("Dwa  : wznowiony");
    	} catch (InterruptedException e) {
    		System.out.println("Glowny watek przerwany");
    	}

    	// czekamy na zakonczenie watkow
    	try {
    		System.out.println("Oczekujemy na zakonczenie watkow");
    		ob1.t.join();
    		ob2.t.join();
    	} catch (InterruptedException e) {
    		System.out.println("Glowny watek przerwany");
    	}
    	System.out.println("Glowny watek zakonczony");
    }
}
