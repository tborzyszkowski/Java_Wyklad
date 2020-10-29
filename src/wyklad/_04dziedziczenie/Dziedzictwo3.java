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

class Derived1 extends Base {
	private int j;

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
		Base base = new Base();
		Derived1 der1 = new Derived1();
		Derived2 der2 = new Derived2();
		Random rnd = new Random();

		base.setI(1);
		der1.setI(11);
		der1.setJ(111);
		der2.setI(22);
		der2.setJ(222);

		System.out.println(base);
		System.out.println(der1);
		System.out.println(der2);

		if (rnd.nextBoolean())
			base = der1;
		else
			base = der2;

		System.out.println(base);

//		System.out.println("((Der2)base).k = " + ((Derived2) base).getJ());

		System.out.println(base.getClass());
		if (base instanceof Derived2)
			System.out.println(" k = " + ((Derived2) base).getJ());
		else
			System.out.println("Zly typ");
	}
}
