import java.time.LocalDate;

public class ManualEmployee extends Employee {

	private double hourlyRate;
	private int hoursWorked;
	private int overtime;
	private Employee manager;

	public ManualEmployee(String firstName, String surname, LocalDate yearOfBirth, Employee manager) {
		super(firstName, surname, yearOfBirth);
		overtime = 0;
		hourlyRate = 0;
		hoursWorked = 0;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int n) {
		overtime += n;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int n) {
		hourlyRate += n;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int n) {
		hoursWorked += n;
	}

	@Override
	double getSalary() {
		return getHourlyRate() * getHoursWorked() + 1.5 * getHourlyRate() * getOvertime();

	}

	@Override
	public String toString() {
		return "ManualEmployee [manager=" + manager + ", getSalary()=" + getSalary() + ", getFirstName()="
				+ getFirstName() + ", getSurname()=" + getSurname() + ", getYearOfBirth()=" + getYearOfBirth() + "]";
	}

	
}
