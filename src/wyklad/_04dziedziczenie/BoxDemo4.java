package wyklad._04dziedziczenie;

import java.util.Objects;

class Box {
	private double width;
	private double height;
	private double depth;

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getDepth() {
		return depth;
	}

	Box(double width, double height, double depth) {
		setValues(width, height, depth);
	}

	Box(Box ob) {
		this(ob.width, ob.height, ob.depth);
	}

	Box() {
		this(-1, -1, -1);
	}

	Box(int n) {
		this(n, n, n);
	}

	private void setValues(double width, double height, double depth) {
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

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Box)) return false;
		Box box = (Box) o;
		return Double.compare(width, box.width) == 0 &&
				Double.compare(height, box.height) == 0 &&
				Double.compare(depth, box.depth) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(width, height, depth);
	}
}

class BoxWeight extends Box {
	private double weight;

	public double getWeight() {
		return weight;
	}

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
		return "BoxWeight{ " + super.toString() + " Waga = " + weight + "}";
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof BoxWeight)) return false;
		if (!super.equals(o)) return false;
		BoxWeight boxWeight = (BoxWeight) o;
		return Double.compare(weight, boxWeight.weight) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), weight);
	}
}

class BoxDemo4 {
	public static void main(String[] args) {
		// utworzenie instancji klasy Box
		BoxWeight myBox1 = new BoxWeight();
		BoxWeight myBox2 = new BoxWeight(2, 3);
		BoxWeight myBox3 = new BoxWeight(3, 4, 5, 0.1234);
		BoxWeight myBox4 = new BoxWeight(myBox3);
		System.out.println(myBox3 == myBox4);
		System.out.println(myBox3.equals(myBox4));

		// wypisujemy objetosci
		System.out.println("myBox1: \n" + myBox1);
		System.out.println("myBox2: \n" + myBox2);
		System.out.println("myBox3: \n" + myBox3);
		System.out.println("myBox4: \n" + myBox4.toString());

		// zmieniamy zawartosc obiektu myBox1
		myBox1.setDim(2, 3, 2, 100.001);
		// raz jeszcze jego objetosc
		System.out.println("myBox1: \n" + myBox1);

		Box box = myBox1;
		((BoxWeight) box).getWeight();
		System.out.println("myBox1: \n" + box);

		box = new Box();
		System.out.println("myBox1: \n" + box);

	}
}
