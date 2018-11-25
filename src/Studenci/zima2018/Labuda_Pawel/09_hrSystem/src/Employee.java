@SuppressWarnings("WeakerAccess")
public class Employee {
    protected String firstname;
    protected String lastname;
    protected int yearOfBirth;

    Employee() {
    }

    public void printNetPayment(double netPayment) {
        System.out.println(this.getFirstname() + ' ' + this.getLastname() + ": " + netPayment);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
