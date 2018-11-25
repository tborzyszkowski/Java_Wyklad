@SuppressWarnings("WeakerAccess")
public class Manager extends Employee {
    private double salary;
    private double bonusPercent;
    private double benefit;
    private String phoneNumber;
    private String mobileNumber;
    private int roomNumber;
    private String deparment;

    Manager() {
    }

    Manager(String firstname, String lastname, int yearOfBirth, double salary, double bonusPercent,
                 double benefit, String phoneNumber, String mobileNumber, int roomNumber, String deparment) {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
        this.bonusPercent = bonusPercent;
        this.benefit = benefit;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this. roomNumber = roomNumber;
        this.deparment = deparment;
    }

    protected double netPayment() {
        return this.getSalary() + this.getBonusPercent() * this.getSalary() + this.getBenefit();
    }

    private double getSalary() {
        return salary;
    }

    private double getBonusPercent() {
        return bonusPercent;
    }

    private double getBenefit() {
        return benefit;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salary=" + salary +
                ", bonusPercent=" + bonusPercent +
                ", benefit=" + benefit +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", roomNumber=" + roomNumber +
                ", deparment='" + deparment + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
