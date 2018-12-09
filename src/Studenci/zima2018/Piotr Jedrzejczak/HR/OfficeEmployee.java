package lab4.HR;

public class OfficeEmployee extends Employee {
	
	private int lumpsum;
	private int room_number;
	private int stationary_phone_number;
	private double bonus_percentage;
	
	public OfficeEmployee(String name, 
						  String surname, 
						  int birth_year, 
						  int lumpsum, 
						  double bonus_percentage, 
						  int stationary_phone_number, 
						  int room_number)
	{	
		super(name, surname, birth_year);
		this.lumpsum = lumpsum;
		this.bonus_percentage = bonus_percentage;
		this.stationary_phone_number = stationary_phone_number;
		this.room_number = room_number;
	}
	
	public double calculateSalary() {
		return lumpsum + bonus_percentage * lumpsum;
	}
	
	public void employeeInfo(StringBuilder sb)
	{	
		sb.append("\nPensja: " + lumpsum)
		  .append("\nNr.Pokoju: " + room_number)
		  .append("\nNr.Tel.Stacjonarnego: " + stationary_phone_number)
		  .append("\nProcent bonusu: " + bonus_percentage +"%");
	}
}
