package _04_Dziedziczenie;


public class TestDolly {

	public static void main(String[] args) throws Exception{
		Dolly d = new Dolly();
		Dolly d2 = d.clone();
		System.out.println("D: " + d);
		System.out.println("D2: "+ d2);
		d.e.i = 123;
		d.w = 321;
		System.out.println("D: " + d);
		System.out.println("D2: "+ d2);
	}
}
