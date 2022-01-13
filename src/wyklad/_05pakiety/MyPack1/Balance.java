package wyklad._05pakiety.MyPack1;

public class Balance {
	String name;
	double bal;

	public Balance(String n, double b) {
		name = n;
		bal = b;
	}

	public void show() {
		if (bal < 0)
			System.out.println("-1->");
		System.out.println(name + "---: PLN " + bal);
	}
}
