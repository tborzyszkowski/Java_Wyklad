package wyklad._05pakiety.protection.p1;

class SamePackage {

	public SamePackage() {
		Protection p = new Protection();

		System.out.println("konstruktor tego samego pakietu");
//		System.out.println("nPrivate = " + p.nPrivate);
		System.out.println("nPackage = " + p.nPackage);
		System.out.println("nProtected = " + p.nProtected);
		System.out.println("nPublic = " + p.nPublic);
	}
}
