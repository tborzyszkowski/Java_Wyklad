import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("WeakerAccess")
public class LoanApplication {
    private String firstName;
    private String surname;
    private String pesel;
    private String nip;
    private String bankAccountNumber;
    private Date dateOfBirth;
    private String gender;

    LoanApplication(String firstName, String surname, String pesel, String nip, String bankAccountNumber, String dateOfBirth, String gender) throws Exception {
        this.firstName = new FirstNameValidate(firstName).toString();
        this.surname = new SurnameValidate(surname).toString();
        this.pesel = new PeselValidate(pesel).toString();
        this.nip = new NipValidate(nip).toString();
        this.bankAccountNumber = new BankAccountNumberValidate(bankAccountNumber).toString();
        this.dateOfBirth = new DateOfBirthValidate(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth), pesel).toDate();
        this.gender = new GenderValidate(gender, pesel).toString();
    }

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        return "\nLoanApplication " + hashCode() + " {" +
                "\nfirstName='" + firstName + '\'' +
                ", \nsurname='" + surname + '\'' +
                ", \npesel='" + pesel + '\'' +
                ", \nnip='" + nip + '\'' +
                ", \nbankAccountNumber='" + bankAccountNumber + '\'' +
                ", \ndateOfBirth=" + f.format(dateOfBirth) + '\'' +
                ", \ngender=" + gender + '}';
    }
}
