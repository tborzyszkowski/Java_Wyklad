package Osoba;

public class Klient {

    private String firmName;
    private String address;
    private String NIP;

    public Klient(String firmName, String address, String NIP) {
        this.firmName = firmName;
        this.address = address;
        this.NIP = NIP;
    }

    public void wypiszDaneKlienta() {
        System.out.println("Dane klienta: ");
        System.out.printf("Nazwa firmy KLIENTA: ");
        System.out.println(firmName);
        System.out.printf("Adres: ");
        System.out.println(address);
        System.out.printf("NIP: ");
        System.out.println(NIP + "\n");
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


}
