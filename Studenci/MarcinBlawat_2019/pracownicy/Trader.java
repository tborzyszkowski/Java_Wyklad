package employees.logic;

public class Trader
extends Employee
implements IEmployeeVisitorAccpeter {
	
	public enum TraderEffectivness {
		low(60),
		medium(90),
		high(120);
		
		private final int value;
		
		private TraderEffectivness(int value) {
			this.value = value;
		}
		public int getValue() {
			return this.value;
		}
	}
	
	private int commisionPercentage;
	private TraderEffectivness effectivness;
	
	public Trader() {
		super();
	}
	
	public Trader(TraderEffectivness effectivness, int commissionPercentage, 
			int id, String name, String surname, int age, Adress adress ) {
		super();
		configure(id, name, surname, age, adress);
		setEffectivness(effectivness);
		setCommisionPercentage(commissionPercentage);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getClass() == obj.getClass()) {
			Trader temp = (Trader)obj;
			if(this.getCommisionPercentage() != temp.getCommisionPercentage())
				return false;
			if(!this.getEffectivness().equals(temp.getEffectivness()))
				return false;
			if(!super.equals((Employee)temp))
				return false;
		}
		else
			return false;
		
		return true;
	}
	public TraderEffectivness getEffectivness() {
		return effectivness;
	}
	public void setEffectivness(TraderEffectivness effectivness) {
		this.effectivness = effectivness;
	}
	public int getCommisionPercentage() {
		return commisionPercentage;
	}
	public void setCommisionPercentage(int commisionPercentage) {
		this.commisionPercentage = commisionPercentage;
	}

	@Override
	public void accept(EmployeeVisitor visitor) {
		visitor.getTraderValue(this);
	}
	
	
	
}
