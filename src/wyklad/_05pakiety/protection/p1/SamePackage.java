package wyklad._05pakiety.protection.p1;

class SamePackage {

	public SamePackage() {
		Protection p = new Protection();

		System.out.println("konstruktor tego samego pakietu");
		System.out.println("n     = " + p.n);
		// System.out.println("n_pri = " + p.n_pri);
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
