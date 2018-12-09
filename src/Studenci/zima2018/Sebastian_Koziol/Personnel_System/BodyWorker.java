package Personnel_System;

import java.util.Arrays;

public class BodyWorker extends Worker{
	private double hourlyRate;
	private int overtime;
	private int hoursWorked;
	private String boss;
	private String[] skills;

	public BodyWorker(String name, String surname, int birth, double hourlyRate, int overtime, int hoursWorked, String boss, String[] skills) {
		super(name, surname, birth);
		this.hourlyRate = hourlyRate;
		this.overtime = overtime;
		this.hoursWorked = hoursWorked;
		this.boss = boss;
		this.skills = skills;
	}

	public BodyWorker(String name, String surname, int birth) {
		super(name, surname, birth);
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}
	
	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	public double salary(double hourlyRate, int overtime, int hoursWorked) {
		double sal = 0;
		double overSal = 0;
		sal = hourlyRate * hoursWorked;
		overSal = hourlyRate * 1.5 * overtime;
		return sal+overSal;
	}
	
	public String boss() {
		return getName() + " " + getSurname();
	}

	@Override
	public String toString() {
		return "BodyWorker " + name + " " + surname + ", birth = " + birth + ", Boss " + boss()
				+ ", hourlyRate = " + hourlyRate + ", overtime = " + overtime + ", hoursWorked = " + hoursWorked
				+ " salary = " + salary(hourlyRate, overtime, hoursWorked)
				+ " Skills: " + Arrays.toString(skills);
	}
	
}
