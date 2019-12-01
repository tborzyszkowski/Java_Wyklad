package bank;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;


public class TransactionTest {

    @Test
    public void getAccount() {
        Client client = new Client ("Krzysztof", "Krawczyk", new Date());
        Account account = new Account(client, "1234567889");
        Transaction transaction = new Transaction(-200.0, "przelew wychdzodzacy", account);

        Assert.assertEquals(transaction.getAccount(), account);
    }

    @Test
    public void getValue() {

        Transaction transaction = new Transaction(200.0, "wpłata");

        Assert.assertEquals(transaction.getValue(), 200.0, 0.001);
    }

    @Test
    public void getDate() {
        Transaction transaction = new Transaction(200.0, "wpłata");

        Assert.assertEquals(transaction.getDate(), new Date());
    }

}