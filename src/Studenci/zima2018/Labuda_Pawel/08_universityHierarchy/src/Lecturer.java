@SuppressWarnings("WeakerAccess")
public class Lecturer extends Person{
    private String title;

    Lecturer() {
    }

    Lecturer(String firstName, String surname, int yearOfBirth, String gender, String title) {
        this();
        this.firstName = firstName;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
