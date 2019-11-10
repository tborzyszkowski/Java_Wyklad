package wyklad._04dziedziczenie;

import java.util.Random;

class Base {
    private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Base{" +
				"i=" + i +
				'}';
	}
}
class Der1 extends Base {
	private int k;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	@Override
	public String toString() {
		return "Der1{" +
				"k=" + k +
				" " + super.toString() +
				'}';
	}
}
class Der2 extends Base {
	private int k;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	@Override
	public String toString() {
		return "Der2{" +
				"k=" + k +
				" " + super.toString() +
				'}';
	}
}
class Dziedzictwo3 {
    public static void main(String args[]) {
    	Base base = new Base();
		Der1 der1 = new Der1();
    	Der2 der2 = new Der2();
		Random rnd = new Random();

	// ustawiamy wartosci
    	base.setI(1);
    	der1.setI(11);
    	der1.setK(111);
		der2.setI(22);
		der2.setK(222);

	// wypisujemy zawartosc
    	System.out.println(base);
    	System.out.println(der1);
    	System.out.println(der2);

    // obA bedzie wskazywal na obB
    	if (rnd.nextBoolean())
			base = der1;
    	else
    		base = der2;

    	System.out.println(base);

        // czy dostepne bedzie k
    	System.out.println("((Der2)base).k = " + ((Der2)base).getK());

    	System.out.println(base.getClass());
    	if(base instanceof Der2)
    		System.out.println(" k = " + ((Der2)base).getK());
    	else
    		System.out.println("Zly typ");
   }
}
