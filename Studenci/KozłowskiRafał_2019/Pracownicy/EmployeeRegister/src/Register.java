import java.util.ArrayList;
import java.util.List;

public class Register {
    private int lastID = 0;
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public String sortedArray() {
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
        return getAllEmployees(tempList);
    }

    private List<Employee> swapIndex(List<Employee> list, int higher, int lower){
        Employee temp = list.get(higher);
        list.set(higher, list.get(lower));
        list.set(lower, temp);
        return list;
    }

    private String getAllEmployees(List<Employee> employeeList){
        String result = String.format("%3s %10s %20s %4s %4s %20s\n", "ID", "IMIĘ", "NAZWISKO", "DOŚW", "WIEK", "MIASTO");
        for (Employee i : employeeList)
            result += i.toString() + "\n";
        return result;
    }

    private String getAllEmployees(){
        String result = String.format("%3s %10s %20s %4s %4s %20s\n", "ID", "IMIĘ", "NAZWISKO", "DOŚW", "WIEK", "MIASTO");
        for (Employee i : employeeList)
            result += i.toString() + "\n";
        return result;
    }

    public String getEmployeesValue(){
        String result = String.format("%3s %10s %20s %4s %4s %20s %10s\n", "ID", "IMIĘ", "NAZWISKO", "DOŚW", "WIEK", "MIASTO", "WARTOŚĆ");
        for (Employee i : employeeList){
            if(i instanceof OfficeEmployee){
                result += i.toString() + String.format(" %10s\n", (((OfficeEmployee)(i)).corporationValue()));
            }
            else if(i instanceof PhisicalEmployee){
                result += i.toString() + String.format(" %10s\n", (((PhisicalEmployee)(i)).corporationValue()));
            }
            else if(i instanceof TradesmanEmployee){
                result += i.toString() + String.format(" %10s\n", (((TradesmanEmployee)(i)).corporationValue()));
            }
        }
        return result;
    }

    public String toString(){
        return getAllEmployees();
    }

    public int getLastID(){ return lastID; }

    public void remEmployee(Employee worker) {
        employeeList.remove(worker);
    }

    public void remEmployee(int id){
        employeeList.remove(findEmployee(id));
    }

    private Employee findEmployee(int idx) {
        for ( Employee x : employeeList )
            if (x.getId() == idx)
                return x;
        return null;
    }

    public void addEmployee(Employee ... employees){
        for (Employee x : employees) {
            employeeList.add(x);
            x.setId(++lastID);
        }
    }

    public List<Employee> getEmployeeList(){ return this.employeeList;}

    public String findCity(String city){
        List<Employee> resultList = new ArrayList<>();
        for (Employee i : employeeList){
            if(i.getCityName() == city){
                resultList.add(i);
            }
        }
        return getAllEmployees(resultList);
    }

}