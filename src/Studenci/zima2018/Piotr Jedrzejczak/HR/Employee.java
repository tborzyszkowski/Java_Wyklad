package lab4.HR;

abstract public class Employee {
	
	private final String name;
	private final String surname;
	private final int birth_year;
	
	public Employee(String name, String surname, int birth_year)
	{
		this.name = name;
		this.surname = surname;
		this.birth_year = birth_year;
	}
	
	public String getName() {
		return this.name;
	}

	abstract public void employeeInfo(StringBuilder stringBuilder);
	
	abstract public double calculateSalary();
	
	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder().append("Imie: " + name)
											  .append("\nNazwisko: " + surname)
											  .append("\nRok Urodzenia: " + birth_year);
		this.employeeInfo(sb);
		
		return sb.toString();
	}
	
}
