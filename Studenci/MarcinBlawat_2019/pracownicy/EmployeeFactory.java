package employees.logic;

public class EmployeeFactory {
	
	public enum EmployeeType {
		blueCollar,
		whiteCollar,
		trader;
	}
	
	public EmployeeFactory() {}
	
	public Employee createEmployee(EmployeeType type) {
		return getEmployee(type);
	}
	
	public static Employee getEmployee(EmployeeType type) {
		switch(type) {
		case whiteCollar:
			return new WhiteCollarEmployee();
		case blueCollar:
			return new BlueCollarEmployee();
		case trader:
			return new Trader();
		default:
			return null;
		} 
	}
}
