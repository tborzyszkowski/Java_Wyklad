import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private String empName;
    private String empSurname;
    private int empAge;
    private int empExperience;
    private String streetName;
    private int buildNumber;
    private int localNumber;
    private String cityName;

    public List<Employee> sortedArray() {
        List<Employee> tempList = new ArrayList<>(employeeList);
        for (int i = 0; i < tempList.size(); i++) {
            for (int j = i; j < tempList.size(); j++) {
                if (tempList.get(i).getEmpExperience() < tempList.get(j).getEmpExperience()) {
                    tempList = swapIndex(tempList, i, j);
                } else if (i > 0 && tempList.get(i).getEmpExperience() == tempList.get(i - 1).getEmpExperience()) {
                    if (tempList.get(i).getEmpAge() < tempList.get(i - 1).getEmpAge()) {
                        tempList = swapIndex(tempList, i, i - 1);
                    } else if ((tempList.get(i).getEmpAge() == tempList.get(i - 1).getEmpAge())) {
                        int varCompareTo = tempList.get(i).getEmpSurname().compareTo(tempList.get(i - 1).getEmpSurname());
                        if (varCompareTo < 0) {
                            tempList = swapIndex(tempList, i, i - 1);
                        }
                    }
                }
            }
        }
        return tempList;
    }

    private List<Employee> swapIndex(List<Employee> list, int higher, int lower){
        Employee temp = list.get(higher);
        list.set(higher, list.get(lower));
        list.set(lower, temp);
        return list;
    }

    private String allEmployeesToString(List<Employee> employeeList){
        String result = String.format("%3s %10s %20s %4s %4s %20s\n", "ID", "IMIĘ", "NAZWISKO", "DOŚW", "WIEK", "MIASTO");
        for(int i=0; i<employeeList.size(); i++){
            if(!(employeeList.get(i) == null)) {
                result += toString(employeeList, i);
            }
        }
        return result;
    }

    public String showEmplyeesValue(){
        String result = String.format("%3s %10s %20s %4s %4s %20s %10s\n", "ID", "IMIĘ", "NAZWISKO", "DOŚW", "WIEK", "MIASTO", "WARTOŚĆ");
        for(int i=0; i<employeeList.size(); i++){
            if(employeeList.get(i) instanceof OfficeEmployee){
                result += employeeList.get(i).toString(i) + String.format(" %10s\n", (((OfficeEmployee)(employeeList.get(i))).corporationValue()));
            }
            else if(employeeList.get(i) instanceof PhisicalEmployee){
                result += employeeList.get(i).toString(i) + String.format(" %10s\n", (((PhisicalEmployee)(employeeList.get(i))).corporationValue()));
            }
            else if(employeeList.get(i) instanceof TradesmanEmployee){
                result += employeeList.get(i).toString(i) + String.format(" %10s\n", (((TradesmanEmployee)(employeeList.get(i))).corporationValue()));
            }
        }
        return result;
    }

    private String toString(int id){
        return String.format("%3d %10s %20s %4d %4d %20s", employeeList.get(id).getId(), employeeList.get(id).getEmpName(),
                employeeList.get(id).getEmpSurname(), employeeList.get(id).getEmpExperience(), employeeList.get(id).getEmpAge(),
                employeeList.get(id).getCityName());
    }

    private String toString(List<Employee> employeeList, int id){
        return String.format("%3d %10s %20s %4d %4d %20s\n", employeeList.get(id).getId(), employeeList.get(id).getEmpName(),
                employeeList.get(id).getEmpSurname(), employeeList.get(id).getEmpExperience(), employeeList.get(id).getEmpAge(),
                employeeList.get(id).getCityName());
    }

    public String toString(){
        return allEmployeesToString(employeeList);
    }

    public String toString(List<Employee> list){
        return allEmployeesToString(list);
    }

    public Employee getEmployeeList(int idx) {
        return employeeList.get(idx);
    }

    public List<Employee> findCity(String city){
        List<Employee> resultList = new ArrayList<>();
        for(int i=0; i<employeeList.size(); i++){
            if(employeeList.get(i).getCityName() == city){
                resultList.add(employeeList.get(i));
            }
        }
        return resultList;
    }

    public List<Employee> getEmployeeList(){ return this.employeeList;}

    public void addEmployeeList(Employee emp) {
        employeeList.add(emp);
        this.id = employeeList.indexOf(emp);
    }

    public void addEmployeeListById(Employee emp, int id){
        if(id < employeeList.size() && id >= 0){
            employeeList.add(id, emp);
        }
    }

    public void remEmployeeList(int idx){
        employeeList.set(idx, null);
    }

    public int getId(){
        return id;
    }

    public int getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(int localNumber) {
        this.localNumber = localNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public int getEmpExperience() {
        return empExperience;
    }

    public void setEmpExperience(int empExperience) {
        this.empExperience = empExperience;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
