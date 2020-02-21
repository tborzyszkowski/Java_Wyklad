package wyklad._03klasy;

class Box {
	double width;
	double height;
	double depth;
}

class BoxDemo {
	public static void main(String args[]) {
		Box myBox = new Box();
		double vol;

		vol = myBox.width * myBox.height * myBox.depth;

		System.out.println("Objetosc = " + vol);

		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;

		vol = myBox.width * myBox.height * myBox.depth;

		System.out.println("Objetosc = " + vol);
	}
}
