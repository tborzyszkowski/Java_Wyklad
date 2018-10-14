package Laboratorium.Geometria;

public class PunktTest {

	public static void main(String[] args) {
		Punkt p0 = new Punkt();
		Punkt p00 = new Punkt();
		Punkt p1 = new Punkt(-3, -4);
		
		System.out.println("p0: " + p0);
		System.out.println("p1: " + p1);
		
		System.out.println("d: " + p0.odleglosc(p1));
		
		System.out.println("eq1: " + p0.equals(p0) + " " + (p0 == p0));
		System.out.println("eq2: " + p0.equals(p1) + " " + (p0 == p1));
		System.out.println("eq3: " + p0.equals(p00) + " " + (p0 == p00));
		System.out.println("eq4: " + p0.equals("Ala ma kota"));
		
	}

}
