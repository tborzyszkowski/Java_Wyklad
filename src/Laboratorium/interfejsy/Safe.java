package Laboratorium.interfejsy;

import java.util.ArrayList;

public class Safe {
	public ArrayList<Alarm> alarms;
	private String pin;

	public Safe(String pin) {
		this.alarms = alarms = new ArrayList<Alarm>();
		this.pin = pin;
	}

	public void addAlarm(Alarm alarm){
		this.alarms.add(alarm);
	}

	public void removeAlarm(Alarm alarm){
		this.alarms.remove(alarm);
	}

	public void enterPin(String pin){
		if(pin.equals(this.pin))
			correctPin();
		else
			wrongPin();
	}

	private void correctPin() {
		System.out.println("Sejf otwarty");
	}

	private void wrongPin() {
		for(Alarm alarm : alarms)
			alarm.alarmTurnOn(new PinEvent(this, 1));
	}

	@Override
	public String toString() {
		return "Safe{" +
				"alarms=" + alarms +
				'}';
	}
}
