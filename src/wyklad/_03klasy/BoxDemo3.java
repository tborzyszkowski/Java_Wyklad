package wyklad._03klasy;


class BoxDemo3 {
	public static void main(String args[]) {
		Box myBox1 = new Box();
		Box myBox2 = new Box(1);
		Box myBox3 = new Box(2, 2.0, 2);
		Box myBox4 = new Box(2.0, 2.0, 2.0);
		Box myBox5 = new Box(2, 2, 2.0);
		Box myBox6 = new Box(2, 2, 2);

		System.out.println("Objetosc myBox1 = " + myBox1.volume() + " w: " + myBox1.getWidth());
		System.out.println("Objetosc myBox2 = " + myBox2.volume() + " w: " + myBox2.getWidth());
		System.out.println("Objetosc myBox3 = " + myBox3.volume() + " w: " + myBox3.getWidth());
		System.out.println("Objetosc myBox4 = " + myBox4.volume() + " w: " + myBox4.getWidth());
		System.out.println("Objetosc myBox5 = " + myBox5.volume() + " w: " + myBox5.getWidth());
		System.out.println("Objetosc myBox6 = " + myBox6.volume() + " w: " + myBox6.getWidth());

		myBox1.setDim(2, 3, 2);
		System.out.println("Objetosc myBox1 = " + myBox1.volume());
	}
}
