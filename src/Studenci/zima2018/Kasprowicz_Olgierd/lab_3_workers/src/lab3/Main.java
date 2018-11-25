package lab3;

import lab3.Workers.Manager;
import lab3.Workers.WhiteCollarWorker;

public class Main {

    public static void main(String[] args) {
        Manager manago = new Manager(
            "Stefan",
            "Kowalsky",
            1956,
            2300,
            5,
            "500-ble",
            5,
            "500-ble-kom",
            500,
            "a Very Important Department"
        );

        WhiteCollarWorker gracjan = new WhiteCollarWorker(
            "Gracjan",
            "Kowalsky",
            1964,
            2300,
            5,
            "600-ble",
            5,
            manago
        );

        System.out.println(gracjan.toString());
        System.out.println(manago.toString());
    }
}
