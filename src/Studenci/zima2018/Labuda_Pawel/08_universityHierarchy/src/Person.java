@SuppressWarnings("WeakerAccess")
public class Person {
    protected String firstName;
    protected String surname;
    protected int yearOfBirth;
    protected String gender;

    Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
