package wyklad._04dziedziczenie;


public class TestDolly {

	public static void main(String[] args) throws Exception {
		Dolly d1 = new Dolly();
		Dolly d2 = d1.clone();
		Dolly d3 = new Dolly(d1);

		System.out.println("D1: " + d1);
		System.out.println("D2: " + d2);
		System.out.println("D3: " + d3);
		d1.e.i = 123;
		d1.w = 321;
		System.out.println("D1: " + d1);
		System.out.println("D2: " + d2);
		System.out.println("D2: " + d3);
	}
}
