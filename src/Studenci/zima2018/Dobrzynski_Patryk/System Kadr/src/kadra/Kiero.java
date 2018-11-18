package kadra;

public class Kiero extends Pracownik {
	
	private double salary;
	private int bonus;
	private double bossBonus;
	private int phoneNumber;
	private int roomNumber;
	private String departmentName;
	
	public Kiero(String Name, String Surname, String DoB, double salary, int bonus, double bossBonus, int phoneNumber, int roomNumber, String departmentName) {
		super(Name, Surname, DoB);
		this.salary = salary + (bonus * salary) + bossBonus;
		this.bonus = bonus;
		this.bossBonus = bossBonus;
		this.phoneNumber = phoneNumber;
		this.roomNumber = roomNumber;
		this.departmentName = departmentName;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public double getBossBonus() {
		return bossBonus;
	}
	public void setBossBonus(double bossBonus) {
		this.bossBonus = bossBonus;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Kiero [salary=" + salary + ", bonus=" + bonus + ", bossBonus=" + bossBonus + ", phoneNumber="
				+ phoneNumber + ", roomNumber=" + roomNumber + ", departmentName=" + departmentName + ", Name=" + Name
				+ ", Surname=" + Surname + ", DoB=" + DoB + "]";
	}
	
	
	

}
