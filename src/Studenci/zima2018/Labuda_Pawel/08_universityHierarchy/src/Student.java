@SuppressWarnings("WeakerAccess")
public class Student extends Person {
    private int indexNumber;

    Student() {
    }

    Student(String firstName, String surname, int yearOfBirth, String gender, int indexNumber) {
        this();
        this.firstName = firstName;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.indexNumber = indexNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "indexNumber=" + indexNumber +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
