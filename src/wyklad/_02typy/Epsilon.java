package wyklad._02typy;

import java.math.BigDecimal;

public class Epsilon {

	public static void main(String[] args) {

		double x = 1.0;
		double pom = x;
		int i = 0;

		while (x != 0){
			pom = x;
			x = x / 2;
			i++;
		}
		System.out.println("Epsilon = " + pom + " i = " + i);
		
		BigDecimal a = BigDecimal.valueOf(1.0);
		BigDecimal jeden = BigDecimal.valueOf(1.0);
		BigDecimal dwa = BigDecimal.valueOf(2.0);
		BigDecimal b = a;
		i = 0;

		while (a.compareTo(BigDecimal.valueOf(0.0)) != 0 && i < 14000){
			b = a.multiply(jeden);
			a = a.divide(dwa);
			if ( (i++) % 100 == 0) System.out.print(".");
			if ( i % 1000 == 0) System.out.println(i+ " " + a);
		}
		System.out.println("Epsilon = " + b + " i = " + i);
		System.out.println(b.toString().length());
	}

}
