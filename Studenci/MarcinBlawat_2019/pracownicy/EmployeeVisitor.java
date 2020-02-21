package employees.logic;

public abstract class EmployeeVisitor {
	
	private double value;
	
	public double getValue() {
		return value;
	}
	protected void setValue(double value) {
		this.value = value;
	}
	public abstract void getWhiteCollarValue(WhiteCollarEmployee employee);
	public abstract void getBlueCollarValue(BlueCollarEmployee employee);
	public abstract void getTraderValue(Trader employee);
}
