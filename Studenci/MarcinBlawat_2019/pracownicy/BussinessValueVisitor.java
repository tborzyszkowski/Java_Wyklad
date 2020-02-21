package employees.logic;

public class BussinessValueVisitor extends EmployeeVisitor {

	@Override
	public void getWhiteCollarValue(WhiteCollarEmployee employee) {
		setValue(employee.getSeniorityInYears() * employee.getIntellect());
	}

	@Override
	public void getBlueCollarValue(BlueCollarEmployee employee) {
		setValue(employee.getSeniorityInYears()*
				((double)employee.getStrength()/employee.getAge()));
	}

	@Override
	public void getTraderValue(Trader employee) {
		setValue(employee.getSeniorityInYears()*employee.getEffectivness().getValue());
	}

}
