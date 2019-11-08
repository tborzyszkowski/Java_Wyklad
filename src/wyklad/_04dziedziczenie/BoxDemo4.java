package wyklad._04dziedziczenie;

// Definicja prostej klasy z metodami i konstruktorami

// klasa nadrzedna
class Box4 {
	private double width;
	private double height;
	private double depth;

	// konstruktor klonujacy
	Box4(Box4 ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// konstruktor bez parametrow
	Box4() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// konstruktor z jednym parametrem
	Box4(int n) {
		width = n; // tu konwersja int do double
		height = n;
		depth = n;
	}

	// konstruktor z parametrami
	Box4(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// metoda zmieniajaca zawartosc obiektu
	// ale nie bedaca konstruktorem
	// nic nie zwraca, wiec typ wynikowy to void
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// metoda obliczajaca objetosc
	double volume() {
		// tu metoda oddaje obietosc
		return width * height * depth;
	}

	// reprezentacja napisowa obiektu Box
	public String toString() {
		return " Objetosc =\t" + this.volume();
	}
}

// klasa potomna
class BoxWeight extends Box4 {
	private double weight;

	// konstruktor klonujacy
	BoxWeight(BoxWeight ob) {
		super(ob); // tu odwolujemy sie do konstruktora Box(Box ob)
		weight = ob.weight;
	}

	// konstruktor bez parametrow
	BoxWeight() {
//		super(); // jw. - musimy przeslac odp. liczbe parametrow
		weight = -1;
	}

	// konstruktor z dwoma parametremami
	BoxWeight(int n, double m) {
		super(n); // tu wysulamy tylko jeden parametr
		weight = m; // a tu uzywamy drugiego
	}

	// konstruktor z parametrami
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}

	// metoda zmieniajaca zawartosc obiektu
	void setDim(double w, double h, double d, double m) {
		super.setDim(w, h, d);
		weight = m;
	}

	// reprezentacja napisowa obiektu BoxWeight
	public String toString() {
		return super.toString() + "\n" + " Waga     =\t" + weight;
	}

}

// definicja klasy demonstrujacej uzycie klasy Box
class BoxDemo4 {
	public static void main(String args[]) {
		// utworzenie instancji klasy Box
		BoxWeight myBox1 = new BoxWeight();
		BoxWeight myBox2 = new BoxWeight(2, 3);
		BoxWeight myBox3 = new BoxWeight(3, 4, 5, 0.1234);
		BoxWeight myBox4 = new BoxWeight(myBox3);

		// wypisujemy objetosci
		System.out.println("myBox1: \n" + myBox1);
		System.out.println("myBox2: \n" + myBox2);
		System.out.println("myBox3: \n" + myBox3);
		System.out.println("myBox4: \n" + myBox4.toString());

		// zmieniamy zawartosc obiektu myBox1
		myBox1.setDim(2, 3, 2, 100.001);
		// raz jeszcze jego objetosc
		System.out.println("myBox1: \n" + myBox1);
		
		Box4 box = myBox1;
		System.out.println("myBox1: \n" + box);
	}
}
