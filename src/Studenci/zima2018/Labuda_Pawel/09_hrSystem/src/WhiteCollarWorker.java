@SuppressWarnings("WeakerAccess")
public class WhiteCollarWorker extends Employee {
    private double salary;
    private double bonusPercent;
    private Employee manager;
    private String phoneNumber;
    private int roomNumber;

    WhiteCollarWorker() {
    }

    WhiteCollarWorker(String firstname, String lastname, int yearOfBirth, double salary, double bonusPercent,
            Employee manager, String phoneNumber, int roomNumber) {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
        this.bonusPercent = bonusPercent;
        this.manager = manager;
        this.phoneNumber = phoneNumber;
        this. roomNumber = roomNumber;
    }

    protected double netPaymnt() {
        return this.getSalary() + this.getBonusPercent() * this.getSalary();
    }

    private double getSalary() {
        return salary;
    }

    private double getBonusPercent() {
        return bonusPercent;
    }

    @Override
    public String toString() {
        return "WhiteCollarWorker{" +
                "salary=" + salary +
                ", bonusPercent=" + bonusPercent +
                ", manager=" + manager.getFirstname() + ' ' + manager.getLastname() +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", roomNumber=" + roomNumber +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
