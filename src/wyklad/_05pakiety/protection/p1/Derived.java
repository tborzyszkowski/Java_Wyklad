package wyklad._05pakiety.protection.p1;

class Derived extends Protection {

    Derived() {
    	System.out.println("konstruktor klasy dziedziczacej");
    	System.out.println("n     = " + n);

    	// dostepne tylko w klasie Protection
    	// System.out.println("n_pri = " + n_pri);

    	System.out.println("n_pro = " + n_pro);
    	System.out.println("n_pub = " + n_pub);
    }
}
