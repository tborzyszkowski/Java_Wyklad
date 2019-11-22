package Osoba;

import Osoba.Klient;

public class Sprzedajacy extends Klient {

    private String bankAccount;

    public Sprzedajacy(String firmName, String address, String NIP, String bankAccount) {
        super(firmName, address, NIP);
        this.bankAccount = bankAccount;
    }

    public void wypiszDaneSprzedającego() {
        System.out.println("Dane sprzedającego: ");
        System.out.printf("Nazwa firmy: ");
        System.out.println(getFirmName());
        System.out.printf("Adres: ");
        System.out.println(getAddress());
        System.out.printf("NIP: ");
        System.out.println(getNIP());
        System.out.printf("Konto bankowe: ");
        System.out.println(bankAccount + "\n");
    }

}
