package PersonalSystem.Modele;

public class Student extends Employee {
    private Employee practiceSuperviser;
    private boolean scholarship;

    public Student(String firstName, String lastName, int year, int month, int day, Employee practiceSuperviser, boolean scholarship){
        super(firstName, lastName, year, month, day);
        this.practiceSuperviser = practiceSuperviser;
        this.scholarship = scholarship;
    }

    @Override
    public double getSalary() {
        double scholarshipSalary = 0;
        if (scholarship){
            scholarshipSalary = 1500.0;
        }
        return scholarshipSalary;
    }

    @Override
    public String toString() {
        return "\nStudent:\n" +
                "Imię: " + super.getFirstName() + "\n" +
                "Nazwisko: " + super.getLastName() + "\n" +
                "Opiekun: " + practiceSuperviser.getFirstName() + "\n" +
                "Stypendium: " + getSalary();
    }
}
