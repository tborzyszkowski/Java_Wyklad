package _02_Typy;

public class Nan {
	public static void main(String[] args) {
		
		if((1.0 / 0) == Double.POSITIVE_INFINITY)
			System.out.println("+ INF");
		if((-1.0 / 0) == Double.NEGATIVE_INFINITY)
			System.out.println("- INF");
		if(Double.isNaN(0.0 / 0))
			System.out.println("NaN: "  + ((0.0 / 0) + 1));
	}
}
