import java.time.LocalDate;

public class OfficeEmployee extends Employee {

	private Employee manager;
	private String phoneNumber;
	private String roomNumber;
	private double salary;
	private double percentageOfBonus;

	public OfficeEmployee(String firstName, String surname, LocalDate yearOfBirth, Employee manager, String phoneNumber,
			String roomNumber) {
		super(firstName, surname, yearOfBirth);
		this.manager = manager;
		this.phoneNumber = phoneNumber;
		this.roomNumber = roomNumber;
		salary = 0;
		percentageOfBonus = 0;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public double getPercentageOfBonus() {
		return percentageOfBonus;
	}

	public void setPercentageOfBonus(double percentageOfBonus) {
		this.percentageOfBonus = percentageOfBonus;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	double getSalary() {
		return salary + percentageOfBonus * salary;
	}

	@Override
	public String toString() {
		return "OfficeEmployee [manager=" + manager + ", phoneNumber=" + getPhoneNumber() + ", roomNumber=" + roomNumber
				+ ", getSalary()=" + getSalary() + ", getFirstName()=" + getFirstName() + ", getSurname()="
				+ getSurname() + ", getYearOfBirth()=" + getYearOfBirth() + "]";
	}

}
