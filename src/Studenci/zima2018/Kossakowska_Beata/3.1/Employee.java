import java.time.LocalDate;

public abstract class Employee {

	private String firstName;
	private String surname;
	private LocalDate yearOfBirth;

	public Employee(String firstName, String surname, LocalDate yearOfBirth) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.yearOfBirth = yearOfBirth;
	}

	abstract double getSalary();

	public String getFirstName() {
		return firstName;
	}

	public String getSurname() {
		return surname;
	}

	public LocalDate getYearOfBirth() {
		return yearOfBirth;
	}

}
