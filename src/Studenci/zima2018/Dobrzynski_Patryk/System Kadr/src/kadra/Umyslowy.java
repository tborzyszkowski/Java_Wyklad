package kadra;

public class Umyslowy extends Pracownik {
	
	private double salary;
	private int bonus;
	private String boss;
	private int phoneNumber;
	private int roomNumber;
	
	public Umyslowy(String Name, String Surname, String DoB, double salary, int bonus, String boss, int phoneNumber, int roomNumber) {
		super(Name, Surname, DoB);
		this.salary = salary + (bonus * salary);
		this.bonus = bonus;
		this.boss = boss;
		this.phoneNumber = phoneNumber;
		this.roomNumber = roomNumber;
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

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
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

	@Override
	public String toString() {
		return "Umyslowy [salary=" + salary + ", bonus=" + bonus + ", boss=" + boss + ", phoneNumber=" + phoneNumber
				+ ", roomNumber=" + roomNumber + ", Name=" + Name + ", Surname=" + Surname + ", DoB=" + DoB + "]";
	}

	
	

}
