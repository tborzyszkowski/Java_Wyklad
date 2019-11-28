import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void showHistoryFromPeriod() throws ParseException {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Owner owner2 = new Owner("Kuba", "Kowalski",new Date(2001, Calendar.APRIL, 14));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        Account account2 = new Account(owner2,"0943 2154 9583 2357 2143 2345",3456.56);
        Transfer transfer = new Transfer();
        transfer.MakeTransfer("title", account1, account2, 300.0);
        transfer.MakeTransfer("tilte",account2, account1, 50.0);
        transfer.Withdraw(account1,510.0);
        transfer.Deposit(account1,51.0);
        account1.ShowHistoryFromPeriod(new Date(2019,Calendar.NOVEMBER,20), new Date(2019,Calendar.NOVEMBER,28));
    }

    @Test
    void compareDates() throws ParseException {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        Assert.assertTrue(account1.CompareDates("2019-09-23","2019-07-12"));
    }

    @Test
    void getLog() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Owner owner2 = new Owner("Kuba", "Kowalski",new Date(2001, Calendar.APRIL, 14));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        Account account2 = new Account(owner2,"0943 2154 9583 2357 2143 2345",3456.56);
        Transfer transfer = new Transfer();
        transfer.MakeTransfer("title",account1, account2, 300.0);
        transfer.MakeTransfer("title",account2, account1, 50.0);
        transfer.Withdraw(account1,510.0);
        transfer.Deposit(account1,51.0);
        System.out.println(account1.getLog().toString());


    }


    @Test
    void getOwner() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        Assert.assertEquals(owner1,account1.getOwner());
    }

    @Test
    void setOwner() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Owner owner2 = new Owner("Kuba", "Kowalski",new Date(2001, Calendar.APRIL, 14));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        account1.setOwner(owner2);
        Assert.assertEquals(owner2,account1.getOwner());
    }

    @Test
    void getNumber() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        Assert.assertEquals("1234 1245 1245 1245 9876 4356",account1.getNumber());
    }

    @Test
    void setNumber() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        account1.setNumber("4567 2345 5788 4356 1234 1245");
        Assert.assertEquals("4567 2345 5788 4356 1234 1245",account1.getNumber());
    }

    @Test
    void getBalance() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        Assert.assertEquals(12314.12,account1.getBalance(),0.001);
    }

    @Test
    void setBalance() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Account account1 = new Account(owner1,"1234 1245 1245 1245 9876 4356",12314.12);
        account1.setBalance(123.43);
        Assert.assertEquals(123.43,account1.getBalance(),0.001);
    }
}