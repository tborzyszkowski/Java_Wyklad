package Personnel_System;

public class BoardMember extends MentalWorker {
	private String assistant;
	private int meetings;
	
	public BoardMember(String name, String surname, int birth, double lumpSum, String assistant, int meetings) {
		super(name, surname, birth);
		this.lumpSum = lumpSum;
		this.assistant = assistant;
		this.meetings = meetings;
		}

	public String getAssistant() {
		return assistant;
	}

	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	public int getMeetings() {
		return meetings;
	}

	public void setMeetings(int meetings) {
		this.meetings = meetings;
	}
	
	public double salary(double lumpSum, int meetings) {
		double salary = lumpSum + (100*meetings);
		return salary;
	}

	@Override
	public String toString() {
		return "BoardMember " + name + " " + surname + ", birth=" + birth + ", lumpSum = " + salary(lumpSum, meetings) 
				+ ", Assistant: " + getAssistant() + ", Meetings " + getMeetings();
	}
}
