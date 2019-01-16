
public class BoardMember extends Employee{
	private int salary;
	private String assistent;
	private int numberOfMeetings;
	private int stackOfMeetings=100;
	public BoardMember(String firstName, String lastName, int yearOfBirth, int salary, String assistent, int numberOfMeetings) {
		super(firstName, lastName, yearOfBirth);
		this.salary = salary;
		this.assistent = assistent;
		this.numberOfMeetings = numberOfMeetings;
	}
	public double countEarnings() {
		return salary+numberOfMeetings*stackOfMeetings;
	}
	@Override
	public String toString() {
		return "BoardMember [ firstName="+ getFirstName() + " lastName=" + getLastName() + " dateOfBirth="+ getYearOfBirth()+ " salary=" + salary + ", assistent=" + assistent + ", numberOfMeetings=" + numberOfMeetings
				+ " salary="+countEarnings() + "]";
	}
}
