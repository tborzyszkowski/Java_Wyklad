import java.time.LocalDate;

public class Trainee extends Employee {

	public OfficeEmployee getGuardian() {
		return guardian;
	}

	public void setGuardian(OfficeEmployee guardian) {
		this.guardian = guardian;
	}

	public boolean isScholarship() {
		return isScholarship;
	}

	public void setScholarship(boolean isScholarship) {
		this.isScholarship = isScholarship;
	}

	public double getScholarship() {
		return scholarship;
	}

	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}

	private OfficeEmployee guardian;
	private boolean isScholarship;
	private double scholarship;

	public Trainee(String firstName, String surname, LocalDate yearOfBirth) {
		super(firstName, surname, yearOfBirth);
		isScholarship = false;
	}

	@Override
	double getSalary() {
		return scholarship;
	}

	@Override
	public String toString() {
		return "Trainee [guardian=" + guardian + ", scholarship=" + scholarship + ", getSalary()=" + getSalary()
				+ ", getFirstName()=" + getFirstName() + ", getSurname()=" + getSurname() + ", getYearOfBirth()="
				+ getYearOfBirth() + "]";
	}
}
