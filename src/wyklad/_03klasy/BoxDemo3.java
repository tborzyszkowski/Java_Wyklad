package wyklad._03klasy;

class Box3 {
	private double width;
	private double height;
	private double depth;

	Box3() {
		width = 0;
		height = 0;
		depth = 0;
	}

	Box3(int n) {
		width = n;
		height = n;
		depth = n;
	}

	Box3(int width, int height, int depth) {
		this.width = 2 * width;
		this.height = 3 * height;
		this.depth = 4 * depth;
	}

	Box3(double w, double h, double d) {
//    	this((int)w,(int)d,(int)h);
		width = w;
		height = h;
		depth = d;
	}

	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}

class BoxDemo3 {
	public static void main(String args[]) {
		Box3 myBox1 = new Box3();
		Box3 myBox2 = new Box3(2);
		Box3 myBox3 = new Box3(3, 4.0, 5);

		System.out.println("\nObjetosc myBox1 = " + myBox1.volume());
		System.out.println("Objetosc myBox2 = " + myBox2.volume());
		System.out.println("Objetosc myBox3 = " + myBox3.volume());

		myBox1.setDim(2, 3, 2);
		System.out.println("\nObjetosc myBox1 = " + myBox1.volume() + "\n");
	}
}
