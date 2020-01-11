package wyklad._08_watki;
// Przyklad uzycia suspend() i resume()
// UWAGA: kompilacja z opcja -deprecation

class NewThread1 implements Runnable {
    String name; // nazwa watku
    Thread t;

    NewThread1(String threadName) {
    	name = threadName;
    	t = new Thread(this, name);
    	System.out.println("NewThread: " + t);
    	t.start(); 
    }
    
    public void run() {
	try {
	    for( int i = 15; i > 0; i-- ) {
		System.out.println(name + ": " + i);
		Thread.sleep(200);
	    }
	} catch (InterruptedException e) {
	    System.out.println(name + " przerwany");
	}
	System.out.println(name + " zkonczony");
    }
}

class SuspendResume {
    public static void main(String args[]) {
	NewThread1 ob1 = new NewThread1("Jeden");	
	NewThread1 ob2 = new NewThread1("Dwa  ");

	try {
	    Thread.sleep(1000);
	    ob1.t.suspend();
	    System.out.println("Jeden: wstrzymany");
	    Thread.sleep(1000);
	    ob1.t.resume();
	    System.out.println("Jeden: wznowiony");
	    Thread.sleep(1000);
	    ob2.t.suspend();
	    System.out.println("Dwa  : wstrzymany");
	    Thread.sleep(1000);
	    ob2.t.resume();
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
