public class Main {

    public static void main(String[] args) {

        Konto konto1 = new Konto("15249000056478550192744809", 20);
        konto1.wplac(5);
        konto1.wyplac(2);

        Konto konto2 = new Konto("3249000056901057371880237", 0);

        Przelew przelew = new Przelew(konto1, konto2, 2);

        konto1.wypiszHistorie();
        konto2.wypiszHistorie();
    }

}
