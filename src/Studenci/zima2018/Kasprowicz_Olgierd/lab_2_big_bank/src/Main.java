import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Banker banker = new Banker();

        Customer zygfryd = new Customer("Zygfryd", banker);
        Customer gracjan = new Customer("Gracjan", banker);

        Account zygfrydAccount = new Account(zygfryd, "0");
        Account gracjanAccount = new Account(gracjan, "1");

        System.out.println(zygfrydAccount.getBalance());
        System.out.println(gracjanAccount.getBalance());

        zygfryd.withdraw(gracjanAccount, 10_000_000.0);
        zygfryd.deposit(zygfrydAccount, 5.0);

        gracjan.withdraw(gracjanAccount, 6.0);

        zygfryd.transfer(zygfrydAccount, gracjanAccount, 3.0);

        System.out.println(zygfrydAccount.getBalance());
        System.out.println(gracjanAccount.getBalance());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MINUTE, -10);

        for (Transaction i: zygfrydAccount.getHistory(calendar.getTime(), new Date()))
        {
            System.out.println(i);
        }

        for (Transaction i: zygfrydAccount.getHistory(new Date(), new Date()))
        {
            System.out.println(i);
        }
    }
}
