package lab4.HR;

public class BoardMember extends Employee {
	
	private int lumpsum;
	private int board_occurances;
	private Employee assistant;
	private static final int board_attendance_bonus = 500;
	
	public BoardMember(String name, String surname, int birth_year, int lumpsum, int board_occurances, Employee assistant) 
	{
		super(name, surname, birth_year);
		this.lumpsum = lumpsum;
		this.assistant = assistant;
		this.board_occurances = board_occurances;
	}
	
	public double calculateSalary()
	{
		return lumpsum + board_occurances * board_attendance_bonus;
	}
	
	public void employeeInfo(StringBuilder sb) 
	{
		sb.append("\nPensja: " + lumpsum)
		  .append("\nObecny na " + board_occurances + " spotkaniach")
		  .append("\nAsystent: " + assistant.getName());
	}
	
}
