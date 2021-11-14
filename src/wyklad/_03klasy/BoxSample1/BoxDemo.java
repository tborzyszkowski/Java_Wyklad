package wyklad._03klasy.BoxSample1;


public class BoxDemo {
	public static void main(String[] args) {
		Box myBox0 = new Box();
		Box myBox1 = new Box(2, 3, 4);

		System.out.println(myBox0 + " vol: " + myBox0.volume());
		System.out.println(myBox1 + " vol: " + myBox1.volume());

		myBox0.setWidth(10);
		myBox0.setHeight(20);
		myBox0.setDepth(15);

		System.out.println(myBox0 + " vol: " + myBox0.volume());

		myBox0.setDim(7,9,11);
		System.out.println(myBox0 + " vol: " + myBox0.volume());

		System.out.println("" + myBox0 + " == " + myBox1 + ": " + (myBox0 == myBox1));
		System.out.println("" + myBox0 + " eq " + myBox1 + ": " + (myBox0.equals(myBox1)));

		myBox0 = new Box(myBox1);
		System.out.println("" + myBox0 + " == " + myBox1 + ": " + (myBox0 == myBox1));
		System.out.println("" + myBox0 + " eq " + myBox1 + ": " + (myBox0.equals(myBox1)));

		myBox0 = myBox1;
		System.out.println("" + myBox0 + " == " + myBox1 + ": " + (myBox0 == myBox1));
		System.out.println("" + myBox0 + " eq " + myBox1 + ": " + (myBox0.equals(myBox1)));
	}
}

