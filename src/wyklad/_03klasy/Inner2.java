package wyklad._03klasy;

class Outer {
	static int out_y = 200;
	int outer_x = 100;
	int z;

	void test() {
		Inner2 inner = new Inner2();
		inner.display();
		System.out.println(inner.y);
		Inner2.z++;
//		Inner2.y++;
	}

	// dodatkowa metoda klasy zewnetrznej wyswietlajaca
	// lokalnego y klasy wewnetrznej
	void show_y() {
		//System.out.println(y); // tu powstanie blad - y nie jest tu znany
		System.out.println(); // tu powstanie blad - y nie jest tu znany
		System.out.println(Inner2.z);
	}

	int getZ() {
		return Inner2.z;
	}

	static class Inner2 {
		static int z = 20;

		static {
			z = z + 1;
		}

		int y = 10;
		//int outer_x = 200;
		Outer oo = new Outer();

		void display() {
			System.out.println(" display: outer_y = " + out_y + "\n");
//			System.out.println(" display: outer_y = " + outer_x + "\n");
			System.out.println(" display: outer_x = " + oo.outer_x + "\n");
		}
	}
}

class InnerClassTest {
	public static void main(String[] args) {
		Outer outer = new Outer();

		outer.test();
		outer.show_y();
		System.out.println(outer.getZ());
	}
}
