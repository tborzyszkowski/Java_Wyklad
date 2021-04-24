package Laboratorium.dziedziczenie.maszyny;

public class Main {
	public static void main(String[] args) {
		Lokomotywa lokomotywa =
				new Lokomotywa("duza",
						"Kokosz",
						100);

		lokomotywa.wyswietl();

		Kosiarka kosiarka =
				new Kosiarka("mala",
						"koza",
						false);

		kosiarka.wyswietl();

		Pojazd pojazd1 = new Pojazd("125p",
				"Fiat",
				40);
		Pojazd pojazd2 = new Pojazd("125p",
				"Fiat",
				40);

		pojazd1.wyswietl();
		pojazd2.wyswietl();

		Jednoslad jednoslad = new Jednoslad("aaa", "bbb", 10, "moj typ");

		jednoslad.wyswietl();
	}
}
