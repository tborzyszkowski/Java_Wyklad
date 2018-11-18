@SuppressWarnings("WeakerAccess")
public class Scholarshiper extends Person{
    private double amountOfScholarship;

    Scholarshiper() {
    }

    Scholarshiper(String firstName, String surname, int yearOfBirth, String gender, double amountOfScholarship) {
        this();
        this.firstName = firstName;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.amountOfScholarship = amountOfScholarship;
    }

    @Override
    public String toString() {
        return "Scholarshiper{" +
                "amountOfScholarship=" + amountOfScholarship +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
