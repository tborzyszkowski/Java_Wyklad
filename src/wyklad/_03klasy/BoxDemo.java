package wyklad._03klasy;

class BoxDemo {
	public static void main(String args[]) {
		Box myBox = new Box();
		double vol;

		vol = myBox.getWidth() * myBox.getHeight() * myBox.getDepth();

		System.out.println("Objetosc = " + vol);

		myBox.setWidth(10);
		myBox.setHeight(20);
		myBox.setDepth(15);

		vol = myBox.getWidth() * myBox.getHeight() * myBox.getDepth();

		System.out.println("Objetosc = " + vol);
	}
}
