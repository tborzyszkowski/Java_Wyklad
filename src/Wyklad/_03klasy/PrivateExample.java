package wyklad._03klasy;

class A {
	private int b = 2;
}

public class PrivateExample {
	private int a = 10;

	public void qqq() {
		A aa = new A();
//		System.out.println(aa.b);
	}

	public void ppp() {
		PrivateExample pe = new PrivateExample();
		System.out.println(pe.a);
	}

	public static void main(String[] args) {
		PrivateExample pe = new PrivateExample();
		System.out.println(pe.a);
	}

}
