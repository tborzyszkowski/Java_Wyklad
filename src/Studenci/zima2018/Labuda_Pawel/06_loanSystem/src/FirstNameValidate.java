import java.util.regex.Pattern;

@SuppressWarnings("WeakerAccess")
public class FirstNameValidate {
    private String firstName;
    private boolean isCorrect;

    FirstNameValidate(String firstName) {
        this.firstName = firstName;
        this.isCorrect = Validate();
    }

    public boolean Validate() {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        return (firstName.length() >= 2) && (!p.matcher(firstName).find());
    }

    @Override
    public String toString() {
        return "FirstNameValidate{" +
                "firstName='" + firstName + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
