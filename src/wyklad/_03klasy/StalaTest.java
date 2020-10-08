package wyklad._03klasy;

class Stala {
	final int stala;

	public Stala(int stalaInit) {
		stala = stalaInit;
	}

	@Override
	public String toString() {
		return "Stala [stala=" + stala + "]";
	}
}

public class StalaTest {

	public static void main(String[] args) {
		Stala s1 = new Stala(10);
		Stala s2 = new Stala(20);

		System.out.println(s1);
		System.out.println(s2);

//		s1.stala = 30;
	}

}
