package Personnel_System;

public class MentalWorker extends Worker {
	protected double lumpSum;
	private int bonus;
	private String boss;
	private int phone;
	private int room;
	
	
	public MentalWorker(String name, String surname, int birth, double lumpSum, int bonus, String boss, int phone, int room) {
		super(name, surname, birth);
		this.lumpSum = lumpSum;
		this.bonus = bonus;
		this.boss = boss;
		this.phone = phone;
		this.room = room;
		}
	
	public MentalWorker(String name, String surname, int birth) {
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

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	
	public double salary(double lumpSum, int bonus) {
		double ls = 0;
		double b = 0;
		ls = lumpSum;
		b = (lumpSum *bonus)/100;
		return ls+b;
	}
	
	public String boss() {
		return getName() + " " + getSurname();
	}

	@Override
	public String toString() {
		return "MentalWorker " + name + " " + surname + ", birth = " + birth
				+ ", lumpSum = " + lumpSum + ", bonus = " + bonus + " Boss " + boss()
				+ ", phone = " + phone + ", room " + room
				+ " salary = " + salary(lumpSum, bonus);
	}
}
