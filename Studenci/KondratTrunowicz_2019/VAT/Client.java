import java.math.BigInteger;
import java.util.Objects;


public class Client {
    private String name;
    private String address;
    private int PESEL;
    private int NIP;
    private String bank_country;
    private int bank_account_number;
    private String client_category; //DLA STALYCH KLIENTOW ZNIZKA 10%
    public Client(String name, String address, int PESEL, int NIP, String bank_country, int bank_account_number, String client_category) {
        this.name = name;
        this.address = address;
        this.PESEL = PESEL;
        this.NIP = NIP;
        this.bank_country = bank_country;
        this.bank_account_number = bank_account_number;
        this.client_category = client_category;
    }

    public Client(String name, String address, int NIP, int bank_account_number) {
        this.name = name;
        this.address = address;
        this.NIP = NIP;
        this.bank_account_number = bank_account_number;
    }


    public void wypiszClient() {
        System.out.printf("Nazwa:");
        System.out.println(name);
        System.out.printf("Adres: ");
        System.out.println(address);
        System.out.printf("NIP: ");
        System.out.println(NIP);
        System.out.println("Bank: ");
        System.out.println(bank_account_number);
    }
    public void wypiszClientbezBanku() {
        System.out.printf("Nazwa:");
        System.out.println(name);
        System.out.printf("Adres: ");
        System.out.println(address);
        System.out.printf("NIP: ");
        System.out.println(NIP);
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

    public int getPESEL() {
        return PESEL;
    }

    public void setPESEL(int PESEL) {
        this.PESEL = PESEL;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getBank_country() {
        return bank_country;
    }

    public void setBank_country(String bank_country) {
        this.bank_country = bank_country;
    }

    public int getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(int bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    public String getClient_category() {
        return client_category;
    }

    public void setClient_category(String client_category) {
        this.client_category = client_category;
    }
}
