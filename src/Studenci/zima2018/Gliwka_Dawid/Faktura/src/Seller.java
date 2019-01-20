public class Seller {
    private String name;
    private String address;
    private String nip;
    private String accountNumber;

    public Seller(String name, String address, String nip, String accountNumber) {
        this.name = name;
        this.address = address;
        this.nip = nip;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return name + ' ' +
                address + ' ' +
                "\nNIP: " + nip + ' ' +
                "\nNumer konta: " + accountNumber;
    }
}
