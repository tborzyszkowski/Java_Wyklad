import java.time.LocalDate;

public class BoardMember extends Employee {

	private double salary;
	private int quantityOfMeetings;
	private double salaryOneMeeting;

	public BoardMember(String firstName, String surname, LocalDate yearOfBirth) {
		super(firstName, surname, yearOfBirth);
		salaryOneMeeting = 0;
		quantityOfMeetings = 0;
		salary = 0;
	}

	public int getQuantityOfMeetings() {
		return quantityOfMeetings;
	}

	public void setQuantityOfMeetings(int quantityOfMeetings) {
		this.quantityOfMeetings = quantityOfMeetings;
	}

	public double getSalaryOneMeeting() {
		return salaryOneMeeting;
	}

	public void setSalaryOneMeeting(double salaryOneMeeting) {
		this.salaryOneMeeting = salaryOneMeeting;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	double getSalary() {
		return salary + quantityOfMeetings * salaryOneMeeting;
	}

	@Override
	public String toString() {
		return "BoardMember [salary=" + salary + ", quantityOfMeetings=" + quantityOfMeetings + ", salaryOneMeeting="
				+ salaryOneMeeting + ", getFirstName()=" + getFirstName() + ", getSurname()=" + getSurname()
				+ ", getYearOfBirth()=" + getYearOfBirth() + "]";
	}
}
