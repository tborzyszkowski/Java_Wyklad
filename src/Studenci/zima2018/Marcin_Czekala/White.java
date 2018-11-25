
public class White extends Employee{
	private int salary;
	private double bonus;
	private String head;
	private int phoneNumber;
	private int roomNumber;
	
	public int getSalary() {
		return salary;
	}
	public double getBonus() {
		return bonus;
	}
	public String getHead() {
		return head;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public int getRoomNumber() {
		return roomNumber;
	}

	public White(String firstName, String lastName, int yearOfBirth, int salary, double bonus, String head, int phoneNumber, int roomNumber) {
		super(firstName, lastName, yearOfBirth);
		this.salary = salary;
		this.bonus = bonus;
		this.head = head;
		this.phoneNumber = phoneNumber;
		this.roomNumber = roomNumber;
	}
	public double countEarnings() {
		return salary+salary*bonus;
	}
	@Override
	public String toString() {
		return "White[ firstName="+ getFirstName() + " lastName=" + getLastName() + " dateOfBirth="+ getYearOfBirth() + " salary=" + salary + ", bonus=" + bonus + ", head=" + head + ", phoneNumber=" + phoneNumber
				+ ", roomNumber=" + roomNumber + " salary="+countEarnings() +"]";
	}
}