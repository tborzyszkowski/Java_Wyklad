package wyklad._04dziedziczenie;

import java.util.Random;

class AO1 {
	int i;

	AO1(int i) {
		this.i = i;
	}

	String show() {
		return "A: i = " + i;
	}
}

class BO1 extends AO1 {
	int i;

	BO1(int ai, int i) {
		super(ai);
		this.i = i;
	}

	String show() {
		return "B: i = " + this.i + super.show();
	}
}

class Overriding1 {
	public static void main(String[] args) {
		BO1 obB = new BO1(1, 2);
//		AO1 obA = obB;
		AO1 obA = new AO1(4);

		System.out.println(obB.show());
		boolean b = new Random().nextBoolean();
		System.out.println("b = " + b);
		if (b) {
			obA = obB;
		}
		System.out.println(obA.show());
	}
}
