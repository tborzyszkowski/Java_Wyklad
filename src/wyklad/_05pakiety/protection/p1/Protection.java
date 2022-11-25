package wyklad._05pakiety.protection.p1;

public class Protection {
	private int nPrivate = 1;
	int nPackage = 2;
	protected int nProtected = 3;
	public int nPublic = 4;

	public Protection() {
		System.out.println("konstruktor bazowy");
		System.out.println("nPrivate   = " + nPrivate);
		System.out.println("nPackage   = " + nPackage);
		System.out.println("nProtected = " + nProtected);
		System.out.println("nPublic    = " + nPublic);
	}
}
