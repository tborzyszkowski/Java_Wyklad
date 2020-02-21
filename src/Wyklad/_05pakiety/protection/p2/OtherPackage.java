package wyklad._05pakiety.protection.p2;

class OtherPackage {

	public OtherPackage() {
		wyklad._05pakiety.protection.p1.Protection p = new wyklad._05pakiety.protection.p1.Protection();

		System.out.println("konstruktor innego pakietu");
//		System.out.println("n     = " + p.n);
//		System.out.println("n_pri = " + p.n_pri);
//		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
