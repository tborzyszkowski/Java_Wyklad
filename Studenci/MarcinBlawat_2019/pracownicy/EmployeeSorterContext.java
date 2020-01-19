package employees.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSorterContext {
	
	private Comparator<Employee> comparator;
	
	public void setComparator(Comparator<Employee> comparator) {
		this.comparator = comparator;
	}
	
	public void sort(List<Employee> employees) {
		if(comparator != null)
			Collections.sort(employees, comparator);
	}
}
