package Osoba;

public class Client {

    private String firmName;
    private String address;
    private String NIP;

    public Client(String firmName, String address, String NIP) {
        this.firmName = firmName;
        this.address = address;
        this.NIP = NIP;
    }

    public String getFirmName() {
        return firmName;
    }

    public String getAddress() {
        return address;
    }

    public String getNIP() {
        return NIP;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firmName='" + firmName + '\'' +
                ", address='" + address + '\'' +
                ", NIP='" + NIP + '\'' +
                '}';
    }
}
