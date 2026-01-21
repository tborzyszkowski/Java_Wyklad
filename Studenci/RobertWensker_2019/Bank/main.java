
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd\tHH:mm:ss");
        Date data = new Date();
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Owner owner2 = new Owner("Kuba", "Kowalski",new Date(2001, Calendar.APRIL, 14));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        Account account2 = new Account(owner2,"0943 2154 9583 2357 2143 2345",3456.56);

        Transfer transfer = new Transfer();
        transfer.MakeTransfer("title",account1, account2, 300.0);
        transfer.MakeTransfer("title",account2, account1, 50.0);
       /* System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println(account2.getLog());*/
        //System.out.println(simpleDateFormat.format(new Date(2019,10,12)));
        transfer.Withdraw(account1,510.0);
        transfer.Deposit(account1,51.0);
        account1.ShowHistoryFromPeriod(new Date(2019,Calendar.NOVEMBER,20), new Date(2019,Calendar.NOVEMBER,28));
    }
}