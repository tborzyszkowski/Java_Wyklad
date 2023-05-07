package Laboratorium.park;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ParkMaszynowy park = new ParkMaszynowy(new ArrayList<Maszyna>());

		park.addMaszyna(new Maszyna(1));
		park.addMaszyna(new Maszyna(2));

		System.out.println(park);
	}


}
