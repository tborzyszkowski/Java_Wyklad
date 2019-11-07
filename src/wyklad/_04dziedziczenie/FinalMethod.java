package wyklad._04dziedziczenie;

// Przyklad blednego nadpisywania klas finalnych

class AF {
    final void finalMethod() {
    	System.out.println("To jest metoda finalna");
    }
}

class BF extends AF {
    // BLAD: probujemy nadpisac metode finalna
    void finalMethod() {
		System.out.println("To jest nielegalne");
    }
}

//klasa testujaca
class FinalMethod {
    public static void main(String args[]) {
	AF a = new AF();
	BF b = new BF();

	a.finalMethod();
	b.finalMethod();
    }
}
