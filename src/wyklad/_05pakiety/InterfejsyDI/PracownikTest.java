package wyklad._05pakiety.InterfejsyDI;

import wyklad._05pakiety.InterfejsyDI.alien.ET;

import javax.swing.plaf.metal.MetalBorders;
import java.util.Random;

public class PracownikTest {
	public static void main(String[] args) {
		Kasia ka = new Kasia();
		Kaziu kz = new Kaziu();
		ET et = new ET();
//		Pracownik pracownik = new Pracownik("programista", ka);
//
//		System.out.println(pracownik.getCanDo().skill());
//
//		pracownik.setCanDo(kz);
//
//		System.out.println(pracownik.getCanDo().skill());
//
//		Pracownik pracownikET = new Pracownik("alien", et);
//		System.out.println(pracownikET.getCanDo().skill());
//

		Ability ability = null;
		Random rnd = new Random();

		int number = rnd.nextInt(3);
		switch (number){
			case 0:
				ability = ka;
				break;
			case 1:
				ability = kz;
				break;
			case 2:
				ability = et;
		}

		System.out.println(new Pracownik("case1", ability).getCanDo().skill());

	}
}
