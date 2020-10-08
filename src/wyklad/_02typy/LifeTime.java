package wyklad._02typy;

// Demonstracja czasu zycia zmiennej
class LifeTime{
    public static void main(String args[]) {
	int x;

	for(x = 0; x < 5; x++){
	    int y = -1;  // y jest inicjalizowany za kazdym przebiegiem petli
	    System.out.println("inicjalizacja  y = " + y);
	    y = 100 * x;
	    System.out.println("teraz          y = " + y);
	}
    }
}
