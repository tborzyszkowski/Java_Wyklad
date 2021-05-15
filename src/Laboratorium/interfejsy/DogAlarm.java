package Laboratorium.interfejsy;

public class DogAlarm implements Alarm{
	private String name;

	public DogAlarm(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void alarmTurnOn(PinEvent pinEvent) {
		System.out.println("DogAlarm: "+this.getName()+ " gonię złodzieja" + pinEvent);
	}

	@Override
	public void alarmTurnOff(PinEvent pinEvent) {
		System.out.println("DogAlarm: złapałem złodzieja" + pinEvent);
	}

	@Override
	public String toString() {
		return "DogAlarm{" +
				"name='" + name + '\'' +
				'}';
	}
}
