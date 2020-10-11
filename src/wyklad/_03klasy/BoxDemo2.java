package wyklad._03klasy;

class BoxDemo2 {
	public static void main(String args[]) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		Box myBox3 = myBox1;
		double vol;

		myBox1.setWidth(10);
		myBox1.setHeight(20);
		myBox1.setDepth(15);

		myBox2.setWidth(2);
		myBox2.setHeight(3);
		myBox2.setDepth(4);

		vol = myBox1.volume();

		System.out.println("\nObjetosc myBox = " + vol);

		vol = myBox2.volume();

		System.out.println("Objetosc myBox2 = " + vol + "\n");
		System.out.println("myBox1 == myBox2: " + (myBox1 == myBox2));
		System.out.println("myBox1 == myBox3: " + (myBox1 == myBox3));
		System.out.println("myBox1 -eq myBox2: " + (myBox1.equals(myBox2)));
		System.out.println("myBox1 -eq myBox3: " + (myBox1.equals(myBox3)));
		myBox1.setWidth(2);
		myBox1.setHeight(3);
		myBox1.setDepth(4);
		System.out.println("myBox1 == myBox2: " + (myBox1 == myBox2));
		System.out.println("myBox1 -eq myBox2: " + (myBox1.equals(myBox2)));
		myBox1 = myBox2;
		System.out.println("myBox1 == myBox2: " + (myBox1 == myBox2));
		System.out.println("myBox1 -eq myBox2: " + (myBox1.equals(myBox2)));
		myBox1.setWidth(15);
		System.out.println(myBox2.getWidth());
	}
}
