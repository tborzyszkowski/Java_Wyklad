import java.util.Comparator;
import java.util.Date;

public abstract class Employee {
    private static int lastID;
    private int id;
    private String name;
    private String surname;
    private Date birthDate;
    private Date hireDate;
    private Address address;

    public Employee(String name, String surname, Date birthDate, Date hireDate, Address address) {
        lastID+=1;
        this.id = lastID;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return "NAME: "+name+" "+surname+"  BIRTH: "+birthDate+"  HIRE: "+hireDate+"  ADRESS: "+address;
    }

    abstract int getValue();
    public int getAge() { return new Date((new Date()).getTime() - birthDate.getTime()).getYear() - 70; }
    public int getExperience() { return new Date((new Date()).getTime() - hireDate.getTime()).getYear() - 70; }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

//liczba lat doswiadczenia malejaco, wiek pracownika rosnaco, po nazwisku alfabetycznie
class Sort implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getExperience()==o2.getExperience())
            if(o1.getAge()==o2.getAge())
                return o1.getSurname().compareTo(o2.getSurname());
            else
                return o1.getAge() - o2.getAge();
        else
            return o2.getExperience() - o1.getExperience();
    }
}

class SortByValueInCompany implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getValue() - o1.getValue();
    }
}

