package employees.logic;

import employees.logic.EmployeeFactory.EmployeeType;
import employees.logic.Trader.TraderEffectivness;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Register {

	private EmployeeFactory factory;
	private List<Employee> employees;
	private EmployeeVisitor visitor;
	
	public Register(EmployeeFactory factory) {
		setFacotry(factory);
		this.employees = new ArrayList<>();
	}
	
	public void setVisitor(EmployeeVisitor visitor) {
		this.visitor = visitor;
	}
	
	protected void setFacotry(EmployeeFactory factory) {
		this.factory = factory;
	}
	
	protected EmployeeFactory getFactory() {
		return this.factory;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public List<Employee> getEmployeesByCity(String city) {
		return getEmployees().stream()
				.filter(employee -> city.equals(employee.getAdress().getCity()))
				.collect(Collectors.toList());
	}
	
	public void addWhiteCollarEmployee(int suitId, int intellect, 
					int id, String name, String surname, int age, Adress adress) {
		WhiteCollarEmployee employee = (WhiteCollarEmployee)getFactory().createEmployee(EmployeeType.whiteCollar);
		employee.configure(id, name, surname, age, adress);
		employee.setIntellect(intellect);
		employee.setSuitId(suitId);
		getEmployees().add(employee);
	}		
	
	public void addBlueCollarEmployee(int strength, int id, String name,
			String surname, int age, Adress adress) {
		BlueCollarEmployee employee = (BlueCollarEmployee)getFactory().createEmployee(EmployeeType.blueCollar);
		employee.configure(id, name, surname, age, adress);
		employee.setStrength(strength);
		getEmployees().add(employee);
	}
	
	public void addTrader(TraderEffectivness effectivness, int commissionPercentage, 
					int id, String name, String surname, int age, Adress adress) {
		Trader employee = (Trader)getFactory().createEmployee(EmployeeType.trader);
		employee.configure(id, name, surname, age, adress);
		employee.setEffectivness(effectivness);
		employee.setCommisionPercentage(commissionPercentage);
		getEmployees().add(employee);
	}

	public int count() {
		return employees.size();
	}
	
	public void removeEmployee(int id) {
		getEmployees().removeIf(employee -> employee.getId() == id);	
	}
	
	public Employee getEmployee(int id) {
		return getEmployees().stream().filter(employee -> Integer
				.valueOf(id).equals(employee.getId())).findAny().orElse(null);
	}
	
	public void addManyEmployees(Employee...employees) {
		for (Employee employee : employees) {
			getEmployees().add(employee);
		}
	}
	
	@SafeVarargs
	public final List<Employee> getSortedEmployees(Comparator<Employee> ...comperators) {
		List<Employee> temp = employees.stream().collect(Collectors.toList());
		EmployeeSorterContext context = new EmployeeSorterContext();
		for(var comparator:comperators) {
		context.setComparator(comparator);
		context.sort(temp);
		}
		return temp;
	}
	
	public List<String> getEmployeesWithBussinessValue() {
		List<String> list= new ArrayList<>();
		
		for(Employee employee : getEmployees()) {
			IEmployeeVisitorAccpeter accepter = (IEmployeeVisitorAccpeter)employee;
			accepter.accept(this.visitor);
			String temp = employee.getName() + " " + employee.getSurname() + " : " + this.visitor.getValue();
			list.add(temp);
		}
		return list;
		
	}
}
