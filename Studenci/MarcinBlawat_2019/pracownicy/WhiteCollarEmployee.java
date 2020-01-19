package employees.logic;

public class WhiteCollarEmployee 
extends Employee
implements IEmployeeVisitorAccpeter
{

	private int suitId;
	private int intellect;
	
	
	public WhiteCollarEmployee() {
		super();
	}
	
	public WhiteCollarEmployee(int suitId, int intellect, int id, 
					String name, String surname, int age, Adress adress) {
		super();
		configure(id, name, surname, age, adress);
		setSuitId(suitId);
		setIntellect(intellect);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getClass() == obj.getClass()) {
			WhiteCollarEmployee temp = (WhiteCollarEmployee)obj;
			if(this.getIntellect() != temp.getIntellect())
				return false;
			if(this.getSuitId() != temp.getSuitId())
				return false;
			if(!super.equals((Employee)temp))
				return false;
		}
		else 
			return false;
		
		return true;
	}
	public int getSuitId() {
		return suitId;
	}

	public void setSuitId(int suitId) {
		this.suitId = suitId;
	}

	public int getIntellect() {
		return intellect;
	}

	public void setIntellect(int intellect) {
		this.intellect = intellect;
	}

	@Override
	public void accept(EmployeeVisitor visitor) {
		visitor.getWhiteCollarValue(this);
	}
	
	
}
