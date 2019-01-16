package lab4.HR;

public class Manager extends OfficeEmployee {
	
	private int cell_phone_number;
	private int executive_addition;
	private String department;
	
	public Manager(String name,
				   String surname,
				   String department,
				   int birth_year,
				   int salary,
				   int executive_addition,
				   int stationary_phone_number,
				   int room_number,
				   int cell_phone_number,
				   double bonus_percentage)
	{
		super(name, surname, birth_year, salary, bonus_percentage, stationary_phone_number, room_number);
		this.department = department;
		this.executive_addition = executive_addition;
		this.cell_phone_number = cell_phone_number;
	}
	
	public double calculateSalary() {
		return super.calculateSalary() + executive_addition;
	}
	
	public void employeeInfo(StringBuilder sb) 
	{	
		super.employeeInfo(sb);
		sb.append("\nDodatek Kierowniczy: " + executive_addition)
		  .append("\nTel.Komorkowy: " + cell_phone_number)
		  .append("\nDepartament: " + department);
	}
}
