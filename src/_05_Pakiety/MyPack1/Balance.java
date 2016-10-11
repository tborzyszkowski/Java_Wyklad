// UWAGA: umiesc plik w katalogu MyPack2
// W tej wersji klasa Balance, jej konstruktor, 
// oraz metoda show() 
package _05_Pakiety.MyPack1;

public class Balance {
	String name;
	double bal;

	public Balance(String n, double b) {
		name = n;
		bal = b;
	}

	public void show() {
		if (bal < 0)
			System.out.println("-->");
		System.out.println(name + "---: PLN " + bal);
	}
}
