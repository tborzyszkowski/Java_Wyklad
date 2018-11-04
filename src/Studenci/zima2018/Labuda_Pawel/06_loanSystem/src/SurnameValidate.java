import java.util.regex.Pattern;

@SuppressWarnings("WeakerAccess")
public class SurnameValidate {
    private String surname;
    private boolean isCorrect;

    SurnameValidate(String firstName) {
        this.surname = firstName;
        this.isCorrect = Validate();
    }

    public boolean Validate() {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        return (surname.length() >= 2) && (!p.matcher(surname).find());
    }

    @Override
    public String toString() {
        return "SurnameValidate{" +
                "surname='" + surname + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
