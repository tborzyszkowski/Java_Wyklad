package lab4.HR;

public class IntelectualEmployee extends OfficeEmployee {
	
	private Manager manager;
	
	public IntelectualEmployee(String name, 
							   String surname, 
							   int birth_year, 
							   int lumpsum, 
							   int room_number, 
							   int stationary_phone_number, 
							   double bonus_percentage,
							   Manager manager) 
	{
		super(name, surname, birth_year, lumpsum, bonus_percentage, stationary_phone_number, room_number);
		this.manager = manager;
	}
	
	public void employeeInfo(StringBuilder sb) 
	{
		super.employeeInfo(sb);
		sb.append("\nManager:" + manager.getName());
	}
	
	
}
