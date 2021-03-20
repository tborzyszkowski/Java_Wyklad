package wyklad._05pakiety.InterfejsyDI;

public class PracownikTest {
	public static void main(String[] args) {
		Kasia ka = new Kasia();
		Kaziu kz = new Kaziu();

		Pracownik pracownik = new Pracownik("programista", ka);

		System.out.println(pracownik.getCanDo().skill());

		pracownik.setCanDo(kz);

		System.out.println(pracownik.getCanDo().skill());
	}
}
