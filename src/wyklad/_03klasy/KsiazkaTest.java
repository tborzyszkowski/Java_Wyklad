package wyklad._03klasy;

public class KsiazkaTest {
	public static void main(String[] args) {
		Ksiazka k1 = new Ksiazka("Mickiewicz", "Dziady");
		Ksiazka k2 = new Ksiazka("Refactoring", "Beck");
		Ksiazka k3 = new Ksiazka("Mickiewicz", "Dziady");
		Ksiazka k4 = k3;

		System.out.println(k1.equals(k2));
		System.out.println(k1.equals(k3));

		System.out.println(k1.hashCode() + "  " + k2.hashCode());
		System.out.println(k1.hashCode() + "  " + k3.hashCode());
		System.out.println(k3.hashCode() + "  " + k4.hashCode());
	}

}
