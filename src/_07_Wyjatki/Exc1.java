package _07_Wyjatki;

class Exc1 {
    static void metoda() {
    	int d = 0;
    	int a = 42 / d;
    	System.out.print(a);
    }

    public static void main(String args[]) {
    	Exc1.metoda();
    }
}

// Skompiluj i uruchom. 
// Jakie informacje otrzymujemy wraz z błędem?
