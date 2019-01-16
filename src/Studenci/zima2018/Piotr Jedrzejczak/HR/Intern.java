package lab4.HR;

public class Intern extends Employee{
	
	private Employee overseer;
	private boolean has_scholarship = false;
	private final static double scholarship_amount = 1000.99;
	
	public Intern(String name, String surname, int birth_year, Employee overseer) 
	{
		super(name, surname, birth_year);
		this.overseer = overseer;
	}
	
	public double calculateSalary() 
	{
		if(has_scholarship == false) 
		{
			return 0;
		}
		else 
		{
			return scholarship_amount;
		}
	}
	
	public void grantScholarship() 
	{
		this.has_scholarship = true;
	}
	
	public void revokeScholarship() 
	{
		this.has_scholarship = false;
	}
	
	public void employeeInfo(StringBuilder sb) 
	{
		sb.append("\nNadzorca: " + overseer.getName())
		  .append("\nPosiada Stydpendium: " + has_scholarship);
	}
}
