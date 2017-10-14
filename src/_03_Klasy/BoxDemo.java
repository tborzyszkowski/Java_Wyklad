package _03_Klasy;

// Definicja prostej klasy (tylko dane, zadnych metod)

class Box {
	double width;
	double height;
	double depth;
}

// definicja klasy demonstrujacej uzycie klasy Box

class BoxDemo {
	public static void main(String args[]) {
		// utworzenie instancji klasy Box
		// od tego czasu zmienna myBox reprezentuje instancje klasy Box
		Box myBox = new Box();
		double vol;

		// obliczamy objetosc myBox'a
		vol = myBox.width * myBox.height * myBox.depth;

		System.out.println("Objetosc = " + vol);
		// wpisujemy dane do myBox
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;

		// obliczamy objetosc myBox'a
		vol = myBox.width * myBox.height * myBox.depth;

		System.out.println("Objetosc = " + vol);
	}
}
