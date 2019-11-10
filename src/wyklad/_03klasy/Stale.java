package wyklad._03klasy;

class MyFinal {
	final int x = 1;
	final int y;

	public MyFinal(int y) {
		this.y = y;
	}
}

public class Stale {
	public static void main(String args[]) {
		MyFinal p = new MyFinal(10);
		MyFinal q = new MyFinal(20);
//        p.y = 30;
	}
}
