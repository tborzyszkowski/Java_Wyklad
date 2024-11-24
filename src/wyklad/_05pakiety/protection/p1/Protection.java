package wyklad._05pakiety.protection.p1;

public class Protection {
	private int nPrivate = 1;
	int nPackage = 2;
	protected int nProtected = 3;
	public int nPublic = 4;

	public Protection() {
		System.out.println("konstruktor bazowy");
		System.out.println("nPrivate   = " + this.nPrivate);
		System.out.println("nPackage   = " + this.nPackage);
		System.out.println("nProtected = " + this.nProtected);
		System.out.println("nPublic    = " + this.nPublic);
	}
}
