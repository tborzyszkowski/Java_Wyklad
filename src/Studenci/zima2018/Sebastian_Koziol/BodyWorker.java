package Personnel_System;

//import java.util.ArrayList;

public class BodyWorker extends Worker{
	private double hourlyRate;
	private int overtime;
	private int hoursWorked;
	
	public BodyWorker(String name, String surname, int birth, double hourlyRate, int overtime, int hoursWorked) {
		super(name, surname, birth);
		this.hourlyRate = hourlyRate;
		this.overtime = overtime;
		this.hoursWorked = hoursWorked;
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
	
	public double salary(double hourlyRate, int overtime, int hoursWorked) {
		double sal = 0;
		double overSal = 0;
		sal = hourlyRate * hoursWorked;
		overSal = hourlyRate * 1.5 * overtime;
		return sal+overSal;
	}
	/* do zmiany
	public ArrayList<String> abilitiesAdd(String a) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add(a);
		return lista;
	}
	
	//public ArrayList<String> getAbilities(this.abilitiesAdd(a) {
	//	return this;
	//}*/

	@Override
	public String toString() {
		return "BodyWorker " + name + " " + surname + ", birth = " + birth
				+ ", hourlyRate = " + hourlyRate + ", overtime = " + overtime + ", hoursWorked = " + hoursWorked
				+ " salary = " + salary(hourlyRate, overtime, hoursWorked);
	}
	
}
