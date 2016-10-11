// przyklad prostego pakietu
// UWAGA: umiesc plik w katalogu MyPack
package _05_Pakiety.MyPack;

class Balance {
	String name;
	double bal;

	Balance(String n, double b) {
		name = n;
		bal = b;
	}

	void show() {
		if (bal < 0)
			System.out.println("-->");
		System.out.println(name + "\t: zl " + bal);
	}
}

class AccountBalance {
	public static void main(String args[]) {
		Balance current[] = new Balance[3];

		current[0] = new Balance("J.F.K", 123.123);
		current[1] = new Balance("W. Tell", 150.150);
		current[2] = new Balance("T.B.", 111.222);

		for (int i = 0; i < 3; i++)
			current[i].show();
	}
}
