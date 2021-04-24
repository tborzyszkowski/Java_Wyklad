package wyklad._05pakiety.protection.p2;

public class Protection2 extends wyklad._05pakiety.protection.p1.Protection {

	public Protection2() {
		System.out.println("konstruktor klasy dziedziczącej w innym pakiecie");

//		System.out.println("nPrivate = " + nPrivate);
//		System.out.println("nPackage = " + nPackage);
		System.out.println("nProtected = " + nProtected);
		System.out.println("nPublic = " + nPublic);
	}
}
