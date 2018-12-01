package PersonalSystem.Modele;

import java.time.LocalDate;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private BornDate bornDate;
    private SkillList skillList;
    private double salary;

    public Employee(String firstName, String lastName, int year, int month, int day){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornDate = new BornDate(year,month,day);
    }

    public Employee(String firstName, String lastName, int year, int month, int day, double salary){
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornDate = new BornDate(year,month,day);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BornDate getBornDate() {
        return bornDate;
    }

    public SkillList getSkillList() {
        return skillList;
    }

    public double getSalary() {
        return salary;
    }
//
//    @Override
//    public String toString() {
//        return "Osoba: \n" +
//                "Imię: " + firstName + "\n" +
//                "Nazwisko: " + lastName + "\n" +
//                "Data urodzenia: " + bornDate + "\n";
//    }
}
