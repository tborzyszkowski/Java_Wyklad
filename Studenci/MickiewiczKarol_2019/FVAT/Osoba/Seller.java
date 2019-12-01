package Osoba;

public class Seller extends Client {

    private String bankAccount;

    public Seller(String firmName, String address, String NIP, String bankAccount) {
        super(firmName, address, NIP);
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "Firm name='" + getFirmName() + '\'' +
                "Address: " + getAddress() + '\'' +
                "NIP: " + getNIP() + '\'' +
                "bankAccount='" + bankAccount + '\'' +
                '}';
    }
}
