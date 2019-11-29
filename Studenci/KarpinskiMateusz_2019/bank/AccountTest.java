package bank;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;


public class AccountTest {

    @Test
    public void getClient() {
        Client client = new Client ("Krzysztof", "Krawczyk", new Date());
        Account account = new Account(client, "1234567889");

        Assert.assertEquals(account.getClient(), client);
    }

    @Test
    public void setClient() {
        Client client = new Client ("Krzysztof", "Krawczyk", new Date());
        Client client2 = new Client ("Jan", "Kowalski", new Date());
        Account account = new Account(client, "1234567889");

        account.setClient(client2);

        Assert.assertEquals(account.getClient(), client2);
    }

    @Test
    public void getAccountNumber() {
        Client client = new Client ("Krzysztof", "Krawczyk", new Date());
        Account account = new Account(client, "1234567889");

        Assert.assertEquals(account.getAccountNumber(), "1234567889");
    }

    @Test
    public void getBalance() {
        Client client = new Client ("Krzysztof", "Krawczyk", new Date());
        Account account = new Account(client, "1234567889");


        Assert.assertEquals(account.getBalance(), 0.0, 0.001);
    }

    @Test
    public void deposit() {
        Client client = new Client ("Krzysztof", "Krawczyk", new Date());
        Account account = new Account(client, "1234567889");

        account.deposit(400.0);

        Assert.assertEquals(account.getBalance(), 400.0, 0.001);
    }

    @Test
    public void withdraw() {
        Client client = new Client ("Krzysztof", "Krawczyk", new Date());
        Account account = new Account(client, "1234567889");

        account.deposit(400.0);
        account.withdraw(200.0);

        Assert.assertEquals(account.getBalance(), 200.0, 0.001);
    }

    @Test
    public void transfer() {
        Client client = new Client ("Krzysztof", "Krawczyk", new Date());
        Client client2 = new Client ("Jan", "Kowalski", new Date());
        Account account = new Account(client, "123456789");
        Account account2 = new Account(client2, "987654321");

        account.deposit(400.0);
        account.transfer(200, account2);

        Assert.assertEquals(account.getBalance(), 200.0, 0.001);
    }

    @Test
    public void accountLog() {
        Client client = new Client ("Krzysztof", "Krawczyk", new Date());
        Client client2 = new Client ("Jan", "Kowalski", new Date());
        Account account = new Account(client, "123456789");
        Account account2 = new Account(client2, "987654321");

        account.deposit(400.0);
        account.transfer(200, account2);
        account2.transfer(100, account);
        account.withdraw(100);

        account.accountLog();
    }

    @Test
    public void accountLog1() {
        Client client = new Client ("Krzysztof", "Krawczyk", new Date());
        Client client2 = new Client ("Jan", "Kowalski", new Date());
        Account account = new Account(client, "123456789");
        Account account2 = new Account(client2, "987654321");

        account.deposit(400.0);
        account.transfer(200, account2);
        account2.transfer(100, account);
        account.withdraw(100);

        Calendar cal = Calendar.getInstance();
        cal.set(2019, Calendar.NOVEMBER,28);
        Date from = cal.getTime();
        cal.set(2019, Calendar.NOVEMBER,30);
        Date to = cal.getTime();

        account.accountLog(from, to);
    }
}