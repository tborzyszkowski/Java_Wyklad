import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException, InterruptedException {

        Konto konto1 = new Konto("15249000056478550192744809", 20);
        konto1.wplac(5);
        konto1.wyplac(2);

        Konto konto2 = new Konto("3249000056901057371880237", 0);

        Przelew przelew = new Przelew(konto1, konto2, 2);

        System.out.println(konto1.toString());
        System.out.println(konto2.toString());

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        /**
         *
         * Żeby szukanie po dacie miało sens, w metodzie każdej operacji dodałem metodę Thread.sleep ustawioną na 3 sekundy
         *
         */
        System.out.println("Wprowadź zakres dat w formacie 'yy-MM-dd HH:mm:ss' : ");
        System.out.println("Pierwsza data: ");
        Date date1 = format.parse(scanner.nextLine());
        System.out.println("Druga data: ");
        Date date2 = format.parse(scanner.nextLine());

        for (int i = 1; i < konto1.getHistoria().size(); i++) {
            Date tmp1 = format.parse(konto1.getHistoria().get(i).get(1));

            if ((date1.getTime() - tmp1.getTime()) < 0 && (date2.getTime() - tmp1.getTime() > 0)) {
                System.out.println(konto1.getHistoria().get(i));
            }

        }

        for (int i = 1; i < konto2.getHistoria().size(); i++) {
            Date tmp2 = format.parse(konto2.getHistoria().get(i).get(1));

            if ((date1.getTime() - tmp2.getTime()) < 0 && (date2.getTime() - tmp2.getTime() > 0)) {
                System.out.println(konto2.getHistoria().get(i));
            }
        }


    }

}
