package _01_Wstep;

class BlockTest {
	public static void main(String args[]) {
		int y;

		y = 20;

		for (int x = 0; x < 20; x++) {
//			int y = 5;
			System.out.print(1 + x + "\t");
			System.out.println("y = " + y);
			y -= 2;
		}
	//	System.out.print ("x = " + x + "\t");
	}
}
