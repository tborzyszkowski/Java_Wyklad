import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class ManualWorker extends Employee {
    private double hourlyRate;
    private double workedHours;
    private double overtimeHours;
    private Employee manager;
    private String[] skills;

    ManualWorker() {
    }

    ManualWorker(String firstname, String lastname, int yearOfBirth, double hourlyRate, double workedHours,
                 double overtimeHours, Manager manager, String[] skills) {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
        this.overtimeHours = overtimeHours;
        this.manager = manager;
        this.skills = skills;
    }

    protected double netPayment() {
        return this.getHourlyRate() * this.getWorkedHours() + 1.5 * this.getHourlyRate() * this.getOvertimeHours();
    }

    private double getHourlyRate() {
        return hourlyRate;
    }

    private double getWorkedHours() {
        return workedHours;
    }

    private double getOvertimeHours() {
        return overtimeHours;
    }

    @Override
    public String toString() {
        return "ManualWorker{" +
                "hourlyRate=" + hourlyRate +
                ", workedHours=" + workedHours +
                ", overtimeHours=" + overtimeHours +
                ", manager=" + manager.getFirstname() + ' ' + manager.getLastname() +
                ", skills=" + Arrays.toString(skills) +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
