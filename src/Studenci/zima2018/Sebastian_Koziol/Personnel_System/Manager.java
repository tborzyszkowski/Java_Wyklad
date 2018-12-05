package Personnel_System;

public class Manager extends MentalWorker {
	private double lumpSum;
	private int bonus;
	private int bonusMan = 500;
	private int phone;
	private int phoneNumber;
	private int room;
	private String department;
	
	public Manager(String name, String surname, int birth, double lumpSum, int bonus,
							int phone, int phoneNumber, int room, String department) {
		super(name, surname, birth);
		this.lumpSum = lumpSum;
		this.bonus = bonus;
		this.phone = phone;
		this.phoneNumber = phoneNumber;
		this.room = room;
		this.department = department;
		}
	
	public Manager(String name, String surname, int birth) {
		super(name, surname, birth);
	}

	public double getLumpSum() {
		return lumpSum;
	}

	public void setLumpSum(double lumpSum) {
		this.lumpSum = lumpSum;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getBonusMan() {
		return bonusMan;
	}

	public void getBonusMan(int bonusMan) {
		this.bonusMan = bonusMan;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double salary(double lumpSum, int bonus, int bonusMan) {
		double ls = 0;
		double b = 0;
		ls = lumpSum + bonusMan;
		b = (lumpSum * bonus)/100;
		return ls+b;
	}
	
	@Override
	public String toString() {
		return "Manager " + name + " " + surname + ", birth = " + birth
				+ ", lumpSum = " + lumpSum + ", bonus = " + bonus + ", phone = " + phone 
				+ ", phone number = " + phoneNumber + ", room " + room 
				+ ", Manage a Department " + department + ", salary = " + salary(lumpSum, bonus, bonusMan);
	}
}
