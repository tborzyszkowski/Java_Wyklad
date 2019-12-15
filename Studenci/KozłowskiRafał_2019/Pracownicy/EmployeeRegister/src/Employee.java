import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id = 0; //initialize with 0, will get id after adding to register
    private String empName;
    private String empSurname;
    private int empAge;
    private int empExperience;
    private String streetName;
    private int buildNumber;
    private int localNumber;
    private String cityName;

    public String toString(){
        return String.format("%3d %10s %20s %4d %4d %20s", id, empName, empSurname, empExperience, empAge, cityName);
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

    public void setId(int id){
        this.id = id;
    }
}
