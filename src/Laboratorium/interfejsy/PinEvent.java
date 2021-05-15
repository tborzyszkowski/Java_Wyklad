package Laboratorium.interfejsy;

public class PinEvent {
	private Safe safe;
	public int eventDate;

	public PinEvent(Safe safe, int eventDate) {
		this.safe = safe;
		this.eventDate = eventDate;
	}

	public Safe getSafe() {
		return safe;
	}

	@Override
	public String toString() {
		return "PinEvent{" +
				"safe=" + safe +
				", eventDate=" + eventDate +
				'}';
	}
}
