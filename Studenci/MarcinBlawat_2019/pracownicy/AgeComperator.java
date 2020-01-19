package employees.logic;

import java.util.Comparator;

public class AgeComperator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return Integer.valueOf(o1.getAge())
				.compareTo(Integer.valueOf(o2.getAge()));
	}

}
