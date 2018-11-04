import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@SuppressWarnings("WeakerAccess")
public class DateOfBirthValidate {
    private Date dateOfBirth;
    private Calendar dateOfBirthCal;
    private boolean isCorrect;

    public DateOfBirthValidate(Date dateOfBirth, String pesel) {
        this.dateOfBirth = dateOfBirth;
        this.dateOfBirthCal = new GregorianCalendar();
        this.dateOfBirthCal.setTime(dateOfBirth);
        this.isCorrect = Validate(pesel);
    }

    private boolean Validate(String pesel) {
        return isEqualYear(pesel) && isEqualMonth(pesel) && isEqualDay(pesel);
    }

    private boolean isEqualYear(String pesel) {
        return (Integer.parseInt(pesel.substring(0, 2)) == dateOfBirthCal.get(Calendar.YEAR) % 100);
    }

    private boolean isEqualMonth(String pesel) {
        return (Integer.parseInt(pesel.substring(2, 4)) == dateOfBirthCal.get(Calendar.MONTH) + 1);
    }

    private boolean isEqualDay(String pesel) {
        return (Integer.parseInt(pesel.substring(4, 6)) == dateOfBirthCal.get(Calendar.DAY_OF_MONTH) + 1 - 1);
    }

    @Override
    public String toString() {
        return "DateOfBirthValidate{" +
                "dateOfBirth=" + dateOfBirth +
                ", isCorrect=" + isCorrect +
                '}';
    }

    public Date toDate() {
        System.out.println(toString());
        return dateOfBirth;
    }
}
