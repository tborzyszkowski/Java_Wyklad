package employees.logic;

public class BlueCollarEmployee 
extends Employee
implements IEmployeeVisitorAccpeter {
	
	private int strength;
	
	public BlueCollarEmployee() {
		super();
	}
	
	public BlueCollarEmployee(int streangth, int id, String name,
				String surname, int age, Adress adress) {
		super();
		configure(id, name, surname, age, adress);
		setStrength(streangth);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(this.getClass() == obj.getClass()) {
			BlueCollarEmployee temp = (BlueCollarEmployee)obj;
			if(this.getStrength() != temp.getStrength())
				return false;
			if(!super.equals((Employee)temp))
				return false;
		}
		else
			return false;
		
		return true;
	}
	
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public void accept(EmployeeVisitor visitor) {
		visitor.getBlueCollarValue(this);
	}
}
