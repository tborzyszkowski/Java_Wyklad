package Laboratorium.interfejsy;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Safe safe = new Safe("1234");

		DogAlarm dogAlarm = new DogAlarm("Azor");

		safe.addAlarm(dogAlarm);
		safe.addAlarm(new DogAlarm("Azazelo"));

		//safe.enterPin("4321");
		safe.enterPin("1234");

	}
}
