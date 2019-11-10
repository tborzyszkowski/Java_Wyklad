package wyklad._04dziedziczenie;

class AK {
    AK(int i) {
    	//super();
    	i=5;
    	//super();
    	System.out.println("Konstruktor z A: " + i);
    }
    AK(){
    	//super();
    	System.out.println("Konstruktor z A()");
    }
}
class BK extends AK {
    BK(int i) {
    	super(i+1);
    	System.out.println("Konstruktor z B: " + i);
    }
    BK(){//super();
    	System.out.println("Konstruktor z B()");
    	}
    }
class CK extends BK {
    CK() {
    	super();
//   	    super(2);
    	System.out.println("Konstruktor z C()");
    }
}
// klasa testujaca
class KonstrDemo {
    public static void main (String args[]) {
    	new CK();
    }
}
