import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Employee> employees = new ArrayList<>();

    public Register() {}

    @Override
    public String toString() {
        return employees.toString();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addEmployee(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public List<Employee> getSortedEmployees() {
        employees.sort(new Sort());
        return employees;
    }

    public List<Employee> getSortedByValueEmployees() {
        employees.sort(new SortByValueInCompany());
        return employees;
    }

    public List<Employee> getEmployeesFromTown(String town) {
        List<Employee> employeesFromTown = new ArrayList<>();
        for(Employee employee : this.employees) {
            if(employee.getAddress().getCity().equals(town))
                employeesFromTown.add(employee);
        }
        return employeesFromTown;
    }

    public void delEmployee(Employee employee) {
        if(employee.getClass().getName().equals("OfficeEmployee"))
            ((OfficeEmployee)employee).unregister();
        employees.remove(employee);
    }
}
