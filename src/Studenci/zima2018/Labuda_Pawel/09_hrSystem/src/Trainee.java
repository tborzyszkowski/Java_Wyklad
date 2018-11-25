@SuppressWarnings("WeakerAccess")
public class Trainee extends Employee {
    private Employee supervisor;
    private boolean hasScholarship;

    Trainee() {
    }

    Trainee(String firstname, String lastname, int yearOfBirth, Employee supervisor, boolean hasScholarship) {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        this.supervisor = supervisor;
        this.hasScholarship = hasScholarship;
    }

    protected double netPayment() {
        return (this.isHasScholarship()) ? 1050 : 0;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "supervisor=" + supervisor.getFirstname() + ' ' + supervisor.getLastname() +
                ", hasScholarship=" + hasScholarship +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
