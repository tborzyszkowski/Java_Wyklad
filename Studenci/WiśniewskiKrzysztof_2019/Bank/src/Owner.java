import java.time.LocalDate;
import java.util.Objects;

public class Owner {
    private String name;
    private String surname;
    private LocalDate date_of_birth;


    public Owner(String name, String surname, LocalDate date_of_birth) {
        this.name = name;
        this.surname = surname;
        this.date_of_birth = date_of_birth;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(name, owner.name) &&
                Objects.equals(surname, owner.surname) &&
                Objects.equals(date_of_birth, owner.date_of_birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, date_of_birth);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

}
