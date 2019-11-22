import java.util.Objects;

public class Client {
    private String name;
    private String address;
    private int NIP;
    private int bank_account_number;

    public Client(String name, String address, int NIP, int bank_account_number) {
        this.name = name;
        this.address = address;
        this.NIP = NIP;
        this.bank_account_number = bank_account_number;
    }

    public int getBank_account_number() {
        return bank_account_number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return NIP == client.NIP &&
                bank_account_number == client.bank_account_number &&
                name.equals(client.name) &&
                address.equals(client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, NIP, bank_account_number);
    }

    public void setBank_account_number(int bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
