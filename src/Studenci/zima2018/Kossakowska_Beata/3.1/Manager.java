import java.time.LocalDate;

public class Manager extends Employee {

	private String phoneNumber;
	private String roomNumber;
	private double salary;
	private double percentageOfBonus;

	private double bonus;

	public Manager(String firstName, String surname, LocalDate yearOfBirth, String phoneNumber, String roomNumber) {
		super(firstName, surname, yearOfBirth);
		this.phoneNumber = phoneNumber;
		this.roomNumber = roomNumber;
		salary = 0;
		percentageOfBonus = 0;
		bonus = 0;
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

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	double getSalary() {
		return salary + percentageOfBonus * salary + bonus;
	}

	@Override
	public String toString() {
		return "Manager [phoneNumber=" + phoneNumber + ", roomNumber=" + roomNumber + ", getSalary()=" + getSalary()
				+ ", getFirstName()=" + getFirstName() + ", getSurname()=" + getSurname() + ", getYearOfBirth()="
				+ getYearOfBirth() + "]";
	}

}
