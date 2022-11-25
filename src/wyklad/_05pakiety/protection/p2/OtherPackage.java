package wyklad._05pakiety.protection.p2;

class OtherPackage {

	public OtherPackage() {
		wyklad._05pakiety.protection.p1.Protection p = new wyklad._05pakiety.protection.p1.Protection();

		System.out.println("konstruktor innego pakietu");
//		System.out.println("nPrivate   = " + p.nPrivate);
//		System.out.println("nPackage   = " + p.nPackage);
//		System.out.println("nProtected = " + p.nProtected);
		System.out.println("nPublic    = " + p.nPublic);
	}
}
