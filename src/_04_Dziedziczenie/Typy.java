package _04_Dziedziczenie;

class X{}
class Z extends X{}

public class Typy {

	public static void main(String[] args) {
		X x = new X();
		Z z = new Z();
		
		System.out.println(x.getClass().equals(z.getClass()));
	}

}
