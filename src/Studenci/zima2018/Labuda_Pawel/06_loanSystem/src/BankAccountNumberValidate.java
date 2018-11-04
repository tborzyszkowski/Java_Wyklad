import java.math.BigInteger;

@SuppressWarnings("WeakerAccess")
public class BankAccountNumberValidate {
    String bankAccountNumber;
    String countryCode;
    String nrbNumber;
    String modifiedBankAccountNumber;
    boolean isCorrect;

    public BankAccountNumberValidate(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
        this.countryCode = bankAccountNumber.substring(0, 2);
        this.nrbNumber = bankAccountNumber.substring(2);
        this.modifiedBankAccountNumber = modifyBankAccountNumber();
        this.isCorrect = Validate();
    }

    private boolean Validate() {
        return (modifiedBankAccountNumber.length() == 30) && (checkSum());
    }

    private String replaceCountryNumber(int c) {
        return Integer.toString(c - 55);
    }

    private String modifyBankAccountNumber() {
        String formattedBankAccountNumber = bankAccountNumber.replace(
                bankAccountNumber.substring(0, 1), replaceCountryNumber(bankAccountNumber.charAt(0))).replace(
                bankAccountNumber.substring(1, 2), replaceCountryNumber(bankAccountNumber.charAt(1)));
        formattedBankAccountNumber = formattedBankAccountNumber.replaceAll("\\D+","");
        return formattedBankAccountNumber.substring(6) + formattedBankAccountNumber.substring(0, 6);
    }


    private boolean checkSum() {
        return (new BigInteger(modifiedBankAccountNumber).mod(new BigInteger("97")).equals(new BigInteger("1")));
    }

    @Override
    public String toString() {
        return "BankAccountNumberValidate{" +
                "bankAccountNumber='" + bankAccountNumber + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", nrbNumber='" + nrbNumber + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
