@SuppressWarnings("WeakerAccess")
public class ExecutiveBoardMember extends Employee {
    private double salary;
    private Employee assistant;
    private int countOfMT;

    ExecutiveBoardMember() {
    }

    ExecutiveBoardMember(String firstname, String lastname, int yearOfBirth, double salary, Employee assistant, int countOfMT) {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
        this.assistant = assistant;
        this.countOfMT = countOfMT;
    }

    protected double netPayment() {
        return this.getSalary() + this.getCountOfMT() * 100;
    }

    private double getSalary() {
        return salary;
    }

    private int getCountOfMT() {
        return countOfMT;
    }

    @Override
    public String toString() {
        return "ExecutiveBoardMember{" +
                "salary=" + salary +
                ", assistant=" + assistant.getFirstname() + ' ' + assistant.getLastname() +
                ", countOfMT=" + countOfMT +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
