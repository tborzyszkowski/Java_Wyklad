package wyklad._05pakiety.MyPack2;

import wyklad._05pakiety.MyPack.IBalance;

public class Balance implements IBalance {
	String name;
	double bal;

	public Balance(String n, double b) {
		name = n;
		bal = b;
	}

	public void show() {
		if (bal < 0)
			System.out.println("=2=>");
		System.out.println(name + "\t: EUR " + bal);
	}
}
