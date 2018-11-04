@SuppressWarnings("WeakerAccess")
public class Company {
    private String companyName;
    private Address address;
    private String nip;
    private String bankAccountNumber;

    Company() {
    }

    public Company(String companyName, String nip, String bankAccountNumber) {
        this();
        this.companyName = companyName;
        this.nip = nip;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Company addAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", \n\t\t\t\taddress=" + address +
                ", \n\t\t\t\tnip='" + nip + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }
}
