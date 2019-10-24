package wyklad._03klasy;

// Demonstracja klas wewnetrznych
// UWAGA: program powinien spowodowac powstanie bledu kompilacji

class Outer {
    int outer_x = 100;
    static int out_y = 200;
    int z;

    void test() {
    	Inner2 inner = new Inner2();
    	inner.display();
    	System.out.println(inner.y);
    	Inner2.z++;
//    	Inner2.y++;
    }

    // definicja klasy wewnetrznej
     static class Inner2 {
    	static int z = 20;
    	int y = 10;  // dodajemy lokalny y w klasie wewnetrznej
                     // nie jest on widoczny na zewnatrz 
    	//int outer_x = 200;
    	Outer oo = new Outer();
    	static{
    		z = z + 1;
    	}
    	void display() {
    		System.out.println(" display: outer_y = " + out_y + "\n");
//    		System.out.println(" display: outer_y = " + outer_x + "\n");
    		System.out.println(" display: outer_x = " + oo.outer_x + "\n");
    	}
    }
    // dodatkowa metoda klasy zewnetrznej wyswietlajaca 
    // lokalnego y klasy wewnetrznej
    void show_y() {
    	//System.out.println(y); // tu powstanie blad - y nie jest tu znany
    	System.out.println(); // tu powstanie blad - y nie jest tu znany
    	System.out.println(Inner2.z);
    }
    int getZ(){
    	return Inner2.z;
    }
}
class InnerClassTest {
    public static void main(String args[]) {
	Outer outer = new Outer();
	
	outer.test();
	outer.show_y();
	System.out.println(outer.getZ());
    }
}
