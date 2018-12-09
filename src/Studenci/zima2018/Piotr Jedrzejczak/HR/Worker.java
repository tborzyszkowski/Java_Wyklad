package lab4.HR;

import java.util.ArrayList;

public class Worker extends Employee {
	
	private double hourly_stake;
	private int hours_worked;
	private int overtime;
	private Manager manager;
	private ArrayList<String> skills = new ArrayList<String>();
	
	public Worker(Manager manager,
				  String name,
				  String surname,
				  int birth_year,
				  int hours_worked,
				  int overtime,
				  double hourly_stake) 
	{
		super(name, surname , birth_year);
		this.hourly_stake = hourly_stake;
		this.hours_worked = hours_worked;
		this.overtime = overtime;
		this.manager = manager;
	}
	
	public void addSkill(String skill) 
	{
		skills.add(skill);
	}
	
	public double calculateSalary() 
	{
		return hourly_stake * hours_worked + 1.5 * hourly_stake * overtime;	
	}
	
	public void employeeInfo(StringBuilder sb) 
	{
		sb.append("\nStawka Godzinowa: " + hourly_stake)
		  .append("\nIlosc przepracowanych godzin: " + hours_worked)
		  .append("\nIlosc nadgodzin: " + overtime)
		  .append("\nZwierchnik " + manager.getName())
		  .append("\nLista umiejetnosci :" + skills);
	}
	
	
}
