package employees.logic;

import java.util.Comparator;

public class ReverseExperianceComperator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSeniorityInYears() > o2.getSeniorityInYears())
			return -1;
		if(o1.getSeniorityInYears() < o2.getSeniorityInYears())
			return 1;
		return 0;
	}

}
