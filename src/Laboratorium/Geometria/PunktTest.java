package Laboratorium.Geometria;

public class PunktTest {

	public static void main(String[] args) {
		Punkt p0 = new Punkt();
		Punkt p1 = new Punkt(-3, -4);
		
		System.out.println("p0: " + p0);
		System.out.println("p1: " + p1);
		
		System.out.println("d: " + p0.odleglosc(p1));

	}

}
