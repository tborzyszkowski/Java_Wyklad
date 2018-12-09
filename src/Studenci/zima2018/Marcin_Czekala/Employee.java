
public class Employee {
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	public Employee(String firstName, String lastName, int yearOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", yearOfBirth=" + yearOfBirth + "]";
	}
}
