package wyklad._05pakiety.protection.p2;

public class Protection2 extends _05_Pakiety.protection.p1.Protection {

	public Protection2() {
		System.out.println("konstruktor klasy dziedziczacej w innym pakiecie");

		// tylko dla klasy lub pakietu
		// System.out.println("n     = " + n);

		// dostepne tylko w klasie Protection
		// System.out.println("n_pri = " + n_pri);

		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}
