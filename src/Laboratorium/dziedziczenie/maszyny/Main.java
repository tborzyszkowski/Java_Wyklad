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

	}
}
