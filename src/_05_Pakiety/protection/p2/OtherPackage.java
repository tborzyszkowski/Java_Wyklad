package _05_Pakiety.protection.p2;


class OtherPackage {

	public OtherPackage() {
		_05_Pakiety.protection.p1.Protection p = new _05_Pakiety.protection.p1.Protection();

		System.out.println("konstruktor innego pakietu");

		// tylko dla klasy lub pakietu
		// System.out.println("n     = " + p.n);

		// tylko dla klasy
		// System.out.println("n_pri = " + p.n_pri);

		// tylko dla klasy, klasy pochodnej lub pakietu
		// System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
