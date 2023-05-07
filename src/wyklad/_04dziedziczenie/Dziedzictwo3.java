package wyklad._04dziedziczenie;

import java.util.Random;

class Base {
	private int i;
	public Base(int i) {
		this.i = i;
	}
	public Base(){}
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

class Derived1 extends Base {
	private int j;
	public Derived1(int i, int j) {
		//super();
		super(i);
		this.j = j;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	@Override
	public String toString() {
		return "Derived1 {" +
				" j = " + j +
				" " + super.toString() +
				" }";
	}
}

class Derived2 extends Base {
	private int j;
	public Derived2(int i, int j) {
		super(i);
		this.j = j;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	@Override
	public String toString() {
		return "Derived2 {" +
				" j = " + j +
				" " + super.toString() +
				" }";
	}
}

class Dziedzictwo3 {
	public static void main(String[] args) {
		Base base = new Base(-1);
		Derived1 der1 = new Derived1(11, 111);
		Derived2 der2 = new Derived2(22,222);
		Random rnd = new Random();

//		System.out.println(base);
//		System.out.println(der1);
//		System.out.println(der2);

		if (rnd.nextBoolean())
			base = der1;
		else
			base = der2;

		System.out.println(base);

		System.out.println(base.getClass());
		if (base instanceof Derived1)
			System.out.println(" j = " + ((Derived1) base).getJ());
		else
			System.out.println("Zly typ");
	}
}
