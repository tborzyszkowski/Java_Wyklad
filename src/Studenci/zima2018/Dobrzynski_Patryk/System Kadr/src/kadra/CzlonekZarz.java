package kadra;

public class CzlonekZarz extends Pracownik {
	
	private double salary;
	private String assistantName;
	private int numbOfMeetings;
	private int moneyPerMeeting;
	
	public CzlonekZarz(String Name, String Surname, String DoB, double salary, String assistantName, int numbOfMeetings, int moneyPerMeeting) {
		super(Name, Surname, DoB);
		this.salary = salary + (numbOfMeetings * moneyPerMeeting);
		this.assistantName = assistantName;
		this.numbOfMeetings = numbOfMeetings;
		this.moneyPerMeeting = moneyPerMeeting;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAssistantName() {
		return assistantName;
	}
	public void setAssistantName(String assistantName) {
		this.assistantName = assistantName;
	}
	public int getNumbOfMeetings() {
		return numbOfMeetings;
	}
	public void setNumbOfMeetings(int numbOfMeetings) {
		this.numbOfMeetings = numbOfMeetings;
	}
	
	public int getMoneyPerMeeting() {
		return moneyPerMeeting;
	}

	public void setMoneyPerMeeting(int moneyPerMeeting) {
		this.moneyPerMeeting = moneyPerMeeting;
	}

	@Override
	public String toString() {
		return "CzlonekZarz [name=" + Name + ", surname=" + Surname + ", Date of Birth=" + DoB + ", salary=" + salary + ", assistantName=" + assistantName + ", numbOfMeetings="
		+ numbOfMeetings + "]";
	}
	
	

}
