package _08_Watki;
// Przyklad dostepu do sekcji krytycznej z synchronizacja
// za pomoca komendy synchronized
class CallMe {
    // ta metoda to sekcja krytyczna
    // synchronizacja w obiekcie wywolujacym
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
    	p1 = par1; p2 = par2;
    	msg = s;
    	t = new Thread(this);
    	t.start();
    }
    // tu synchronizujemy dostep do call()
    public void run() {
	// blok synchronizowanych wywolan
    	synchronized(target) {
    		target.call(msg,p1,p2);
    	} 
	// nawiasy wasiaste nie sa potrzebne,
	// gdy wywolujemy pojedyncza komende  
    }
}

public class Synchronized {
    public static void main(String args[]) {
    	CallMe target = new CallMe();
    	// trzy obiekty-watki korzystajace z tego samego
    	// zasobu krytycznego
    	Caller ob1 = new Caller(target, "Witaj", "{", "}");
    	Caller ob2 = new Caller(target, "Synchronizowany","[", "]");
    	Caller ob3 = new Caller(target, "Swiecie","(",")");
   
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
