package wyklad._08_watki;
// Przyklad dostepu do sekcji krytycznej z synchronizacja

class CallMe1 {
    // ta metoda to sekcja krytyczna
    // tu w wersji z monitorowaniem
    synchronized void call(String msg, String par1, String par2) {
    	System.out.print(par1 + msg);
    	try {
    		Thread.sleep(1);
    	} catch (InterruptedException e) {
    		System.out.println("Przerwane");
    	}
    	System.out.println(par2);
    }
}

class Caller1 implements Runnable {
    String msg, p1, p2;   // komunikat
    CallMe1 target;// obiekt wykorzystany w ciele metody run() 
    Thread t;     // watek powolywany w konstruktorze

    public Caller1(CallMe1 targ, String s, String par1, String par2) {
    	p1 = par1; p2 = par2;
    	target = targ;
    	msg = s;
    	t = new Thread(this);
    	t.start();
    }
    
    public void run() {
    	target.call(msg,p1,p2);
    }
}

class Synch {
    public static void main(String args[]) {
    	CallMe1 target = new CallMe1();
    	// trzy obiekty-watki korzystajace z tego samego
    	// zasobu krytycznego
    	Caller1 ob1 = new Caller1(target, "Witaj", "{", "}");
    	Caller1 ob2 = new Caller1(target, "Synchronizowany","[", "]");
    	Caller1 ob3 = new Caller1(target, "Swiecie","(",")");
   
    	// oczekiwanie na zakonczenie watkow
    	try {
    		ob1.t.join();
    		ob2.t.join();
    		ob3.t.join();
    	} catch (InterruptedException e) {
    		System.out.println("Przerwane");
    	}
    }
}

// Jakiego wyniku sie spodziewamy? 
