package wyklad._04dziedziczenie;

class Box4 {
	private double width;
	private double height;
	private double depth;

	Box4(double width, double height, double depth) {
		setValues(width, height , depth);
	}

	Box4(Box4 ob) {
		this(ob.width, ob.height, ob.depth);
	}

	Box4() {
		this(-1, -1, -1);
	}

	Box4(int n) {
		this(n, n, n);
	}

	private void setValues(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	void setDim(double width, double height, double depth) {
		setValues(width, height, depth);
	}

	double volume() {
		return this.width * this.height * this.depth;
	}

	public String toString() {
		return this.getClass().getSimpleName() + "{ Objetosc = " + this.volume() + " }";
	}
}

class BoxWeight extends Box4 {
	private double weight;

	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}

	BoxWeight() {
		weight = -1;
	}

	BoxWeight(int n, double weight) {
		super(n);
		this.weight = weight;
	}

	BoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	void setDim(double width, double height, double depth, double weight) {
		super.setDim(width, height, depth);
		this.weight = weight;
	}

	public String toString() {
		return "BoxWeight{ " + super.toString()  + " Waga = " + weight +"}";
	}

}

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
